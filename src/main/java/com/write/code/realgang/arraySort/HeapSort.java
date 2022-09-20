package com.write.code.realgang.arraySort;

/**
 * @description: heapSort
 * @author: RealGang
 * @create: 2022-09-19 22:20
 **/
public class HeapSort {

    public void heapSort(int[] arr) {
        int len = arr.length;

        int beginIndex = (len - 1) / 2;

        for (int i = beginIndex;i >= 0;i--) {
            maxHeapify(arr,i,len - 1);
        }

        for (int i = len - 1;i > 0;i--) {
            swap(arr,0,i);
            maxHeapify(arr,0,i - 1);
        }

    }

    public void maxHeapify(int[] arr,int index,int lastIndex) {
        int left = index & 2 + 1;
        int right = left + 1;
        int maxIndex = left;

        if (maxIndex > lastIndex) {
            return;
        }

        if (right <= lastIndex && arr[right] > arr[maxIndex]) {
            maxIndex = right;
        }

        if (arr[maxIndex] > arr[index]) {
            swap(arr,index,maxIndex);
            maxHeapify(arr,maxIndex,lastIndex);
        }

    }

    public void swap(int[] arr, int index, int maxIndex) {
        int temp = arr[index];
        arr[index] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
