package com.example.synclock.BasicLock.Demo2;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 10:38
 */
public class demo1 {

    /**
     * 锁对象的改变
     * 锁定某对象o，如果o的属性发生改变，不影响锁的使用
     * 但是如果o变成另外一个对象，则锁定的对象发生改变
     * 应该避免将锁定对象的引用变成另外一个对象
     */

    Object o = new Object();

    public void test(){
        synchronized (o) {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        demo1 demo = new demo1();

        new Thread(demo :: test, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(demo :: test, "t2");

        demo.o = new Object();
        //t2能否执行？
        t2.start();
    }
}
