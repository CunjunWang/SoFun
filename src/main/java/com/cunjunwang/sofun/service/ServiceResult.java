package com.cunjunwang.sofun.service;

import lombok.Data;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
public class ServiceResult<T> {

    private boolean success;

    private String message;

    private T result;

    public ServiceResult(boolean success) {
        this.success = success;
    }

    public ServiceResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ServiceResult(boolean success, String message, T result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }
}
