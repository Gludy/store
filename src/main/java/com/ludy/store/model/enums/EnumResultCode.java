package com.ludy.store.model.enums;

public enum EnumResultCode {

    /**
     * 处理成功
     */
    SUCCESS(100),
    /**
     * 处理失败
     */
    FAIL(200);

    private Integer code;

    EnumResultCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
