package com.write.code.realgang.jingdongTest.testOne;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-17 20:34
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while (t > 0) {
            t--;
            int n = reader.nextInt();
            int k = reader.nextInt();
            int[] nums = new int[n];

            for (int i = 0;i < n;i++) {
                nums[i] = reader.nextInt();
            }
            Map<Integer,Integer> freqMap = new HashMap<>();
            for (int num:nums) {
                freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
            }

            PriorityQueue<Map.Entry<Integer,Integer> > pq = new PriorityQueue<>((a,b) -> {
                return b.getValue() - a.getValue();
            });

            for (Map.Entry<Integer,Integer> entry: freqMap.entrySet()) {
                pq.offer(entry);
            }

            if (pq.size() < k) {
                System.out.println("No");
                continue;
            }

            boolean flag = false;

            while (!pq.isEmpty() && pq.peek().getValue() > 1) {
                if (pq.size() >= k) {
                    if (pq.peek().getValue() <= 1) {
                        System.out.println("Yes");
                        flag = true;
                        break;
                    }
                    List<Map.Entry<Integer,Integer> > list = new LinkedList<>();
                    for (int i = 0;i < k;i++) {
                        Map.Entry<Integer,Integer> entry = pq.poll();
                        entry.setValue(entry.getValue() - 1);
                        if (entry.getValue() > 0) {
                            list.add(entry);
                        }
                    }

                    for (Map.Entry<Integer,Integer> entry:list) {
                        pq.offer(entry);
                    }
                } else {
                    if (pq.peek().getValue() <= 1) {
                        System.out.println("Yes");
                        flag = true;
                        break;
                    } else {
                        System.out.println("No");
                        flag = true;
                        break;
                    }
                }
            }

            if (!flag) {
                if (!(!pq.isEmpty() && pq.peek().getValue() > 1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
