package com.write.code.ruiqiang.wangyiTest.testFour;

import java.util.HashMap;
import java.util.Map;
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
        Object o = new Object();

        int left=0,right=0;
        int cur_small = 0,res=0;
        int[] minus = new int[n-1];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            minus[i] = nums[i]-nums[i+1];

        }
        int[] cum = new int[n-1];
        cum[0] = minus[0];
        for(int i=1;i<n-1;i++){
            cum[i] = cum[i-1] +minus[i];
            if(cum[i]==0)res++;
            map.put(cum[i],map.getOrDefault(cum[i],0)+1);
        }
//        for(Map.Entry<Integer,Integer>m: map.entrySet()){
//            int cur = m.getValue();
//            if(cur)
//        }

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
        int[] x = new int[0];
//        System.out.println(x[0]);
        System.out.println(x.length);
//        ma.solution();
    }
}
