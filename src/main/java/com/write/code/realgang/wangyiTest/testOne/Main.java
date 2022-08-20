package com.write.code.realgang.wangyiTest.testOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-13 09:49
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i < n;i++) {
            nums[i] = reader.nextInt();
        }

        int count = 0;
        List<Integer> maxIndexList = new ArrayList<>();
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0;i < n;i++) {
            if (nums[i] > maxValue) {
                maxIndexList.clear();
                maxIndexList.add(i);
                maxValue = nums[i];
            } else if (nums[i] == maxValue) {
                maxIndexList.add(i);
            }
        }

        if (maxIndexList.size() == 1) {
//            maxIndex = maxIndexList.get(0);
//            for (int i = maxIndex - 1;i >= 0;i--) {
//                if ((maxIndex - i) % 2 != 0) {
//                    count += maxValue - 1 - nums[i];
//                } else {
//                    count += maxValue - nums[i];
//                }
//            }
//
//            for (int i = maxIndex + 1;i < n;i++) {
//                if ((i - maxIndex) % 2 != 0) {
//                    count += maxValue - 1 - nums[i];
//                } else {
//                    count += maxValue - nums[i];
//                }
//            }

//            System.out.println(count);
            System.out.println(getMinCount(maxIndexList.get(0),maxValue,nums));
        } else {
            boolean flag = true;
            for (int i = 1;i < maxIndexList.size();i++) {
                if ((maxIndexList.get(i) - maxIndexList.get(i - 1)) % 2 != 0) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                int minCount = Integer.MAX_VALUE;
                for (int index:maxIndexList) {
                    minCount = Math.min(minCount,getMinCount(index,maxValue + 1,nums));
                }

                System.out.println(minCount);
            } else {
                System.out.println(getMinCount(maxIndexList.get(0),maxValue,nums));
            }
        }
    }

    public int getMinCount(int maxIndex,int maxValue,int[] nums) {
        int res = 0;
        res += maxValue - nums[maxIndex];
        for (int i = maxIndex - 1;i >= 0;i--) {
            if ((maxIndex - i) % 2 != 0) {
                res += maxValue - 1 - nums[i];
            } else {
                res += maxValue - nums[i];
            }
        }

        for (int i = maxIndex + 1;i < nums.length;i++) {
            if ((i - maxIndex) % 2 != 0) {
                res += maxValue - 1 - nums[i];
            } else {
                res += maxValue - nums[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
