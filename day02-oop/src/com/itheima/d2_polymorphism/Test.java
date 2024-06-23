package com.itheima.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：理解多态的好处
        //好处1：可以实现解耦合，右边对象可以随时切换，后续业务随之改变
        People p1 = new Student();
        p1.run();

    }
}
