package com.zhumin.jvm.test01;

import java.util.UUID;

/**
 * 这个例子中区别是 常量 是否能在编译器 就知道，如果知道，则就会更改
 */

public class MyJvmTest03 {

    public static void main(String[] args) {
        System.out.println(Parent3.str);
    }

}

class Parent3 {

    public static final String str = UUID.randomUUID().toString();


    static {
        System.out.println("你猜我会不会执行");
    }

}
