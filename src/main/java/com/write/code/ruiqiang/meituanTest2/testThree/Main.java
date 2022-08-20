package com.write.code.ruiqiang.meituanTest2.testThree;

import java.util.*;

public class Main {

    public void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        int[] score = new int[n];
        Integer[] improvements = new Integer[n];
        System.out.println(String.format("%.2f",10.));
        int improvement = 0;
        for(int i=0;i<n;i++){
            p[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            score[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            improvements[i] = score[i]*(100-p[i]);
            sum += score[i]*p[i];
        }
        Arrays.sort(improvements, Collections.reverseOrder());
        for(int i=0;i<m;i++){
            improvement += improvements[i];
        }
        sum += improvement;
        Double res = Double.valueOf(sum)/100;
        System.out.println(String.format("%.2f",res));


    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
