package com.write.code.realgang.wangyiTest.testThree;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-13 09:49
 **/
public class Main {
    public void solution() {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();

        char[] chars = str.toCharArray();
        int count = 0;

        for (int i = 1;i < chars.length - 1;i++) {
            if (chars[i] == 'e') {
                if (!(chars[i - 1] == 'r' && chars[i + 1] == 'd' || chars[i - 1] == 'd' && chars[i + 1] == 'r')) {
                    if (chars[i - 1] != 'r' && chars[i - 1] != 'd') {
                        count += 1;
                    }

                    if (chars[i + 1] != 'r' && chars[i + 1] != 'd') {
                        count += 1;
                    }
                }
            }
        }

        for (int i = 1;i < chars.length - 1;i++) {
            if (chars[i] != 'e') {
                if ((chars[i - 1] == 'r' && chars[i + 1] == 'd' || chars[i - 1] == 'd' && chars[i + 1] == 'r')) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
