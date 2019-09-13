package com.meiying.blogserver.common;

import com.alibaba.fastjson.JSONObject;

public class ReturnApi {
    public static String CODE_SUCCESS = "0000";
    public static String CODE_FAIL = "9999";

    private String code = CODE_SUCCESS;
    private Object data;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
