package com.lvxin.program.name;

/**
 * @author jiangxl
 * @since 2020/1/20
 */
public enum ResultCodeEnum {
    SUCCESS(200, "success"),
    FAILED(400, "failed");

    /**
     * 返回码
     */
    final int code;
    /**
     * 返回的描述信息
     */
    final String message;

    public int getCode() {
        return this.code;
    }
    public String getMessage() {
        return this.message;
    }
    private ResultCodeEnum(final int code, final String message){
        this.code = code;
        this.message = message;
    }
}
