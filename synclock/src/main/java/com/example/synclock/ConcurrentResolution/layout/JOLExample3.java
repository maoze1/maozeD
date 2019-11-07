package com.example.synclock.ConcurrentResolution.layout;
import org.openjdk.jol.info.ClassLayout;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class JOLExample3 {
   static A a;
    public static void main(String[] args) throws Exception {
        Thread.sleep(5000);
        a= new A();
        System.out.println("befor lock");
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
        synchronized (a){
            System.out.println("lock ing");
            System.out.println(ClassLayout.parseInstance(a).toPrintable());
        }
        System.out.println("after lock");
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }
}
