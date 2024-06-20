package com.ithgf;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@EnableDubbo // 生产者开启dubbo
@RefreshScope //配置动态刷新
@MapperScan("com.ithgf.mapper")
public class GoodsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class,args);
        log.info("************ cloud-shopping-goods-service 启动成功 ***************");
    }
}
