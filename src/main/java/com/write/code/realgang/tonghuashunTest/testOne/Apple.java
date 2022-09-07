package com.write.code.realgang.tonghuashunTest.testOne;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-05 14:33
 **/
public class Apple extends Fruit{
    static {
        System.out.println("x");
    }

    {
        System.out.println("y");
    }

    public Apple() {
        System.out.println("z");
    }
}
