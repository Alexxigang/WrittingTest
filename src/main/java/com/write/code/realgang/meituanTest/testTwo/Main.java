package com.write.code.realgang.meituanTest.testTwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-13 11:59
 **/
public class Main {
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int t = reader.nextInt();

        int[] array = new int[n];
        for (int i = 0;i < n;i++) {
            array[i] = reader.nextInt();
        }

        Arrays.sort(array);
        if (n == 1) {
            if (array[0] < t) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }

        if (array[0] >= n * t) {
            System.out.println(0);
            return;
        }

        int magicTime = 0;
        int nowOrder = array[array.length - 1];
        for (int i = array.length - 2;i >= 0;i--) {
            if (array[i] > nowOrder - t) {
                magicTime++;
            } else if (array[i] == nowOrder - t) {
                nowOrder = nowOrder - t;
            } else {
                nowOrder = nowOrder - t;
                magicTime++;
            }
        }

        System.out.println(magicTime);
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
