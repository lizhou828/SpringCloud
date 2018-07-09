/*
 *Project: SpringCloud
 *File: com.liz.springCloud.eurekaServer.controller.ProviderController.java <2018年07月09日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.liz.springCloud.eurekaServer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2018年07月09日 17时21分
 */
@RestController
public class ProviderController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/getProviderAppName")
    public String getProviderAppName(){
    System.out.println("小爱同学在此！！！！！！！！！！！！！！！！！！！！！！！！！！");
    return "你好! 我是小AI同学，编号AI1001, 我服务器的名称是:" + appName + "=====";
    }

}
