package com.cjc.weixin;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 微信服务项目
 * @Author cjc
 * @Date 2020/7/17 0017 14:08
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class AppWeiXin {
    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class, args);
    }
}
