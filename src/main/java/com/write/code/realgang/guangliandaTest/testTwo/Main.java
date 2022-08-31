package com.write.code.realgang.guangliandaTest.testTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-31 22:06
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] arr = new int[m][3];
        for (int i = 0;i < m;i++) {
            arr[i][0] = reader.nextInt();
            arr[i][1] = reader.nextInt();
            arr[i][2] = reader.nextInt();
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int[] cars = new int[n + 1];

        int lastEnd = 0;
        for (int i = 0;i < m;i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            int num = arr[i][2];
            int j = start;
            if (j > lastEnd) {
                for (int k = lastEnd + 1;k < j;k++) {
                    cars[k] = 1;
                }
            }
            int count = 0;
            while (j <= lastEnd) {
                if (cars[j] == 1) {
                    count++;
                }
                j++;
            }

            while (j <= end && count < num) {
                cars[j] = 1;
                count++;
                j++;
            }

            lastEnd = end;
        }

        int res = 0;
        for (int i = 1;i <= n;i++) {
            if (cars[i] == 1) {
                res++;
            }
        }

        System.out.println(res);

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
