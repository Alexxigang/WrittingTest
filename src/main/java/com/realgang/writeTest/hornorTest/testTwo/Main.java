package com.realgang.writeTest.hornorTest.testTwo;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author ：RealGang
 * @description：
 * @date ： 2022/4/16 18:12
 */
public class Main {
    public void test() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            return b[1] - a[1];
        });

        for (int i = 0;i < n;i++) {
            int[] arr = new int[2];
            arr[0] = reader.nextInt();
            arr[1] = reader.nextInt();
            pq.offer(arr);
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()[0]);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}
