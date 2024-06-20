package com.ithgf;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Title: ManagerApplication
 * @Author ithgf
 * @Package com.ithgf
 * @Date 2024/6/20 8:24
 * @description:
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // 忽略数据源自动配置
@EnableDiscoveryClient // 向注册中心注册该服务
// @EnableDubbo // 消费者不需要配置这个
@RefreshScope //配置动态刷新
public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class,args);
    }
}
