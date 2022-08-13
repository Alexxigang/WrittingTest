package com.write.code.realgang.meituanTest.testFour;

import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-13 11:59
 **/
public class Main {

    public void sulution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i < n;i++) {
            nums[i] = reader.nextInt();
        }

        int res = 0;

        int left = 0;

        while (left < nums.length - 2) {
            int right = nums.length - 1;
            while (right > left + 1) {
                int sum = nums[left] + nums[right];

                for (int i = left + 1;i < right;i++) {
                    if (3*nums[i] == sum) {
                        res++;
                    }
                }
                right--;
            }


            left++;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.sulution();
    }
}
