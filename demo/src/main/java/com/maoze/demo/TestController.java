package com.maoze.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-10-31
 * Time: 9:19
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Value("${full.name}")
    private String fullName;

    @RequestMapping("/getName")
    public String getName(){
        return new Date().toString();
    }

    @RequestMapping("/fullName")
    public String fullName(){
        return fullName;
    }

}
