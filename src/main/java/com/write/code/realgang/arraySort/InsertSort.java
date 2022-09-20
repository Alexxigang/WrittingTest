package com.write.code.realgang.arraySort;

/**
 * @description: InsertSort
 * @author: RealGang
 * @create: 2022-09-19 20:45
 **/
public class InsertSort {

    public int[] insertSort(int[] arr) {

        for (int i = 1;i < arr.length;i++) {
            int insertIndex = i - 1;
            int insertVal = arr[i];

            while (insertIndex >= 0 && arr[insertIndex] > insertVal) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
        }

        return arr;
    }
}
