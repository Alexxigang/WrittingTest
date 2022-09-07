package com.write.code.realgang.tonghuashunTest.testOne;

/**
 * @description: father
 * @author: RealGang
 * @create: 2022-09-05 19:16
 **/
public class Father {
    public static void main(String[] args) {
        Father father = new Father();
        Child child = new Child();
        try {
            father.test();
            child.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test() throws RuntimeException {
        System.out.println("father");
    }
}
