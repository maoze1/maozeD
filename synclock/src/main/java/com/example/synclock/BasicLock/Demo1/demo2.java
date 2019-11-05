package com.example.synclock.BasicLock.Demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 10:34
 */
public class demo2 {
    private int count = 10;

    public void test(){
        //synchronized(this)锁定的是当前类的实例,这里锁定的是demo2类的实例
        synchronized (this){
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
