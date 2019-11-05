package com.example.synclock.BasicLock.Demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 11:01
 */
public class demo2 implements Runnable{

    private int count = 10;

    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //相比较Demo1，这里是new了五个对象，每个线程对应都拿到各自的锁标记，可以同时执行。
            demo2 demo = new demo2();
            new Thread(demo,"THREAD" + i).start();
        }
    }

}
