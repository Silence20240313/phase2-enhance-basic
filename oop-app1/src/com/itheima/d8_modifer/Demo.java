package com.itheima.d8_modifer;

import java.text.DateFormat;

public class Demo {
    public static void main(String[] args) {
        //目标：掌握不同权限修饰符的作用
        Fu f = new Fu();
        //f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
