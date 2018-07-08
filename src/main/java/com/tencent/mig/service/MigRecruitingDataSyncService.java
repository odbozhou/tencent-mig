package com.tencent.mig.service;/**
 * Created by jiajia on 2018/7/7.
 */

import com.alibaba.fastjson.JSONArray;
import com.tencent.mig.model.Category;
import com.tencent.mig.model.Job;
import com.tencent.mig.model.JobDetail;
import com.tencent.mig.model.Region;
import com.tencent.mig.utils.HttpClientUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jiajia
 * @version V1.0
 * @Description: 招聘信息数据同步
 * @date 2018/7/7 10:57
 */
@Service
public class MigRecruitingDataSyncService {

    private static final Logger log = LoggerFactory.getLogger(MigRecruitingDataSyncService.class);

    /**
     * 招聘数据url
     */
    public static final String RECRUITING_DATA_URL = "https://hr.tencent.com/js/mig.js";
    /**
     * 数据json节点数量
     */
    public static final int NODE_NUM = 3;

    @Autowired
    private RegionService regionService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private JobService jobService;

    @Autowired
    private JobDetailService jobDetailService;

    @Transactional(rollbackFor = Exception.class)
    public boolean sync() {
        String recruitingDataJson = HttpClientUtils.get(RECRUITING_DATA_URL);
        log.debug("recruitingDataJson: {}", recruitingDataJson);
        if (StringUtils.isEmpty(recruitingDataJson)) {
            log.error("recruitingDataJson is null");
            return false;
        }
        JSONArray jsonArray = JSONArray.parseArray(recruitingDataJson);
        int size = jsonArray.size();
        if (size < NODE_NUM) {
            log.error("lake of data note, current note num: {}", size);
            return false;
        }
        //地区数据
        Map<String, Object> regionMap = jsonArray.getJSONObject(0).getInnerMap();
        List<Region> insertRegions = new ArrayList<>(32);
        for (Map.Entry<String, Object> entry : regionMap.entrySet()) {
            String key = entry.getKey();
            String value = (String) entry.getValue();
            insertRegions.add(new Region(key, value));
            log.info("key: {}, value: {}", key, entry.getValue());
        }
        regionService.deleteAll();
        regionService.saveList(insertRegions);

        //职位类别数据
        Map<String, Object> jobCategoryMap = jsonArray.getJSONObject(1).getInnerMap();
        List<Category> insertCategorys = new ArrayList<>(32);
        for (Map.Entry<String, Object> entry : jobCategoryMap.entrySet()) {
            String key = entry.getKey();
            String value = (String) entry.getValue();
            insertCategorys.add(new Category(key, value));
            log.info("key: {}, value: {}", entry.getKey(), entry.getValue());
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        categoryService.deleteAll();
        categoryService.saveList(insertCategorys);

        //职位信息数据
        JSONArray jobJsonArray = jsonArray.getJSONArray(2);
        if (null == jobJsonArray) {
            log.error("jobJsonArray is null");
            return false;
        }
        List<Job> jobs = jobJsonArray.toJavaList(Job.class);
        List<JobDetail> jobDetails = new ArrayList<>(jobs.size());
        for (Job job : jobs) {
            jobDetails.add(new JobDetail(job.getId(), job.getRequirment(), job.getResponsibility()));
            job.setRegionName((String) regionMap.get(job.getRegionId()));
            job.setCategoryName((String) jobCategoryMap.get(job.getCategoryId()));
        }
        jobService.deleteAll();
        jobDetailService.deleteAll();
        jobService.saveList(jobs);
        jobDetailService.saveList(jobDetails);

        System.out.println(recruitingDataJson);
        log.debug(recruitingDataJson);
        return true;
    }
}
