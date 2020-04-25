package com.jdr.manage.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author grt
 * @date 2020-04-18
 */
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
public class OSSConfig {


    private String assessKey;

    private String secretKey;

    private String bucketName;

    private String endPoint;

    public String getAssessKey() {
        return assessKey;
    }

    public void setAssessKey(String assessKey) {
        this.assessKey = assessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }
}
