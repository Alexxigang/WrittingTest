package com.write.code.realgang;

import java.util.Random;

/**
 * @description: randomTest
 * @author: RealGang
 * @create: 2022-09-24 17:01
 **/
public class RandomTest {

    public int randomSeven() {
        Random random = new Random(5);
        int num = random.nextInt();

        int mutifyFive = num * 5 + random.nextInt();

        while (mutifyFive > 21) {
            num = random.nextInt();

            mutifyFive = num * 5 + 1;
        }

        return mutifyFive % 7;
    }

    public void quickSort(int[] nums,int left,int right) {
        if (left < right) {
            int key = nums[left];

            int i = left;
            int j = right;
            while (i < j) {
                while (i < j && nums[j] > key) {
                    j--;
                }

                if (i < j) {
                    nums[i] = nums[j];
                    i++;
                }

                while (i < j && nums[i] < key) {
                    i++;
                }

                if (i < j) {
                    nums[j] = nums[i];
                    j--;
                }
            }
            nums[i] = key;
            quickSort(nums,left,i - 1);
            quickSort(nums,i + 1,right);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,7,2,3,9,1};
        RandomTest randomTest = new RandomTest();
        randomTest.quickSort(nums,0,nums.length - 1);
        for (int num:nums) {
            System.out.println(num);
        }
    }
}
