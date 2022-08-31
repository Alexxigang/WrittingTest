package com.write.code.realgang.huaweiTest.testThree;

import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-31 18:54
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int distance = reader.nextInt();
        int n = reader.nextInt();
        int[][] restArr = new int[n][2];
        for (int i = 0;i < n;i++) {
            restArr[i][0] = reader.nextInt();
            restArr[i][1] = reader.nextInt();
        }

    }
    public static void main(String[] args) {

    }
}
