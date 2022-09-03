package com.write.code.realgang.pddTest.testOne;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-01 18:56
 **/
public class Main {
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();

        for (int i = 0;i < t;i++) {
            int len = reader.nextInt();
            int k = reader.nextInt();

            String str = reader.next();
            char[] chars = str.toCharArray();
            int index = 0;
            int count = 0;

            while (index < len && count < k) {
                char c = chars[index];

                while (c > 'a' && count < k) {
                    for (int j = 0;j < len;j++) {
                        if (chars[j] == c) {
                            chars[j] = (char)(c - 1);
                        }
                    }

                    count++;
                    c = (char)(c - 1);
                }

                if (c == 'a') {
                    index++;
                }
//                index++;
            }

            for (int j = 0;j < len;j++) {
                System.out.printf(String.valueOf(chars[j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
