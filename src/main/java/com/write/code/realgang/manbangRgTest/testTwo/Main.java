package com.write.code.realgang.manbangRgTest.testTwo;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-16 19:23
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        for (int t = 0;t < T;t++) {
            int n = reader.nextInt();
            int m = reader.nextInt();
            int a = reader.nextInt();
            int b = reader.nextInt();

            if (m <= n) {
                System.out.println(a + b);
                continue;
            }
            // 剩余需要洗头的
            int washLeft = m;
            // 未理发的
            int unWash = m;
            // 洗了头但未理发
            int washedNotCut = 0;
            // 洗了头并且理了发
            int washedCuted = 0;
            // 剩余需要理发的人数
            int cutLeft = m;

            int time = 0;

            while (washedCuted < m) {
                int curCanWashNum = unWash > n ? n :unWash;
                int washTime = curCanWashNum > 0 ? a : 0;


                int curCanCutNum = washedNotCut > n ? n : washedNotCut;

                int cutTime = curCanCutNum > 0 ? b : 0;

                unWash -= curCanWashNum;
                washedNotCut += curCanWashNum;
                washedNotCut -= curCanCutNum;
                washedCuted += curCanCutNum;
//                if (washLeft > n) {
//                    washLeft -= n;
//                    washedNotCut += n;
//                } else {
//                    washLeft = 0;
//                    washedNotCut += washLeft;
//                }
//
//                washedCuted += curCanCutNum;
//                washedNotCut -= curCanCutNum;

                time += Math.max(washTime,cutTime);

            }

            System.out.println(time);
        }

    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
