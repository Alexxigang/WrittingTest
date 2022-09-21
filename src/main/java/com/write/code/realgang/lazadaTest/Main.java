package com.write.code.realgang.lazadaTest;

import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-21 20:22
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        System.out.println(nextGreaterElement(n));
    }
    public int nextGreaterElement(int n) {
        char[] nums = Integer.toString(n).toCharArray();
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = nums.length - 1;
        while (i < j && nums[i] >= nums[j]) {
            j--;
        }
        swap(nums,i,j);
        reverse(nums,i + 1);
        long res = Long.parseLong(new String(nums));
        return res > Integer.MAX_VALUE ? -1 : (int)res;
    }

    public void swap(char[] nums,int i,int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(char[] nums,int begin) {
        int i = begin,j = nums.length - 1;
        while (i < j) {
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
