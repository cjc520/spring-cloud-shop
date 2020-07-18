package com.cjc.member.service;

import com.cjc.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description 会员服务接口
 * @Author cjc
 * @Date 2020/7/17 0017 15:08
 * @Version 1.0
 */
@Api(tags = "会员服务接口")
public interface MemberService {

    @ApiOperation(value = "会员调用微信服务接口")
    @GetMapping("/memberToWeiXin")
    public AppEntity memberToWeiXin();
}
