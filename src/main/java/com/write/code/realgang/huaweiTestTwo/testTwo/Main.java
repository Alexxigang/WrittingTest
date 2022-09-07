package com.write.code.realgang.huaweiTestTwo.testTwo;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-07 19:14
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int M = reader.nextInt();
        int N = reader.nextInt();

        char[][] block = new char[M][N];
        reader.nextLine();
        for (int i = 0;i < M;i++) {
            String s = reader.nextLine();
            char[] chars = s.toCharArray();
            for (int j = 0;j < N;j++) {
                block[i][j] = chars[j];
            }
        }

        System.out.println(111);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
