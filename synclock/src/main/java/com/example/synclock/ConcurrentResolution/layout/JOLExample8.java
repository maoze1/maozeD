package com.example.synclock.ConcurrentResolution.layout;
import org.openjdk.jol.info.ClassLayout;

import static java.lang.System.out;

public class JOLExample8 {
   static A a;
    public static void main(String[] args) throws Exception {
        Thread.sleep(5000);
        a= new A();
        a.hashCode();
        out.println("befor lock");
        out.println(ClassLayout.parseInstance(a).toPrintable());
        synchronized (a){
            out.println("lock ing");
            out.println(ClassLayout.parseInstance(a).toPrintable());
        }
        out.println("after lock");
        out.println(ClassLayout.parseInstance(a).toPrintable());


        B b= new B();
        out.println("befor lock");
        out.println(ClassLayout.parseInstance(b).toPrintable());
        synchronized (b){
            out.println("lock ing");
            out.println(ClassLayout.parseInstance(b).toPrintable());
        }
        out.println("after lock");
        out.println(ClassLayout.parseInstance(b).toPrintable());
    }
}
