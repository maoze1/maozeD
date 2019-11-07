package com.example.synclock.ConcurrentResolution.layout;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import static java.lang.System.out;
import static java.lang.Thread.sleep;

public class JOLExample2 {
    public static void main(String[] args) throws Exception {
        sleep(5000); // 为什么要出现 5s 延迟
        A a= new A();
        out.println("befor hash");
        //没有计算HASHCODE之前的对象头
        out.println(ClassLayout.parseInstance(a).toPrintable());  //  001 无锁
        //JVM 计算的hashcode
        synchronized (a){
            out.println(ClassLayout.parseInstance(a).toPrintable());
        }
        out.println("jvm------------0x"+Integer.toHexString(a.hashCode()));
        HashUtil.countHash(a);
        //当计算完hashcode之后，我们可以查看对象头的信息变化
        out.println("after hash");
        out.println(ClassLayout.parseInstance(a).toPrintable()); // cpu 的小端模式  地址是倒叙的

    }
}
