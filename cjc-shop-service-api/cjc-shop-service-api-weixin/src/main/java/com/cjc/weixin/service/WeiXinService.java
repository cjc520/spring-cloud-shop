package com.cjc.weixin.service;

import com.cjc.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description 微信服务接口
 * @Author cjc
 * @Date 2020/7/17 0017 13:39
 * @Version 1.0
 */

@Api(tags = "微信服务接口")
public interface WeiXinService {



    /**
     * 获取应用接口
     * @return
     */
    @ApiOperation(value = "微信应用服务接口")
    @GetMapping("/getApp")
    public AppEntity getApp();
}
