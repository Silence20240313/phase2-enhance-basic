package com.itheima.d3_final;

public class Test {
    public static void main(String[] args) {
        //目标：认识final的作用
        //3.final可以修饰变量：总规则：只能赋值一次
    }
}

//1.final修饰类，类不能被继承了
final class A{}
//class B extends A{}

//2.final修饰方法，方法不能被重写了
class C{
    public final void test(){
    }
}
class D extends C{
    //   @Override
    // public void test(){
    //
    //  }
}
