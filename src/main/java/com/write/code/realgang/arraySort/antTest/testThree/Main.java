package com.write.code.realgang.arraySort.antTest.testThree;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-27 20:10
 **/
public class Main {
    public int[][] direction = new int[][]{{-1,0},{-2,0},{0,1},{0,2},{1,0},{2,0},{0,-1},{0,-2}};
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] grass = new int[n][m];

        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++) {
                grass[i][j] = reader.nextInt();
            }
        }

        int res = 0;

        int q = reader.nextInt();
        int preTime = 0;

        while (q > 0) {
            q--;
            int t = reader.nextInt();
            // x ,y >= 1
            int x = reader.nextInt();
            int y = reader.nextInt();
            int h = reader.nextInt();

            for (int i = 0;i < n;i++) {
                for (int j = 0;j < m;j++) {
                    grass[i][j] += (t - preTime);
                }
            }
            if (grass[x- 1][y-1] < h) {
                grass[x-1][y-1] = 0;
                res ++;
            } else {
                grass[x- 1][y-1] -= h;
                if (grass[x-1][y-1] == 0) {
                    res++;
                }
            }
            for (int i = 0;i < 8;i++) {
                int newX = (x - 1) + direction[i][0];
                int newY = (y - 1) + direction[i][1];
                if (inArea(n,m,newX,newY)) {
                    if (grass[newX][newY] < h) {
                        grass[newX][newY] = 0;
                        res ++;
                    } else {
                        grass[newX][newY] -= h;
                        if (grass[newX][newY] == 0) {
                            res++;
                        }
                    }
                }
            }
            preTime = t;

        }

        System.out.println(res);
    }

    public boolean inArea(int n,int m,int i,int j) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
