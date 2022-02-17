package com.gupaoedu.springcloud.dubbo.springclouddubbosampleprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 简单的扫包把我要的扫进去
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudDubboSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboSampleProviderApplication.class, args);
    }

}
