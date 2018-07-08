package com.tencent.mig.service.impl;

import com.tencent.mig.common.BaseDao;
import com.tencent.mig.common.BaseService;
import com.tencent.mig.common.BaseServiceImpl;
import com.tencent.mig.dao.RegionDao;
import com.tencent.mig.model.Region;
import com.tencent.mig.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jiajia
 * @date 2018/7/7
 */
@Service
public class RegionServiceImpl extends BaseServiceImpl<Region> implements RegionService {

    @Autowired
    private RegionDao regionDao;

    @Override
    public BaseDao<Region> getDao() {
        return regionDao;
    }
}
