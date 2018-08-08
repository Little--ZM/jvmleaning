package com.zhumin.jvm.test01;

import java.sql.SQLOutput;

/**
 * 助记符：
 *
 * anewarray: 创建引用类型数组
 *
 * newarray : 创建原始类似数组；并将其引用值压如栈顶
 *
 */

public class MyJvmTest04 {

    public static void main(String[] args) {
        // 首次主动使用的时候初始化，所以 static 代码块只会执行一次
//        Parent4 parent4 = new Parent4();

//        Parent4 parent_m = new Parent4();

        // 这行代码不会被使得Parent 代码初始化，这段代码创建的类的实例是要给数组类型，而不是Parent类型
        // 这是运行期 jvm 运行期间创建的，类似动态代理
        // 表示为： [Lcom.zhumin.jvm.test01.Parent4
        Parent4[] my = new Parent4[1];
        System.out.println(my.getClass());
        // 数组的父类型是 Object
        System.out.println(my.getClass().getSuperclass());

        // 原生
        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

    }


}

class Parent4 {
    static {
        System.out.println("初始化了");
    }
}
