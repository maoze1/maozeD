package com.example.synclock.BasicLock.Demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 10:33
 */
public class demo1 {

    /**
     * synchronized关键字
     * synchronized关键字锁定的是对象不是代码块,demo中锁的是object对象的实例
     * 锁定的对象有两种:1.类的实例 2.类对象(类锁)
     * 加synchronized关键字之后不一定能实现线程安全，具体还要看锁定的对象是否唯一。
     */
    private int count = 10;
    private Object object = new Object();

    public void test(){
        synchronized (object){
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
