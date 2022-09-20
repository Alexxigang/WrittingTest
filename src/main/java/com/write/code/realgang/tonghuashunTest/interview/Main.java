package com.write.code.realgang.tonghuashunTest.interview;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-17 10:29
 **/
public class Main {

    public <T> T mergeSort(List<T> arr1,List<T> arr2,Comparator cmp) {
        int len1 = arr1.size();
        int len2 = arr2.size();
        List<T> arr = new LinkedList<>();

        int p = 0;
        int q = 0;
        while (p < len1 && q < len2) {
            if (cmp.compare(arr1.get(p),arr2.get(q)) == -1) {
                arr.add(arr1.get(p));
                p++;
            } else if (cmp.compare(arr1.get(p),arr2.get(q)) == 0) {
                arr.add(arr1.get(p));
                p++;
                q++;
            } else {
                arr.add(arr2.get(q));
                q++;
            }
        }

        while (p < len1) {
            arr.add(arr1.get(p));
            p++;
        }

        while (q < len2) {
            arr.add(arr2.get(q));
            q++;
        }

        return (T) arr;
    }
}
