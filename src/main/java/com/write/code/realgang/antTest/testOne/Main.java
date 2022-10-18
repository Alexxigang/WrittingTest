package com.write.code.realgang.arraySort.antTest.testOne;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-27 19:38
 **/
public class Main {
    public Map<Integer,Boolean> isPrimeMap = new HashMap<>();
    boolean isEnd = false;
    List<Integer> res;
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
//        boolean[] visited = new boolean[n];
        res = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        backTrack(n,1,path);

        if (res.size() <= 0) {
            System.out.println(-1);
        } else {
            for (int i = 0;i < res.size() - 1;i++) {
                System.out.printf(res.get(i) + " ");
            }
            System.out.printf(String.valueOf(res.get(res.size() - 1)));
        }

    }

    public void backTrack(int n,int start, List<Integer> path) {
        if (isEnd) {
            return;
        }
        if (path.size() == n) {
            res = new LinkedList<>(path);
            isEnd = true;
            return;
        }

        for (int i = 1;i <= n;i++) {
            if (path.contains(i)) {
                continue;
            }
//            if (visited[i - 1]) {
//                continue;
//            }
            if (isPrime(i + start)) {
                continue;
            }
//            visited[i - 1] = true;
            path.add(i);
            backTrack(n,start + 1,path);
            path.remove(path.size() - 1);
//            visited[i - 1] = false;
        }
    }

    public boolean isPrime(int num) {
        if (isPrimeMap.containsKey(num)) {
            return isPrimeMap.get(num);
        }
        int k = (int)Math.sqrt(num);

        for (int i = 2;i <= k;i++) {
            if (num % i == 0) {
                isPrimeMap.put(num,false);
                return false;
            }
        }
        isPrimeMap.put(num,true);
        return true;
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
