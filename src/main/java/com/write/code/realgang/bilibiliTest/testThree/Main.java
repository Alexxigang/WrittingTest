package com.write.code.realgang.bilibiliTest.testThree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-20 20:22
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int M = reader.nextInt();

        while (M > 0) {
            M--;

            int n = reader.nextInt();
            int[] nums = new int[n];
            for (int i = 0;i < n;i++) {
                nums[i] = reader.nextInt();
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int num:nums) {
                pq.offer(num);
            }


        }
    }

    public int getMin(int num) {
        int k = 0;
        int curNum = 1;
        while (curNum <= num) {
            curNum *= 2;
            k++;
        }

        return k - 1;
    }

    public static void main(String[] args) {

    }
}
