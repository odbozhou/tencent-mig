package com.tencent.mig.service.impl;

import com.tencent.mig.common.BaseDao;
import com.tencent.mig.common.BaseService;
import com.tencent.mig.common.BaseServiceImpl;
import com.tencent.mig.dao.JobDetailDao;
import com.tencent.mig.model.JobDetail;
import com.tencent.mig.service.JobDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jiajia
 * @date 2018/7/7
 */
@Service
public class JobDetailServiceImpl extends BaseServiceImpl<JobDetail> implements JobDetailService {

    @Autowired
    private JobDetailDao jobDetailDao;

    @Override
    public BaseDao<JobDetail> getDao() {
        return jobDetailDao;
    }
}
