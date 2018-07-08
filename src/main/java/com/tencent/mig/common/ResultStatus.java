package com.tencent.mig.common;/**
 * Created by jiajia on 2018/7/7.
 */

/**
 * @author jiajia
 * @version V1.0
 * @Description: 接口返回类
 * @date 2018/7/7 23:23
 */
public class ResultStatus {
    public String code;
    public String msg;

    public ResultStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
