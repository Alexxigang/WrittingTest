package com.realgang.writeTest.testThree;

import java.util.*;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-03-25 10:13
 **/
public class Main {

    public void test() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[][] lines = new int[n][3];
        Set<Double> countSet = new HashSet<>();
        Map<Double,Integer> countMap = new HashMap<>();
        for (int i = 0;i < n;i++) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            int c = reader.nextInt();
            // 这样为保持3位
            Double d = new Double(Math.round(a*1000/b)/1000.0);
            countMap.put(d,countMap.getOrDefault(d,0) + 1);
            countSet.add(d);
        }
        int res = 1;


        System.out.println(countSet.size());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}
