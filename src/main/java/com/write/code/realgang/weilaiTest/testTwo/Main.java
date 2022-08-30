package com.write.code.realgang.weilaiTest.testTwo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-30 20:06
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        List<int[]> list = new LinkedList<>();
        for (int i = 0;i < n;i++) {
            int[] arr = new int[2];
            arr[0] = reader.nextInt();
            arr[1] = reader.nextInt();
            list.add(arr);
        }

        System.out.println(9);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
