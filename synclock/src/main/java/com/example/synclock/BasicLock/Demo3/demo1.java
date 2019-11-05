package com.example.synclock.BasicLock.Demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 11:00
 */

/**
 * 问题就在于线程重入的问题，
 * 第一个线程减了个1变成9了，还没打印，第二个线程又减了个1，第三个线程又减了个1，
 * 这时候虽然第一个线程只减了一个1但是却打印出来一个7(这里情况是不一定的)
 * 可以给方法加上synchronized
 */
public class demo1 implements Runnable{

    private int count = 10;

    @Override
    public /*synchronized*/ void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }


    public static void main(String[] args) {
        demo1 demo = new demo1();
        for (int i = 0; i < 5; i++) {
            new Thread(demo,"THREAD" + i).start();
        }
    }

}