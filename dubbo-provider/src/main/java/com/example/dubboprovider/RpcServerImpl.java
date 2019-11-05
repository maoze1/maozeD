package com.example.dubboprovider;


import com.example.dubboapi.RpcServe;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-03
 * Time: 0:02
 */
@Service
public class RpcServerImpl implements RpcServe {

    @Override
    public String getName() {
        return "这是一个rpc接口";
    }
}
