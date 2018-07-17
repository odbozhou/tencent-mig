package com.tencent.mig.service;

import com.tencent.mig.common.BaseService;
import com.tencent.mig.common.NaviPage;
import com.tencent.mig.common.Pager;
import com.tencent.mig.model.Job;

/**
 *
 * @author jiajia
 * @date 2018/7/7
 */
public interface JobService extends BaseService<Job> {

    /**
     * 获取分页招聘信息
     *
     * @param pager
     * @param job
     * @return
     */
    NaviPage<Job> getPagerList(Pager pager, Job job);

    /**
     * 搜索结果
     *
     * @param pager
     * @param key
     * @return
     */
    NaviPage<Job> search(Pager pager, String key);

    /**
     * 获取工作详情
     *
     * @param id
     * @return
     */
    Job detail(String id);

    /**
     * 获取热门职位列表
     *
     * @param pager
     * @param deptId
     * @param titlePrefix
     * @param regionId
     * @param categoryId
     * @param searchKey
     * @return
     */
    NaviPage<Job> getHotPagerList(Pager pager, Integer deptId, String titlePrefix, String regionId, String categoryId, String searchKey);
}
