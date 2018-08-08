package com.zhumin.jvm.test01;

/**
 * 用来理解JVM初始化加载的机制
 *
 * 从上到下的初始化
 */
public class MyJvmTest06 {

    public static void main(String[] args) {
        Sigleton sigleton = Sigleton.getSigleton();
        System.out.println(Sigleton.counter1);
        System.out.println(Sigleton.counter2);
    }

}

class Sigleton {
    public static int counter1 = 1;


    private static Sigleton sigleton = new Sigleton();

    private Sigleton() {
        counter1 ++;
        counter2 ++;  // 准备阶段的意义： 给静态变量赋默认值

        System.out.println(counter1);
        System.out.println(counter2);
    }

    // 按照顺序初始化
    public static int counter2=0;

    public static Sigleton getSigleton() {
        return sigleton;
    }
}
