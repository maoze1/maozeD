package com.example.dubboprovider;

import com.example.dubboapi.GroupServe;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-03
 * Time: 12:59
 */
@Service(group = "111",version = "1.0.0")
public class GroupServerIMpl implements GroupServe {
    @Override
    public String getGroupName() {
        return "这是一个group分组接口";
    }
}
