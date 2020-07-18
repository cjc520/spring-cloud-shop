package com.cjc.member.service.impl;

import com.cjc.member.feign.WeiXinServiceFeign;
import com.cjc.member.service.MemberService;
import com.cjc.weixin.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description  会员调用微信接口
 * @Author cjc
 * @Date 2020/7/17 0017 15:17
 * @Version 1.0
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;
    @Override
    public AppEntity memberToWeiXin() {
        return weiXinServiceFeign.getApp();
    }
}
