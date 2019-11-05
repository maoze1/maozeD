package com.example.synclock.BasicLock.Demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 10:36
 */
public class demo3 {
    private int count = 10;

    //直接加在方法声明上，相当于是synchronized(this)
    public synchronized void test(){
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
}
