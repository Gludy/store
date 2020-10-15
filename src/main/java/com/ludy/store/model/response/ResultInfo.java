package com.ludy.store.model.response;

import com.ludy.store.model.enums.EnumResultCode;
import lombok.Data;

/**
 * controller返回实体
 *
 * @param <T>
 */
@Data
public class ResultInfo<T> {
    private T data;
    private Boolean success;
    private String message;
    private Integer code;

    public static <T> ResultInfo<T> success(T data) {
        return new ResultInfo<>(data, true, null, EnumResultCode.SUCCESS.getCode());
    }

    public static <T> ResultInfo<T> fail(T data, String errMsg) {
        return new ResultInfo<>(data, false, errMsg, EnumResultCode.FAIL.getCode());
    }


    private ResultInfo(T data, Boolean success, String message, Integer code) {
        this.success = success;
        this.data = data;
        this.message = message;
        this.code = code;
    }


}
