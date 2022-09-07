package com.write.code.realgang.zhaoyinTest;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-05 19:34
 **/
public class Main {
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        Integer[] nums = new Integer[n];
        Integer[] numsCopy = new Integer[n];
        for (int i = 0;i < n;i++) {
            nums[i] = reader.nextInt();
            numsCopy[i] = nums[i];
        }
        int k = reader.nextInt();

        Arrays.sort(numsCopy);
        int mid = 0;
        if (n % 2 == 1) {
            mid = numsCopy[n / 2];
        } else {
            mid = (numsCopy[n / 2] + numsCopy[n / 2 - 1]) / 2;
        }
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[n - k + 1];

        int index = 0;
        int[] midDist = new int[n];
        for (int i = 0;i < n;i++) {
            midDist[i] = Math.abs(nums[i] - mid);
        }
        for (int i = 0;i < k;i++) {
            if (dq.isEmpty()) {
                dq.offerLast(i);
                continue;
            }
            while (!dq.isEmpty() && midDist[i] > midDist[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        res[index] = nums[dq.peekFirst()];
        index++;

        for (int i = k;i < n;i++) {
            if (midDist[dq.peekFirst()] == midDist[i - k]) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && midDist[i] > midDist[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            res[index] = nums[dq.peekFirst()];
            index++;
        }

        for (int i = 0;i < res.length - 1;i++) {
            System.out.printf(res[i] + " ");
        }
        System.out.println(res[n - k]);

    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
