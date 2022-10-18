package com.write.code.realgang.xiechengTest.testTwo;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-10-18 19:27
 **/
public class Main {
    Set<List<Character>> res;
    public void solution() {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        char[] chars = str.toCharArray();
        res = new HashSet<>();
        backTrack(chars,new ArrayList<>(),new HashSet<>());

        System.out.println(res.size());
    }

    public void backTrack(char[] chars,List<Character> path, Set<Integer> visitedIndexs) {
        if (path.size() == chars.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0;i < chars.length;i++) {
            if (visitedIndexs.contains(i)) {
                continue;
            }

            if (path.size() > 0 && chars[i] == path.get(path.size() - 1)) {
                continue;
            }
            visitedIndexs.add(i);
            path.add(chars[i]);

            backTrack(chars,path,visitedIndexs);

            path.remove(path.size() - 1);
            visitedIndexs.remove(i);
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
