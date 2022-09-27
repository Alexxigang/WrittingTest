package com.write.code.ruiqiang.mayiTest.testTwo;

import java.util.Scanner;

public class Main {

    public void solute(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        int[] results = new int[n];
        results[0] = n;
        dp[0] = 1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                dp[i] = dp[i-1]+1;
            }
            else{
                dp[i] = 1;
            }
            if(dp[i]>=2){
                for(int j=2;j<=dp[i];j++){
                    results[j-1] += 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(results[i]);
            if(i != n-1){
                System.out.print(" ");
            }

        }
    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solute();
    }
}
