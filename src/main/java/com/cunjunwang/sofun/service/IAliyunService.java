package com.cunjunwang.sofun.service;

import java.io.File;
import java.io.InputStream;

/**
 * Created by CunjunWang on 2018/11/6.
 */

public interface IAliyunService {

    void uploadFile(File file);

    void uploadFile(InputStream inputStream);

    void deleteFile(String key);
}
