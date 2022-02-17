package com.gupaoedu.springcloud.dubbo.springclouddubbosampleprovider.services;

import com.gupaoedu.springcloud.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 简单的实现
 **/

@Service
public class SayHelloServiceImpl implements ISayHelloService{

    @Override
    public String sayHello(String msg) {
        return "Hello, GuPaoEdu.cn";
    }
}
