/*
 *Project: SpringCloud
 *File: com.liz.springCloud.eurekaClient.EurekaClientApplication.java <2018年07月09日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.liz.springCloud.eurekaClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2018年07月09日 10时53分
 */

@SpringBootApplication
//通过注解@EnableEurekaClient 表明自己是一个eureka client
@EnableEurekaClient


//该注解是开启feign的扫描，启用feign进行远程调用
@EnableFeignClients

public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }



}
