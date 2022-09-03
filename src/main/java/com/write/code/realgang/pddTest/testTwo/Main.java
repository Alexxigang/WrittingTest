package com.write.code.realgang.pddTest.testTwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-03 15:20
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();

        for (int i = 0;i < T;i++) {
            int n = reader.nextInt();
            char[] direction = new char[n];
            int[] steps = new int[n];
            for (int j = 0;j < n;j++) {
                String str = reader.next();

                direction[j] = str.charAt(0);
                steps[j] = reader.nextInt();
            }

            int[] res = new int[n];

            for (int k = 0;k < n;k++) {
                int curLoc = k;
                int step = 0;
                while (curLoc > -1 && curLoc < n) {
                    if (step > n) {
                        res[k] = -1;
                        break;
                    }
                    if (direction[curLoc] == 'L') {
                        curLoc -= steps[curLoc];
                    } else {
                        curLoc += steps[curLoc];
                    }
                    step++;
                }

                if (step <= n) {
                    res[k] = step;
                }
            }
            int k = 0;
            for (;k < n - 1;k++) {
                System.out.printf(res[k] + " ");
            }
            System.out.printf(String.valueOf(res[k]));

        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
