package com.write.code.realgang.tonghuashunTest.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @description: arrayTest
 * @author: RealGang
 * @create: 2022-09-21 14:15
 **/
public class ArrayTest {

    public int getSecondFreq(int[] nums) {
        Map<Integer,Integer> coutMap = new HashMap<>();

        for (int num:nums) {
            coutMap.put(num,coutMap.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer> > pq = new PriorityQueue<>((a,b) -> {
            return b.getValue() - a.getValue();
        });
        for (Map.Entry<Integer,Integer> entry:coutMap.entrySet()) {
            pq.offer(entry);
        }
        if (!pq.isEmpty()) {
            pq.poll();
        }

        return pq.peek().getKey();
    }

    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        int[] nums = new int[]{2,2,3,4,5,5,5,5,7,1,9};
        System.out.println(arrayTest.getSecondFreq(nums));

    }
}
