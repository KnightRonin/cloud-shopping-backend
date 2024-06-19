package com.ithgf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;

/**
 * @Title: GoodsServiceApplication
 * @Author ithgf
 * @Package com.ithgf
 * @Date 2024/6/20 5:43
 * @description:
 */

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient // 向注册中心注册服务
public class GoodsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class,args);
    }
}
