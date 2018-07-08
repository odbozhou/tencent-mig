package com.tencent.mig.constant;/**
 * Created by jiajia on 2018/7/7.
 */

import com.tencent.mig.common.ResultStatus;

/**
 * @author jiajia
 * @version V1.0
 * @Description: 全局返回码
 * @date 2018/7/7 23:10
 */
public class GlobalResultStatus {
    public static final ResultStatus ERROR = new ResultStatus("100000000", "失败");
    public static final ResultStatus PARAM_MISSING = new ResultStatus("100000001", "缺少参数");
}
