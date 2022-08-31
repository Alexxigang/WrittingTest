package com.write.code.realgang.huaweiTest.testThree;

import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-31 18:54
 **/
public class Main {

    public void solution() {
        int sudu = 100;
        int averageDistance = 1000;
        Scanner reader = new Scanner(System.in);
        int distance = reader.nextInt();
        int n = reader.nextInt();
        int[][] restArr = new int[n][2];
        for (int i = 0;i < n;i++) {
            restArr[i][0] = reader.nextInt();
            restArr[i][1] = reader.nextInt();
        }

        int time = 0;
        int curIndex = 0;
        int curDistance = 0;
        int distanceLeft = distance;
        while (curDistance < distance) {
            int num = 0;
            while (curIndex < n && (restArr[curIndex][0] - curDistance) < distanceLeft) {
                num++;
                curIndex++;
            }

            if (curIndex == n && num > 1) {
                if (distanceLeft < distance - curDistance) {
                    System.out.println(-1);
                } else {
                    System.out.println(time);
                }
                break;
            }
            time += (restArr[curIndex - 1][0] - curDistance) / sudu;

            time += 1;
            time += restArr[curIndex - 1][1];
            distanceLeft = averageDistance;

            curDistance = restArr[curIndex - 1][0];

        }



        //        System.out.println(-1);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
