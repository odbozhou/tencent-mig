package com.tencent.mig.service.impl;

import com.tencent.mig.common.BaseDao;
import com.tencent.mig.common.BaseServiceImpl;
import com.tencent.mig.dao.DepartmentDao;
import com.tencent.mig.model.Department;
import com.tencent.mig.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 部门信息服务
 *
 * @author zhoubo
 * @create 2018-07-11 18:59
 */
@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService{

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public BaseDao<Department> getDao() {
        return departmentDao;
    }
}
