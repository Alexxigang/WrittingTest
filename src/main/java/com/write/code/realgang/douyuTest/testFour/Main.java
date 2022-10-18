package com.write.code.realgang.douyuTest.testFour;

import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-30 16:20
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();

        while (T > 0) {
            T--;

            int n = reader.nextInt();
            int[] nums = new int[n];

            for (int i = 0;i < n;i++) {
                nums[i] = reader.nextInt();
            }

            int[][] dp = new int[n][n];
            for (int i = 0;i < n;i++) {
                dp[i][i] = nums[i];
            }
            for (int i = n - 2;i >= 0;i--) {
                for (int j = i + 1;j < n;j++) {
                    if (dp[i][j] > 0 && Math.abs(dp[i][j] % 3 ) != 0) {
                        continue;
                    }

                    if (Math.abs(nums[i] - dp[i + 1][j]) % 3 != 0) {
                        dp[i][j] = nums[i] - dp[i + 1][j];
                    }

                    if (Math.abs(nums[j] - dp[i][j - 1]) % 3 != 0) {
                        dp[i][j] = nums[j] - dp[i][j - 1];
                    }
                }
            }

            if (Math.abs(dp[0][n - 1]) % 3 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
