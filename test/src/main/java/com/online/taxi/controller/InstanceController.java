package com.online.taxi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @author zhuruihong
 * @version 1.0
 * @date 2020/3/7 11:36
 * @description
 */
@RestController
public class InstanceController {
    @Autowired
    private DiscoveryClient client;
    @RequestMapping("/getInstance/{applicationName}")
    public List<ServiceInstance> getInstance(@PathVariable String applicationName){
        client.getInstances(applicationName);
        return client.getInstances(applicationName);
    }
}
