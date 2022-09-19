package com.write.code.realgang.arraySort;

/**
 * @description: ShellSort
 * @author: RealGang
 * @create: 2022-09-19 20:53
 **/
public class ShellSort {

    public int[] shellSort(int[] arr) {

        for (int gap = arr.length / 2;gap > 0;gap /= 2) {
            for (int i = gap;i < arr.length;i++) {
                int insertIndex = i - gap;
                int insertVal = arr[i];

                while (insertIndex >= 0 && arr[insertIndex] > insertVal) {
                    arr[insertIndex + gap] = arr[insertIndex];
                    insertIndex -= gap;
                }

                arr[insertIndex + gap] = insertVal;
            }
        }

        return arr;
    }
}
