package com.tencent.mig.common;/**
 * Created by jiajia on 2018/7/7.
 */


import java.util.HashMap;
import java.util.Map;

/**
 * @author jiajia
 * @version V1.0
 * @Description: 接口json返回对象
 * @date 2018/7/7 23:09
 */
public class JsonResult {

    public static Object success() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        return map;
    }

    public static Object success(Object o) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("data", o);
        return map;
    }

    public static Object success(NaviPage naviPage) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("data", naviPage);
        return map;
    }

    public static Object fail(ResultStatus resultStatus) {
        return resultStatus;
    }
}
