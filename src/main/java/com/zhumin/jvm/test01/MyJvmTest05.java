package com.zhumin.jvm.test01;

import java.util.Random;

/**
 * 这句话是有疑问 ：接口的初始化，不要求初始化其父接口
 * 因为一开始并没有初始化子接口，因为子接口那个值 a, 是final的，并且是编译器可以确定的，
 * 这个时候删除 父子两个接口的 class 文件都可以顺利运行
 *
 * 但如果改成 c，编译器无法确定，则子接口需要初始化，父接口会被初始化（因为父接口删了class文件会报错）
 */

public class MyJvmTest05 {

    public static void main(String[] args) {
        System.out.println(Child5.a);
    }

}

interface Parent5 {
    public static final int b = 6;
}

interface Child5 extends Parent5 {

    // 接口中的变量默认都是 static 和 final
//    public static final int c = new Random().nextInt(2);
    public static final int a = 1;

}

