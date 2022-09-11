package com.write.code.realgang.shangtangTest.testTwo;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-08 20:13
 **/
public class Main {

    public int[] topKFrequent(int[] nums, int k) {
        /**
         利用小顶堆，因为要统计最大前k个元素，只有小顶堆每次将最小的元素弹出，最后小顶堆里积累的才是前k个最大元素。
         */
        Map<Integer,Integer> map = new HashMap<>();
        // 先利用map统计每个数出现的频率
        for (int i = 0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Map.Entry<Integer,Integer> > entries = map.entrySet();
        // 小顶堆，// 根据map的value值正序排，相当于一个小顶堆
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1,o2) -> o1.getValue() - o2.getValue());
        for (Map.Entry<Integer,Integer> entry:entries) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] res = new int[k];
        for (int i = 0;i<k;i++) {
            res[i] = pq.poll().getKey();
        }

        Arrays.sort(res);
        return res;
    }
}

