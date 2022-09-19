package com.write.code.realgang.arraySort;

/**
 * @description: quickSort
 * @author: RealGang
 * @create: 2022-09-19 21:41
 **/
public class QuickSort {

    public void quickSort(int[] arr,int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int key = arr[i];

            while (i < j) {
                while (i < j && arr[j] > key) {
                    j--;
                }

                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }

                while (i < j && arr[i] < key) {
                    i++;
                }

                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
             }

            arr[i] = key;

            quickSort(arr,left, i - 1);
            quickSort(arr,i,right);
        }
    }
}
