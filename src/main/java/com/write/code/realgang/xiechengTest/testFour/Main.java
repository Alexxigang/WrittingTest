package com.write.code.realgang.xiechengTest.testFour;

import java.util.Random;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-10-18 19:49
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int x = reader.nextInt();

        int[] nums = new int[n];

        for (int i = 0;i < n;i++) {
            nums[i] = reader.nextInt();
        }

        int count = 0;
        for (int i = 0;i < n - 1;i++) {
            for (int j = i + 1;j < n;j++) {
                if (getTailZero((long)((long)nums[i] * (long)nums[j]),x)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public boolean getTailZero(long num, int x) {
        int res = 0;
        while (num > 0 && num % 10 == 0) {
            res++;
            if (res >= x) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
