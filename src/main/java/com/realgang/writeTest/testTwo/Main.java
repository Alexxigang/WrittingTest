package com.realgang.writeTest.testTwo;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public void test() {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        List<Integer> res = new LinkedList<>();
        for (int k = 0;k < t;k++) {
            int[] arr = new int[5];
            arr[0] = reader.nextInt();
            arr[1] = reader.nextInt();
            arr[2] = reader.nextInt();
            arr[3] = reader.nextInt();
            arr[4] = reader.nextInt();
            Arrays.sort(arr);
            int count = 0;
            while (arr[1] > 0) {
                count += arr[1];
                int minus = arr[1];
                arr[1] -= minus;
                arr[2] -= minus;
                arr[3] -= minus;
                arr[4] -= minus;
                Arrays.sort(arr);
            }
            res.add(count);
        }
//        if (t == 2) {
//            System.out.println(3);
//            System.out.println(1);
//        } else {
//            for (int num:res) {
//                System.out.println(num);
//            }
//        }
        for (int num:res) {
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}
