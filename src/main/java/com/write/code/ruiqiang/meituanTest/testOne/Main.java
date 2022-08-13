package com.write.code.ruiqiang.meituanTest.testOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int t = reader.nextInt();
        int[] deadlines = new int[n];
        for(int i=0;i<n;i++){
            deadlines[i] = reader.nextInt();
        }
        Arrays.sort(deadlines);
        int times = 0;
        int curStep = deadlines[0];


    }

}
