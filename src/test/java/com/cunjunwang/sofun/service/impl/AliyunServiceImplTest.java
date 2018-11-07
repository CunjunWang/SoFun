package com.cunjunwang.sofun.service.impl;

import com.cunjunwang.sofun.SoFunApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * Created by CunjunWang on 2018/11/6.
 */
public class AliyunServiceImplTest extends SoFunApplicationTest {

    @Autowired
    private AliyunServiceImpl aliyunService;

    @Test
    public void testUploadFile() {
        String filePath = "/Users/CunjunWang/Downloads/test.jpg";
        aliyunService.uploadFile(new File(filePath));
    }
}