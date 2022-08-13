package com.write.code.realgang.microsoftTest.testThree;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-13 09:49
 **/
public class Main {

    public int solution(int[] A, int X, int Y) {
        // write your code in Java 11 (Java SE 11)
        int minCost = Integer.MAX_VALUE;

        for (int i = 0;i < A.length;i++) {
            int costNow = 0;
            int len = 0;
            for (int j = i;len < X && j < A.length;j += Y) {
                costNow += A[j];
                len++;
            }
            if (len == X) {
                minCost = Math.min(minCost,costNow);
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution(new int[]{10,3,4,7},2,3));
        System.out.println(main.solution(new int[]{4,2,3,7},2,2));
    }
}
