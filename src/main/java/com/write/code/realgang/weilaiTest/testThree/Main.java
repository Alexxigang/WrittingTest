package com.write.code.realgang.weilaiTest.testThree;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-30 20:06
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int k = reader.nextInt();

        List<Integer> nums = new LinkedList<>();
        for (int i = 0;i < n;i++) {
            nums.add(reader.nextInt());
        }
        Collections.sort(nums,(a,b) -> {
            if (a * a == b * b) {
                return a - b;
            }

            return b * b - a * a;
        });


        int[] p = new int[m];
        for (int i = 0;i < m;i++) {
            p[i] = reader.nextInt();
        }

        List<Integer> res = new LinkedList<>();

        for (int i = 0;i < m;i++) {
            int goodsNum = p[i];
            int num = Math.min(goodsNum,k);
            int sum = 0;
            for (int j = 0;j < num;j++) {
                sum += nums.get(j) * nums.get(j);
            }

            if (num < goodsNum) {

                int count = 0;
                for (int j = num;j < n && count < (goodsNum - num);j++) {
                    if (nums.get(j) >= 0) {
                        sum += nums.get(j);
                        count++;
                    }
                }

                for (int j = nums.size() - 1;count < (goodsNum - num) && j >= num;j--) {
                    if (nums.get(j) < 0) {
                        sum += nums.get(j);
                        count++;
                    }
                }

            }

            res.add(sum);
        }

        for (int t:res) {
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
