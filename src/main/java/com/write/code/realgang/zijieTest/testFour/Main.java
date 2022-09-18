package com.write.code.realgang.zijieTest.testFour;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-18 10:47
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int[] books = new int[n];
        Map<Integer,List<Integer> > indexMap = new HashMap<>();

        for (int i = 0;i < n;i++) {
            books[i] = reader.nextInt();
            List<Integer> list = indexMap.getOrDefault(books[i],new ArrayList<>());
            list.add(i + 1);
            indexMap.put(books[i],list);
        }

        Arrays.sort(books);
        int maxNum = 0;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0;i < n;i++) {
            for (int j = i + 1;j < n;j++) {

                if (books[j] - books[i] <= k) {

                    if (j - i + 1 == maxNum) {
                        List<Integer> list = new LinkedList<>();
                        for (int t = i;t <= j;t++) {
                            list.add(books[t]);
                        }
                        res.add(list);
                    } else if (j - i + 1 > maxNum) {
                        res.clear();
                        List<Integer> list = new LinkedList<>();
                        for (int t = i;t <= j;t++) {
                            list.add(books[t]);
                        }
                        res.add(list);
                    }

                    maxNum = Math.max(maxNum,j - i + 1);
                }
            }
        }
        int finalCount = 0;
        List<List<int[]> > finalRes = new ArrayList<>();
        for (List<Integer> list:res) {
            int count = 1;
            if (!list.get(0).equals(list.get(list.size() - 1))) {
                for (int i = 0;i < list.size();i++) {
                    count *= indexMap.get(list.get(i)).size();
                }
            }

            finalCount += count;
            int minHeight = list.get(0);
            int maxHeight = list.get(list.size() - 1);
            if (minHeight != maxHeight) {
                List<int[] > curList = new LinkedList<>();
                List<Integer> minHeightIndexList = indexMap.get(minHeight);
                List<Integer> maxHeightIndexList = indexMap.get(maxHeight);

                for (int i = 0;i < minHeightIndexList.size();i++) {
                    for (int j = 0;j < maxHeightIndexList.size();j++) {

                        curList.add(new int[]{minHeightIndexList.get(i),maxHeightIndexList.get(j)});
                    }
                }

                int next = count / minHeightIndexList.size() / maxHeightIndexList.size();

                finalRes.add(curList);
                for (int i = 0;i < next - 1;i++) {
                    finalRes.add(curList);
                }
            }



        }
        System.out.printf(maxNum + " " + finalCount);
        System.out.println();

        for (List<int[]> list: finalRes) {
            for (int i = 0;i < list.size();i++) {
                System.out.printf(list.get(i)[0] + " " + list.get(i)[1]);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
