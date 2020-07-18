package com.cjc.weixin.entity;

import lombok.Data;

/**
 * @Author cjc
 * @Date 2020/7/17 0017 13:25
 * @Version 1.0
 */
@Data
public class AppEntity {

    private String appId;

    private String appName;

    public AppEntity(String appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }
    public AppEntity(){}

}
