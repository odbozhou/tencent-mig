package com.tencent.mig.service.impl;

import com.tencent.mig.common.BaseDao;
import com.tencent.mig.common.BaseService;
import com.tencent.mig.common.BaseServiceImpl;
import com.tencent.mig.dao.CategoryDao;
import com.tencent.mig.model.Category;
import com.tencent.mig.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jiajia
 * @date 2018/7/7
 */
@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public BaseDao<Category> getDao() {
        return categoryDao;
    }
}
