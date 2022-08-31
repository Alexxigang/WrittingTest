package com.write.code.realgang.huaweiTest.testOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-31 18:54
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        String originText = reader.nextLine();
        String[] originTextArr = originText.split(" ");

        String words = reader.nextLine();
        String[] wordList = words.split(" ");

        Map<String,Integer> wordMap = new HashMap<>();
        for (int i = 0;i < wordList.length;i++) {
            wordMap.put(wordList[i].toLowerCase(),i);
        }

        boolean meetDouble = false;
        boolean isFirstDouble = false;

        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = 0;
        int len = originText.length();
        while (start < len && end < len) {

            while (start < len && originText.charAt(start) == ' ') {
                sb.append(originText.charAt(start));
                start++;
            }
            if (start == len) {
                break;
            }
//            if (originText.charAt(start) == '\"') {
//                isFirstDouble = !isFirstDouble;
//                if (!isFirstDouble) {
//                    meetDouble = false;
//                } else {
//                    meetDouble = true;
//                }
//            }
            end = start;

            while (end < len && originText.charAt(end) != ' ') {
                end++;
            }
            String subStr = originText.substring(start,end);
            if (!meetDouble) {
                if (wordMap.containsKey(subStr.toLowerCase())) {
                    sb.append(wordMap.get(subStr.toLowerCase()));
                } else {
                    sb.append(subStr);
                }
            } else {
                sb.append(subStr);
            }
//            if (end < len) {
//                sb.append(originText.charAt(end));
//            }
            if (subStr.equals("\"")) {
                isFirstDouble = !isFirstDouble;
                if (!isFirstDouble) {
                    meetDouble = false;
                } else {
                    meetDouble = true;
                }
            }

            start = end;

        }

        System.out.println(sb);

//        for (int i = 0;i < originTextArr.length;i++) {
//            if (originTextArr[i].equals("\"")) {
//                isFirstDouble = !isFirstDouble;
//                if (!isFirstDouble) {
//                    meetDouble = false;
//                } else {
//                    meetDouble = true;
//                }
//            }
//            if (!meetDouble) {
//                if (wordMap.containsKey(originTextArr[i].toLowerCase())) {
//                    originTextArr[i] = String.valueOf(wordMap.get(originTextArr[i].toLowerCase()));
//                }
//            }
//
//        }
//        int index = 0;
//        if (originText.charAt(0) == ' ') {
//            System.out.printf(" ");
//        }
//        for (;index < originTextArr.length - 1;index++) {
//            System.out.printf(originTextArr[index] + " ");
//        }
//
//        if (index < originTextArr.length) {
//            System.out.printf(originTextArr[index]);
//            if (originText.charAt(originText.length() - 1) == ' ') {
//                System.out.printf(" ");
//            }
//        }

    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
