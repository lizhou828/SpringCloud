/*
 *Project: SpringCloud
 *File: com.liz.SpringCloud.eureka.registerCenter.ApplicationMaster.java <2018年07月10日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.liz.SpringCloud.eureka.registerCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2018年07月10日 16时43分
 */
//只需要一个注解@EnableEurekaServer，这个注解需要在springboot工程的启动application类上加@EnableEurekaServer,就能启动一个服务注册中心
//eureka server 是有界面的，启动工程,打开浏览器访问：http://localhost:7000 ,
@EnableEurekaServer
@SpringBootApplication
public class ApplicationMaster {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMaster.class, args);
    }

}