package com.itheima.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：理解多态的好处
        //好处1：可以实现解耦合，右边对象可以随时切换，后续业务随之改变
        People p1 = new Student() ;
        p1.run();
        p1.test();//多态下存在的问题，无法直接调用子类的独有功能

        //好处2：可以使用父类类型的变量作为形参，可以接收一切子类对象
        Student s = new Student();
        go(s);

        Teacher t = new Teacher();
        go(t);
    }

    public static void go(People p){

    }
}
