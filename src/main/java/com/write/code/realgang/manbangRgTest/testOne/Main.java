package com.write.code.realgang.manbangRgTest.testOne;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-16 19:12
 **/
public class Main {
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++) {
            arr[i] = reader.nextInt();
        }

        System.out.println(k);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
