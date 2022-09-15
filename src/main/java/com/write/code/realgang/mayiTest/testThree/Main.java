package com.write.code.realgang.mayiTest.testThree;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-15 19:40
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();

        int len = str.length();
        int left = 0;
        int right = 0;
        Map<Character,Integer> countMap = new HashMap<>();
        Set<Character> windowSet = new HashSet<>();
        int countInWindow = 0;

        int res = 0;
        while (right < len) {
            char cRight = str.charAt(right);
            countMap.put(cRight,countMap.getOrDefault(cRight,0) + 1);
            windowSet.add(cRight);
            if (countMap.get(cRight) % 2 == 0) {
                countInWindow++;
            }

            while (countInWindow > 0) {
                res++;
                char cLeft = str.charAt(left);
                countMap.put(cLeft,countMap.getOrDefault(cLeft,0) - 1);
                if (countMap.get(cLeft) % 2 != 0) {
                    countInWindow--;
                }

                if (countMap.get(cLeft) == 0) {
                    windowSet.remove(cLeft);
                }

                left++;
            }


            right++;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
