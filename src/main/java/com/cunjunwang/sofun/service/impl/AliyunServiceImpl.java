package com.cunjunwang.sofun.service.impl;

import com.aliyun.oss.OSSClient;
import com.cunjunwang.sofun.service.IAliyunService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;

/**
 * Created by CunjunWang on 2018/11/6.
 */
@Service
@PropertySource("classpath:application-private.properties")
public class AliyunServiceImpl implements IAliyunService, InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(AliyunServiceImpl.class);

    @Value("${aliyun.endpoint}")
    private String endpoint;

    @Value("${aliyun.accessKeyId}")
    private String accessKeyId;

    @Value("${aliyun.accessKeySecret}")
    private String accessKeySecret;

    private OSSClient ossClient;

    @Value("${aliyun.bucket.name}")
    private String bucketName;

    /**
     * 构造Oss客户端Singleton
     *
     * @return
     */
    private OSSClient getOSSClient() {
        if (ossClient != null) {
            logger.info("OSS客户端已存在！");
            return ossClient;
        }
        logger.info("开始构造OSS客户端.");
        ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        return ossClient;
    }

    @Override
    public void uploadFile(File file) {
        this.getOSSClient().putObject(bucketName, file.getName(), file);
    }

    @Override
    public void uploadFile(InputStream inputStream) {

    }

    @Override
    public void deleteFile(String key) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
