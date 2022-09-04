package com.write.code.realgang.ddTest.testTwo;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-04 19:50
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];
        int[] beauty = new int[n];

        for (int i = 0;i < n;i++) {
            left[i] = reader.nextInt();
        }
        for (int i = 0;i < n;i++) {
            right[i] = reader.nextInt();
        }
        for (int i = 0;i < n;i++) {
            beauty[i] = reader.nextInt();
        }

        int[] res = new int[n];

        for (int i = 0;i < n;i++) {
            int count = 0;
            for (int k = left[i];k <= right[i];k++) {
                if (getBeauty(k) == beauty[i]) {
                    count++;
                }
            }

            res[i] = count;
        }
        int index = 0;
        for (;index < n - 1;index++) {
            System.out.printf(res[index] + " ");
        }
        System.out.printf(String.valueOf(res[index]));
    }

    public int getBeauty(int num) {
        int res = 0;

        while (num > 0) {
            res ^= num % 10;
            num /= 10;
        }

        return res;
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
