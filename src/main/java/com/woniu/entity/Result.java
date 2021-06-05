package com.woniu.entity;

import java.io.Serializable;

public class Result implements Serializable {

    private final boolean success;
    private final Integer code;
    private final String message;
    private final Object data;

    public Result(ResultCode code, Object data) {
        this.success = code.isSuccess();
        this.code = code.getCode();
        this.message = code.getMessage();
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
