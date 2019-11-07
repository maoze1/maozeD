package com.example.synclock.BasicLock.Demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-04
 * Time: 10:36
 */
public class demo4 {
    private static int count = 10;

    //synchronize关键字修饰静态方法锁定的是类的.class文件
    //静态方法中synchronize锁定代码块，锁定的对象不能是类的实例，只能是类的.class文件。
    /**
     * synchronized
     *  每个对象的 monitor
     * synchronized(Xxx.class)
     *    获取的是类的monitor
     * synchronized(this) 和 synchronized 代码块 public synchronized void some()
     *    取的是当前实例的monitor
     * synchronized(obj)
     *     obj 和 class 的区别需要查看对象
     * */
    public synchronized static void test(){
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void test2(){
        synchronized (demo4.class){//这里不能替换成this
            count--;
        }
    }

    /**
     *  static 和class 的关系？
     *  static 和jmm 的关系？
     * */

}
