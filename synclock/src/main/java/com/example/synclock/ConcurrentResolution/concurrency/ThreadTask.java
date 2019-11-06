package com.example.synclock.ConcurrentResolution.concurrency;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-06
 * Time: 9:35
 */
public class ThreadTask implements Runnable{

    public ThreadTask() {

    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
