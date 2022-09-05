package com.write.code.realgang.tonghuashunTest.testOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-05 14:30
 **/
public class Main {
    public static Main main1 =  new Main();
    public static Main main2 = new Main();
    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");


    }

    public static void main(String[] args) {
//        Fruit fru = new Apple();
        Main main = new Main();
//        List<String> list = Arrays.asList("null","this","null");
//
//        for (String s:list) {
//            if ("null".equals(s)) {
//                list.remove(s);
//            }
//        }
//
//        System.out.println(list.get(0));
    }
}
