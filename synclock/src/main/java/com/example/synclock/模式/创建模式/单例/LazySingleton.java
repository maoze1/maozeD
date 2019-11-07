package com.example.synclock.模式.创建模式.单例;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-07
 * Time: 15:34
 */
public class LazySingleton {
       // 懒加载 - 懒汉模式
        private static volatile LazySingleton instance=null;    //保证 instance 在所有线程中同步
        private LazySingleton(){}    //private 避免类在外部被实例化
        public static synchronized LazySingleton getInstance()
        {
            //getInstance 方法前加同步
            if(instance==null)
            {
                instance=new LazySingleton();
            }
            return instance;
        }


}
