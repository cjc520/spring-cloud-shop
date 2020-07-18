package com.cjc.weixin.service.impl;

import com.cjc.weixin.service.WeiXinService;
import com.cjc.weixin.entity.AppEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cjc
 * @Date 2020/7/17 0017 13:52
 * @Version 1.0
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {

    @Override
    public AppEntity getApp() {
        return new AppEntity("陈俊丞","23");
    }
}
