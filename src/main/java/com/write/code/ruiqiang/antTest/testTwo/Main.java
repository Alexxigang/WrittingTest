package com.write.code.ruiqiang.antTest.testTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public void solute(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        Set st = new HashSet();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }

        int count = 0;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                while(st.contains(nums[i])){
                    nums[i] += k;
                    count += 1;
                }
                st.add(nums[i]);
            }
        }


        System.out.println(count);
    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solute();
    }
}
