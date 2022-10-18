package com.write.code.realgang.xiechengTest.testTwo;

import java.lang.reflect.Array;
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
        boolean[] used = new boolean[chars.length];
        Arrays.sort(chars);
        res = new HashSet<>();
        backTrack(chars,new ArrayList<>(),used);

        System.out.println(res.size());
    }

    public void backTrack(char[] chars,List<Character> path,boolean[] used) {
        if (path.size() == chars.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0;i < chars.length;i++) {
            if (i > 0 && chars[i] == chars[i - 1] && used[i - 1] == false) {
                continue;
            }
            if (used[i]) {
                continue;
            }

            if (path.size() > 0 && chars[i] == path.get(path.size() - 1)) {
                continue;
            }
            used[i] = true;
            path.add(chars[i]);

            backTrack(chars,path,used);

            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
