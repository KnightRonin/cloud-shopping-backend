package com.ithgf;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Title: AdminApplication
 * @Author ithgf
 * @Package com.ithgf
 * @Date 2024/6/20 16:47
 * @description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
@RefreshScope
@MapperScan("com.ithgf.mapper")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
