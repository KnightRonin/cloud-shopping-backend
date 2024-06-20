package com.ithgf;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Title: ManagerApplication
 * @Author ithgf
 * @Package com.ithgf
 * @Date 2024/6/20 8:24
 * @description:
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
@RefreshScope
@Slf4j

public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class,args);
    }
}
