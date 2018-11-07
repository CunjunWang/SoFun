package com.cunjunwang.sofun.service;

import lombok.Data;

import java.util.List;

/**
 * Created by CunjunWang on 2018/11/7.
 */
@Data
public class ServiceMultiResult<T> {
    private long total;
    private List<T> result;

    public int getResultSize() {
        if(this.result == null) {
            return 0;
        }
        return this.result.size();
    }
}
