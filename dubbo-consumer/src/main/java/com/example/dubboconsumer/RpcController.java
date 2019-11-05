package com.example.dubboconsumer;


import com.example.dubboapi.GroupServe;
import com.example.dubboapi.RpcServe;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-03
 * Time: 0:12
 */
@RestController
@RequestMapping("/test")
public class RpcController {

    @Reference
    RpcServe rpcServe;

    @Reference(group = "111",version = "1.0.0")
    GroupServe groupServe;

    @RequestMapping("/getName")
    public String getName(){
        return rpcServe.getName();
    }

    @RequestMapping("/getGroupName")
    public String getGroupName(){
        return groupServe.getGroupName();
    }

}
