package com.woniu.entity;

public enum ResultCode {

    SUCCESS(true,200,"成功"),
    FAILURE(false,400,"失败"),

    VERIFICATION_CODE_SEND(true,210,"验证码已发送"),
    REQUEST_TOO_FREQUENT(false,402,"请求过于频繁，请您稍后再试"),
    VERIFICATION_SUCCESS(true,201,"验证成功"),
    VERIFICATION_FAILURE(false,401,"验证失败"),
    VERIFICATION_CODE_INVALID(false,403,"验证码无效，已过期或不存在"),

    REGISTRATION_SUCCESS(true,202,"注册成功"),
    REGISTRATION_FAILURE(false,405,"注册失败"),

    LOGIN_SUCCESS(true,203,"登录成功"),
    LOGIN_FAILURE(false,406,"登录失败");

    private final boolean success;
    private final Integer code;
    private final String message;

    ResultCode(boolean success,Integer code,String message) {
        this.success = success;
        this.code = code;
        this.message = message;
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
}
