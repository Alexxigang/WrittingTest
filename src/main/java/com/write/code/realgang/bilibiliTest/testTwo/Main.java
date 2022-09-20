package com.write.code.realgang.bilibiliTest.testTwo;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-20 19:33
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();

        while (T > 0) {
            T--;
            int n = reader.nextInt();
            int[] prices = new int[n];
            for (int i = 0;i < n;i++) {
                prices[i] = reader.nextInt();
            }

            LinkedList<Integer> stack = new LinkedList<>();
            stack.addLast(prices[0]);
            System.out.println("INF ");
            for (int i = 1;i < n;i++) {
                while (!stack.isEmpty() && stack.peekLast() <= prices[i]) {
                    stack.pollLast();
                }
                if (!stack.isEmpty()) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
