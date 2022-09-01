package com.write.code.realgang.shenxinfuTest.testTwo;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-01 18:56
 **/
public class Main {

    public void pythonFunction() {
        /**
        def solution_helper():
            # 分配长度为1000001的数组
            timeArr = [0 for _ in range(1000001)]

            N = 10

            for i in range(N):
            A , B = 2,5
            for j in range(A,B):
            timeArr[j] += 1

            maxCount = 0
            for i in range(0,len(timeArr)):
            if timeArr[i] > maxCount:
            maxCount = timeArr[i]

            print(maxCount)


        def solution():
            T = 5

            for i in range(T):
            solution_helper()

         **/
    }

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();

        for (int i = 0;i < T;i++) {
            int maxLen = 0;
            int[] timeArr = new int[1000001];
            int N = reader.nextInt();

            for (int j = 0;j < N;j++) {
                int A = reader.nextInt();
                int B = reader.nextInt();
                maxLen = Math.max(maxLen,B);
                for (int time = A;time <= B;time++) {
                    timeArr[time]++;
                }
            }
            int maxCount = 0;
            for (int k = 1;k <= 1000000;k++) {
                if (timeArr[k] > maxCount) {
                    maxCount = timeArr[k];
                }
            }

            System.out.println(maxCount);

        }

    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
