package com.example.synclock.BasicLock.Demo2;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 10:41
 */
public class demo3 {

    /**
     * 同步代码快中的语句越少越好
     * 比较test1和test2
     * 业务逻辑中只有count++这句需要sync，这时不应该给整个方法上锁
     * 采用细粒度的锁，可以使线程争用时间变短，从而提高效率
     */

    int count = 0;

    public synchronized void test1(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        count ++;

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void test2(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            count ++;
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
