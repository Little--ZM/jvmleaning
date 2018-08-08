package com.zhumin.jvm.test01;

/**
 * 静态变量只有在首次 "主动调用的时候才会被初始化"
 * 但是类还是会加载
 *
 * -XX:+TraceClassLoading
 *
 */
public class MyJvmTest01 {

    public static void main(String[] args) {
        System.out.println(Child.str);
    }

}

class Parent{

    public static String str = "hello; 我是你爸爸";

    static {
        System.out.println("我是你爸爸，static 方法");
    }

}


class Child extends Parent {

    public static String str1 = "hello; 我是你儿子";

    static {
        System.out.println("我是你儿子，static 方法");
    }

}
