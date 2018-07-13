/*
 *Project: SpringCloud
 *File: com.liz.springCloud.eurekaServer.controller.ProviderController.java <2018年07月09日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.liz.springCloud.eurekaService.serviceProviderBackup.controller;

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

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getProviderAppName")
    public String getProviderAppName(){
        return "服务提供者的应用名称是:" + appName + "，端口 "+ serverPort+ " =====";
    }
}
