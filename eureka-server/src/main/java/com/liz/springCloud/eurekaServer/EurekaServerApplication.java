package com.liz.springCloud.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//ֻ��Ҫһ��ע��@EnableEurekaServer�����ע����Ҫ��springboot���̵�����application���ϼ�@EnableEurekaServer,��������һ������ע������
//eureka server ���н���ģ���������,����������ʣ�http://localhost:8761 ,
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
