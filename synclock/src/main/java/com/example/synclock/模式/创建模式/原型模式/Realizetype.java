package com.example.synclock.模式.创建模式.原型模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-07
 * Time: 15:59
 */
public class Realizetype {
    Realizetype()
    {
        System.out.println("具体原型创建成功！");
    }
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
    // 实例的克隆
    public static void main(String[] args)throws CloneNotSupportedException
    {
        Realizetype obj1=new Realizetype();
        Realizetype obj2=(Realizetype)obj1.clone();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println("obj1==obj2?"+(obj1==obj2));
    }
}
