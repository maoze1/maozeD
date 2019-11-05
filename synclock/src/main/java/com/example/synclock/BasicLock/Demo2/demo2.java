package com.example.synclock.BasicLock.Demo2;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 10:40
 */
public class demo2 {


    /**
     * 不要以字符串常量作为锁定的对象
     * 在下面，test1和test2其实锁定的是同一个对象
     */
    String s1 = "hello";
    String s2 = "hello";

    public void test1(){
        synchronized (s1) {
            System.out.println("t1 start...");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 end...");
        }
    }

    public void test2(){
        synchronized (s2) {
            System.out.println("t2 start...");
        }
    }

    public static void main(String[] args) {
        demo2 demo = new demo2();
        new Thread(demo :: test1,"test1").start();
        new Thread(demo :: test2,"test2").start();
    }
}
