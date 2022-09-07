package com.write.code.realgang.ddTest.testOne;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-04 20:31
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();

        Integer[] taozi = new Integer[n];

        for (int i = 0;i < n;i++) {
            taozi[i] = reader.nextInt();
        }
        Arrays.sort(taozi,(a,b) -> {
            return b - a;
        });

        int left = 0;
        int right = 0;
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        while (right < n) {

            int rightTaozi = taozi[right];
            sum += rightTaozi;
            if (right > left) {
                if (taozi[left] > k * sum / (right - left + 1)) {
                    left++;
                    sum -= taozi[left];
                }
            }
            maxNum = Math.max(maxNum,right - left + 1);

            right++;
        }

        System.out.println(maxNum);

    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
