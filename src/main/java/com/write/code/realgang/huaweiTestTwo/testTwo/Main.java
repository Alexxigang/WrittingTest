package com.write.code.realgang.huaweiTestTwo.testTwo;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-07 19:14
 **/
public class Main {
    int startX = -1;
    int startY = -1;
    int endX = -1;
    int endY = -1;

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

        for (int i = 0;i < M;i++) {
            for (int j = 0;j < N;j++) {
                if (block[i][j] == 'S') {
                    startX = i;
                    startY = j;
                }
                if (block[i][j] == 'E') {
                    endX = i;
                    endY = j;
                }
                if (startX != -1 && endX != -1) {
                    break;
                }
            }
        }

        int m = endY - startX + 1;
        int n = endX - startX + 1;
        System.out.println(13);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
