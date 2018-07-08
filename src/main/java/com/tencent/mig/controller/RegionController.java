package com.tencent.mig.controller;/**
 * Created by jiajia on 2018/7/7.
 */

import com.tencent.mig.common.JsonResult;
import com.tencent.mig.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiajia
 * @version V1.0
 * @Description: 地区接口
 * @date 2018/7/7 23:46
 */
@RestController
@RequestMapping("region")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("getAll")
    public Object getAll() {
        return JsonResult.success(regionService.getAll());
    }
}
