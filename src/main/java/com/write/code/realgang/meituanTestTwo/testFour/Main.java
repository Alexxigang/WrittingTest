package com.write.code.realgang.meituanTestTwo.testFour;

import java.util.Arrays;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-13 11:59
 **/
public class Main {
    public void solution() {
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        //数组元素转换为数值流
        Integer[] num = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Main mainClass = new Main();
        mainClass.solution();
    }
}
