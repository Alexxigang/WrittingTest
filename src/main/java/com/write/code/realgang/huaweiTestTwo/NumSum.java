package com.write.code.realgang.huaweiTestTwo;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-10-12 11:24
 **/
public class NumSum {

    public void solution(int[] nums) {

        int sum = 0;
        for (int num:nums) {
            sum += getSum(num);
        }
        System.out.println(sum);
    }

    public int getSum(int num) {
        int count = 0;
        int sum = 0;

        if (num <= 4) {
            return 0;
        }

        for (int i = 1;i * i < num;i++) {
            if (num % i == 0) {
                count += 2;
                sum += i;
                sum += num / i;
            }

            if (count > 4) {
                return 0;
            }
        }
        if (count == 4) {
            return sum;
        }
        return 0;
    }
    public static void main(String[] args) {
        NumSum numSum = new NumSum();
        numSum.solution(new int[]{21,4,7});
        numSum.solution(new int[]{21,21});
        numSum.solution(new int[]{1,2,3,4,5});
    }
}
