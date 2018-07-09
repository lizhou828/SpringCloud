/*
 *Project: SpringCloud
 *File: com.liz.springCloud.eurekaClient.service.TestService.java <2018年07月09日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.liz.springCloud.eurekaClient.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2018年07月09日 17时12分
 */

//@FeignClient注解中的stores属性可以是一个任意字符串，如果与Eureka组合使用，则stores应为Eureka中的服务名，Feign用它来创建一个Ribbon负载均衡器。也可以通过url属性来指定一个地址，可以是完整的URL，也可以是一个主机名。
//标注了@FeignClient注解的接口，在ApplicationContext中的Bean实例名是这个接口的全限定名，同时这个Bean还有一个别名，为Bean名+FeignClient。

//Feign
//1、自定义配置时，@Configuration和@Component所在包不应该重叠
//2、@FeignClient所在的接口中，不支持@GetMapping等组合注解
//3、使用@PathVariable时，需要制定其value
//4、Feign暂时不支持复杂对象作为一个参数
@FeignClient(value = "test-service",url = "")
public interface TestService {

    @RequestMapping(value = "/getProviderAppName" ,method = RequestMethod.GET)
    String getProviderAppName();
}
