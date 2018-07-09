package com.liz.springCloud.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//只需要一个注解@EnableEurekaServer，这个注解需要在springboot工程的启动application类上加@EnableEurekaServer,就能启动一个服务注册中心
//eureka server 是有界面的，启动工程,打开浏览器访问：http://localhost:8761 ,
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
