package com.write.code.realgang.arraySort;

/**
 * @description: MergeSort
 * @author: RealGang
 * @create: 2022-09-19 21:26
 **/
public class MergeSort {

    public void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid + 1, right, temp);

            merge(arr,left,mid,right,temp);
        }
    }

    public void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int index = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[index] = arr[i];
                i++;
            } else {
                temp[index] = arr[j];
                j++;
            }

            index++;
        }

        while (i <= mid) {
            temp[index] = arr[i];
            index++;
            i++;
        }

        while (j <= right) {
            temp[index] = arr[j];
            index++;
            j++;
        }

        int tempLeft = left;
        index = 0;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[index];
            tempLeft++;
            index++;
        }

    }
}
