package com.write.code.realgang.ponyTest.testFour;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-16 21:03
 **/
public class Main {
    int minRes = Integer.MAX_VALUE;
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();
        int M = reader.nextInt();
        int[] nums = new int[N];

        for (int i = 0;i < N;i++) {
            nums[i] = reader.nextInt();
        }

        int count = 0;

        backTrack(nums,N,M);

        System.out.println(minRes);
    }

    public void backTrack(int[] nums,int N,int M) {
        int sum = 0;
        for (int num:nums) {
            sum += num;
        }
        minRes = Math.min(minRes,sum);
        for (int i = 0;i < N - M + 1;i++) {
            if (nums[i] <= 0) {
                continue;
            }
            boolean isValid = true;
            for (int j = 0;j < M;j++) {
                if (nums[i + j] <= 0) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid) {
                continue;
            }
            for (int j = 0;j < M;j++) {
                nums[i + j]--;
            }

            backTrack(nums,N,M);
            for (int j = 0;j < M;j++) {
                nums[i + j]++;
            }
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
