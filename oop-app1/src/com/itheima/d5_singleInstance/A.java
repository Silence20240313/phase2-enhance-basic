package com.itheima.d5_singleInstance;

public class A {
    //2.定义一个类变量，记住类的一个对象
    private static A a = new A();

    //1.必须私有类的构造器
    private A(){

    }

    //3.定义一个类方法，返回类的对象
    public static A getObject(){
        return a;
    }
}
