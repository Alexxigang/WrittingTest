package com.write.code.realgang.arraySort;

/**
 * @description: bubbleSort
 * @author: RealGang
 * @create: 2022-09-19 20:30
 **/
public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        int temp = 0;
        boolean flag = false;

        for (int i = arr.length - 1;i > 0;i--) {
            for (int j = 0;j < i;j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }

        return arr;
    }
}
