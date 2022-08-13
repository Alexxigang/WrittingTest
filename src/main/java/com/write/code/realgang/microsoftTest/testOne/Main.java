package com.write.code.realgang.microsoftTest.testOne;

import java.util.PriorityQueue;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-13 09:49
 **/
public class Main {
    public int solution(int[] A) {
        // write your code in Java 11 (Java SE 11)
        PriorityQueue<Double> pq = new PriorityQueue<Double>((a,b) -> {
            return Double.compare(b,a);
        });

        Double sum = Double.valueOf(0);
        for (int a:A) {
            sum += a;
            pq.add(Double.valueOf(a));
        }

        Double sumNow = sum;
        Double halfSum = sum / 2;
        int res = 0;

        while (sumNow > halfSum) {
            Double num = pq.poll();
            num /= 2;
            pq.add(num);
            res++;
            sumNow -= num;
        }

        return res;
    }
    public static void main(String[] args) {
        int[] array = new int[]{3,0,5};
        Main main = new Main();
        System.out.println(main.solution(array));
    }
}
