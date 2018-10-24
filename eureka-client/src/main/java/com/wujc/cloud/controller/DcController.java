package com.wujc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wujc
 * @ClassName DcController
 * @Description: TODO
 * @create 2018-10-22 19:14
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services:" + discoveryClient.getServices();
        System.out.println("客户端1"+services);
        return services;
    }
}
