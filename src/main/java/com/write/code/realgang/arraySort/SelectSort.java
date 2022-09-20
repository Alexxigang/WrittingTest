package com.write.code.realgang.arraySort;

/**
 * @description: selectSort
 * @author: RealGang
 * @create: 2022-09-19 20:34
 **/
public class SelectSort {

    public int[] selectSort(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            int minVal = arr[i];
            int minIndex = i;

            for (int j = i + 1;j < arr.length;j++) {
                if (arr[j] < minVal) {
                    minIndex = j;
                    minVal = arr[j];
                }
            }

            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = minVal;
            }
        }

        return arr;
    }
}
