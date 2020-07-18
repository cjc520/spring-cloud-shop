package com.cjc.member.feign;


import com.cjc.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;


/**
 * @Description feign客户端接口
 * @Author cjc
 * @Date 2020/7/17 0017 15:27
 * @Version 1.0
 */
@FeignClient("app-cjc-weixin")
public interface WeiXinServiceFeign extends WeiXinService {


}
