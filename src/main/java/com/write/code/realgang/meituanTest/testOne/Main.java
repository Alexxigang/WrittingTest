package com.write.code.realgang.meituanTest.testOne;

import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-13 11:59
 **/
public class Main {

    public int[] getLocation(int i, int j, char c) {
        switch (c) {
            case 'W':
                return new int[] {i - 1, j};
            case 'A':
                return new int[] {i,j - 1};
            case 'S':
                return new int[] {i + 1,j};
            case 'D':
                return new int[] {i,j + 1};
        }

        return new int[]{i,j};
    }

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int k = reader.nextInt();

        reader.nextLine();
        String command = reader.nextLine();
        int[][] room = new int[n][m];
        room[0][0] = 1;

        int count = 1;

        int num = 0;
        int i = 0;
        int j = 0;
        for (char c:command.toCharArray()) {
            num++;
            int[] next = getLocation(i,j,c);
            i = next[0];
            j = next[1];
            if (room[i][j] == 0) {
                count++;
                room[i][j] = 1;
            }
            if (count == n*m) {
                System.out.println("YES");
                System.out.println(num);
                break;
            }
        }

        if (count < n*m) {
            System.out.println("NO");
            System.out.println(n*m - count);
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
