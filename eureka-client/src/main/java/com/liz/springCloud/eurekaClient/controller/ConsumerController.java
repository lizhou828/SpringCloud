/*
 *Project: SpringCloud
 *File: com.liz.springCloud.eurekaClient.controller.ConsumerController.java <2018年07月09日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.liz.springCloud.eurekaClient.controller;

import com.liz.springCloud.eurekaClient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2018年07月09日 17时18分
 */
@RestController
public class ConsumerController {

    @Value("${server.port}")
    String port;

    @Autowired
    TestService testService;

    @RequestMapping("/feign-consumer")
    public String home(@RequestParam String name) {
//        String providerAppName =  testService.getProviderAppName();
                String providerAppName =  "";
        return "hi "+name+",i am from port:" +port + ",providerAppName is " + providerAppName;
    }
}
