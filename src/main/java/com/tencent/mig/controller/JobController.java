package com.tencent.mig.controller;/**
 * Created by jiajia on 2018/7/7.
 */

import com.tencent.mig.common.JsonResult;
import com.tencent.mig.common.NaviPage;
import com.tencent.mig.common.Pager;
import com.tencent.mig.constant.GlobalResultStatus;
import com.tencent.mig.model.Department;
import com.tencent.mig.model.Job;
import com.tencent.mig.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiajia
 * @version V1.0
 * @Description: 职位信息接口
 * @date 2018/7/7 23:51
 */
@RestController
@RequestMapping("job")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("getPagerList")
    public Object getPagerList(Pager pager, Job job) {
        NaviPage<Job> jobNaviPage = jobService.getPagerList(pager, job);
        return JsonResult.success(jobNaviPage);
    }

    @GetMapping("search")
    public Object search(Pager pager, String searchKey) {
        NaviPage<Job> jobNaviPage = jobService.search(pager, searchKey);
        return JsonResult.success(jobNaviPage);
    }

    @GetMapping("getHotPagerList")
    public Object getHotPagerList(Pager pager, Integer deptId, String titlePrefix, String regionId, String categoryId, String searchKey) {
        NaviPage<Job> jobNaviPage = jobService.getHotPagerList(pager, deptId, titlePrefix, regionId, categoryId, searchKey);
        return JsonResult.success(jobNaviPage);
    }

    @GetMapping("detail")
    public Object detail(String id) {
        if (StringUtils.isEmpty(id)) {
            return JsonResult.fail(GlobalResultStatus.PARAM_MISSING);
        }
        Job job = jobService.detail(id);
        return JsonResult.success(job);
    }
}
