package com.example.restprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-01
 * Time: 20:03
 */
@RestController
@RequestMapping("/test")
public class NacosProviderController {


    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/provider")
    public String getProvider(){
        return "这是provider";
    }

    @RequestMapping("/getName")
    public String getName(){
        return restTemplate.getForObject("http://nacos-consumer/test/consumer",String.class);
    }




}
