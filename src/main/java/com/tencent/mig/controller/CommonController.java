package com.tencent.mig.controller;/**
 * Created by jiajia on 2018/7/8.
 */

import com.tencent.mig.common.JsonResult;
import com.tencent.mig.service.MigRecruitingDataSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiajia
 * @version V1.0
 * @Description: 公共接口
 * @date 2018/7/8 2:06
 */
@RestController
@RequestMapping("common")
public class CommonController {

    @Autowired
    private MigRecruitingDataSyncService migRecruitingDataSyncService;

    @GetMapping("sync")
    public Object sync() {
        boolean syncFlag = migRecruitingDataSyncService.sync();
        Map<String, Object> map = new HashMap<>();
        if (true != syncFlag) {
            map.put("isSync", 0);
        } else {
            map.put("sync", 1);
        }
        return JsonResult.success(map);
    }
}
