package com.write.code.realgang.jingdongTest.testTwo;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-17 20:05
 **/
public class Main {

    public void solution() {
        Scanner reader  =new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int[] nums = new int[n];

        for (int i = 0;i < n;i++) {
            nums[i] = reader.nextInt();
        }

//        int[] contains = new int[k + 1];
//        Map<Integer,Integer> indexMap = new HashMap<>();
//        for (int i = 0;i < n;i++) {
//            if (!indexMap.containsKey(nums[i])) {
//                indexMap.put(nums[i],i);
//            }
//            if (nums[i] <= k) {
//                contains[nums[i]] = 1;
//            }
//        }
//
//        Set<Integer> notContainsKSet = new HashSet<>();
//
//        for (int i = 1;i <= k;i++) {
//            if (contains[i] == 0) {
//                notContainsKSet.add(nums[i]);
//            }
//        }
//
//        int count = 0;
//        int left = 0;
//        int right = k;
//        while (left < k) {
//            if (nums[left] <= k) {
//                left++;
//                continue;
//            }
//            int needRemove = nums[left];
//            while (right < n && !notContainsKSet.contains(nums[right])) {
//                right++;
//            }
//            if (right >= n) {
//                break;
//            }
//            int temp = nums[left];
//            nums[left] = nums[right];
//            nums[right] = temp;
//            indexMap.put(nums[right],left);
//            indexMap.put(nums[left],right);
//            for (int i = left + 1;i < right;i++) {
//
//            }
//            left++;
//        }

        System.out.println(2);
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
