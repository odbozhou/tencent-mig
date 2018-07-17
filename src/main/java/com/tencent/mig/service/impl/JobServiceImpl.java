package com.tencent.mig.service.impl;

import com.tencent.mig.common.*;
import com.tencent.mig.dao.JobDao;
import com.tencent.mig.model.Department;
import com.tencent.mig.model.Job;
import com.tencent.mig.service.DepartmentService;
import com.tencent.mig.service.JobService;
import com.tencent.mig.utils.NaviPageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiajia
 * @date 2018/7/7
 */
@Service
public class JobServiceImpl extends BaseServiceImpl<Job> implements JobService {

    @Autowired
    private JobDao jobDao;

    @Autowired
    private DepartmentService departmentService;

    @Override
    public BaseDao<Job> getDao() {
        return jobDao;
    }

    @Override
    public NaviPage<Job> getPagerList(Pager pager, Job job) {
        int totalRow = jobDao.getTotal(job);
        if (0 == totalRow) {
            return null;
        }
        pager.setTotalRows(totalRow);
        List<Job> list = jobDao.getPagerList(job.getRegionId(), job.getCategoryId(), job.getSearchKey(), pager.getPageStartRow(), pager.getPageRows());
        return NaviPageUtils.toNaviPage(list, pager);
    }

    @Override
    public NaviPage<Job> search(Pager pager, String searchKey) {
        int totalRow = jobDao.getSearchTotal(searchKey);
        if (0 == totalRow) {
            return null;
        }
        pager.setTotalRows(totalRow);
        List<Job> list = jobDao.search(searchKey, pager.getPageStartRow(), pager.getPageRows());
        return NaviPageUtils.toNaviPage(list, pager);
    }

    @Override
    public Job detail(String id) {
        return jobDao.detail(id);
    }

    @Override
    public NaviPage<Job> getHotPagerList(Pager pager, Department department, String searchKey) {
        int totalRow = jobDao.getHotTotal(department.getDeptId(), department.getJobPrefix(), searchKey);
        if (0 == totalRow) {
            return null;
        }
        pager.setTotalRows(totalRow);
        List<Job> list = jobDao.getHotPagerList(department.getDeptId(), department.getJobPrefix(), searchKey, pager.getPageStartRow(), pager.getPageRows());
        return NaviPageUtils.toNaviPage(list, pager);
    }
}
