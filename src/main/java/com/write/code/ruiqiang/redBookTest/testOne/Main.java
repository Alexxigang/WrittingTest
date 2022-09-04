package com.write.code.ruiqiang.redBookTest.testOne;

import java.util.Scanner;

public class Main {

    public void solute(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[2*n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        for(int i=n;i<2*n;i++){
            nums[i] = nums[2*n-1-i];
        }
        int c = k%(2*n);
        int result = nums[c-1];
        System.out.println(result);
    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solute();
    }
}
