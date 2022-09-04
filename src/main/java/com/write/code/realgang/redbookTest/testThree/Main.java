package com.write.code.realgang.redbookTest.testThree;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-04 17:09
 **/
public class Main {
    Map<String,Integer> infoMap;
    Map<String,List<String> > startToEndMap;
    int minFee = Integer.MAX_VALUE;

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int k = reader.nextInt();

        int[] starts = new int[m];
        int[] ends = new int[m];
        int[] fees = new int[m];

        for (int i = 0;i < m;i++) {
            starts[i] = reader.nextInt();
        }
        for (int i = 0;i < m;i++) {
            ends[i] = reader.nextInt();
        }
        for (int i = 0;i < m;i++) {
            fees[i] = reader.nextInt();
        }
        infoMap = new HashMap<>();
        startToEndMap = new HashMap<>();
        for (int i = 0;i < m;i++) {
            infoMap.put(String.valueOf(starts[i]) + "-" + String.valueOf(ends[i]),fees[i]);
            infoMap.put(String.valueOf(ends[i]) + "-" + String.valueOf(starts[i]),fees[i]);
            if (startToEndMap.containsKey(String.valueOf(starts[i]))) {
                List<String> list = startToEndMap.get(String.valueOf(starts[i]));
                list.add(String.valueOf(ends[i]));
                startToEndMap.put(String.valueOf(starts[i]),list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(String.valueOf(ends[i]));
                startToEndMap.put(String.valueOf(starts[i]),list);
            }

            if (startToEndMap.containsKey(String.valueOf(ends[i]))) {
                List<String> list = startToEndMap.get(String.valueOf(ends[i]));
                list.add(String.valueOf(starts[i]));
                startToEndMap.put(String.valueOf(ends[i]),list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(String.valueOf(starts[i]));
                startToEndMap.put(String.valueOf(ends[i]),list);
            }


        }

        backTrack(n,1,k,0,new LinkedList<>());
        System.out.println(minFee);

    }

    public void backTrack(int n,int nowLoc,int k, int maxFeeeInPath,List<String> path) {
        if (nowLoc == n) {
            if (path.size() <= k) {
                minFee = Math.min(minFee,maxFeeeInPath);
            }
            return;
        }

        if (path.size() >= k) {
            return;
        }

        List<String> nextLocs = startToEndMap.get(String.valueOf(nowLoc));

        for (int i = 0;i < nextLocs.size();i++) {
            String nextLoc = nextLocs.get(i);
            if (path.contains(nextLoc)) {
                continue;
            }
            int fee = infoMap.get(String.valueOf(nowLoc) + "-" + nextLoc);
            int maxFeeTemp = Math.max(maxFeeeInPath,fee);
            path.add(nextLoc);
            backTrack(n, Integer.parseInt(nextLoc),k,maxFeeTemp,path);
            path.remove(path.get(path.size() - 1));

        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
