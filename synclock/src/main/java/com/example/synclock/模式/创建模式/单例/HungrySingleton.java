package com.example.synclock.模式.创建模式.单例;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-07
 * Time: 15:57
 */
public class HungrySingleton {
    // 单例模式 -- 饿汉模式
    private static final HungrySingleton instance=new HungrySingleton(); // 在启动的话就直接生成
    private HungrySingleton(){}
    public static HungrySingleton getInstance()
    {
        return instance;
    }
}
