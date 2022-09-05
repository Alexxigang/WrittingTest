package com.write.code.realgang.tonghuashunTest.testOne;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-05 14:31
 **/
public class Fruit {
    static {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    public Fruit() {
        System.out.println(3);
    }
}
