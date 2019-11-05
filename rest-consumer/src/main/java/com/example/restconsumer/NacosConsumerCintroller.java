package com.example.restconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-01
 * Time: 20:06
 */
@RestController
@RequestMapping("/test")
public class NacosConsumerCintroller {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getName")
    public String getName() {
        // 提供一个http的工具
        return restTemplate.getForObject("http://nacos-provider/test/provider", String.class);
    }

    @RequestMapping("/consumer")
    public String consumer() {
        return "consumer";
    }


}