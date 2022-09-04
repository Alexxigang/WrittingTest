package com.write.code.realgang.redbookTest.testTwo;

import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-04 16:40
 **/
public class Main {
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i < nums.length;i++) {
            nums[i] = reader.nextInt();
        }

        int nearIndex = 0;
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0;i < n;i++) {
            if (Math.abs(Math.abs(nums[i]) - 7) < minAbs) {
                minAbs = Math.abs(Math.abs(nums[i]) - 7);
                nearIndex = i;
            }
        }

        int count = 0;
        count += minAbs;
        int zeroNum = 0;
        int minusNum = 0;

        for (int i = 0;i < n;i++) {
            if (i == nearIndex) {
                if (nums[i] < 0) {
                    minusNum++;
                }
                continue;
            }

            if (nums[i] < 0) {
                minusNum++;
            }
            if (nums[i] == 0) {
                zeroNum++;
            }

            count += Math.abs(Math.abs(nums[i]) - 1);
        }

    }

    public static void main(String[] args) {

    }
}
