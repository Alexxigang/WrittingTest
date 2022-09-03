package com.write.code.realgang.pddTest.testThree;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-03 16:23
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        String S = reader.next();
        String T = reader.next();

        Set<Character> strSet = new HashSet<>();
        Set<Character> tSet = new HashSet<>();

        Map<Character,Integer> strMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();

        int count = 0;
        for (char c:S.toCharArray()) {
            if (c == '#') {
                count++;
            }
            strSet.add(c);
            strMap.put(c,strMap.getOrDefault(c,0) + 1);
        }

        if (count == 0) {
            System.out.println(S);
        } else {
            for (char c:T.toCharArray()) {
                tSet.add(c);
                tMap.put(c,tMap.getOrDefault(c,0) + 1);
            }
        }



    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
