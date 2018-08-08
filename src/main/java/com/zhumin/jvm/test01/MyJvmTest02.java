package com.zhumin.jvm.test01;

/**
 * 常量；（final修饰）会在 "编译" 阶段进入调用类的常量池；调用类和被调用常量的类就不再有任何关系。
 * 所以 MyJvmTest02 输出 a 的时候，并不会初始化Parent2 这个类。
 * <p>
 * 认识几种常见的 助记符
 *
 * ldc 将int string float 这些值推送到栈顶
 * bipush 将单字节常量推送到（-128 ~ 127）推送到栈顶
 * sipush 将短整形常量推送到（-128 ~ 127）推送到栈顶
 * iconst_1将整形1推送到栈顶（-1-5）可能是方便
 */
public class MyJvmTest02 {

    public static void main(String[] args) {
        System.out.println(Parent2.a);
        System.out.println(Parent2.b);
    }

}

class Parent2 {

    public static final String a = "hello world";

    public static final short b = 12;

    // 短int
    public static final int c = 128;

    public static final int d = 1;


    static {
        System.out.println("static method");
    }

}
