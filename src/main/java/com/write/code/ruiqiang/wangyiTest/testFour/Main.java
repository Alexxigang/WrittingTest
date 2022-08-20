package com.write.code.ruiqiang.wangyiTest.testFour;

import java.util.Scanner;

public class Main {
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        if(n<3){
            System.out.println(-1);
            return ;
        }
        int left=0,right=0;
        int cur_small = 0,res=0;
        for(left=0;left<=n-3;left++){
            right = left +2;
            cur_small = 0;
            if(nums[right-1]<nums[left]){
                cur_small += 1;
            }
            while(right<n){
                if(nums[right]==nums[left]){
                    res += cur_small;
                }
                else if(nums[right]<nums[left]){
                    cur_small += 1;
                }
                right ++;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solution();
    }
}
