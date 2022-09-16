package com.write.code.realgang.ponyTest.testThree;

import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-16 20:14
 **/
public class Main {

    int maxRes = 0;
    public void solution () {
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();
        reader.nextLine();
        String word = reader.nextLine();
        boolean[] visited = new boolean[N];
        backTrack(word,'p',visited,0);

        System.out.println(maxRes);
    }

    public void backTrack(String word,char charLoc,boolean[] visited,int count) {
//        if (charLoc == 'f') {
//            charLoc = 'p';
//            count++;
//            maxRes = Math.max(maxRes,count);
//        }

        for (int i = 0;i < word.length();i++) {
            if (visited[i] || word.charAt(i) != charLoc) {
                continue;
            }
            visited[i] = true;
            char newCharLoc = charLoc;
            int newCount = count;
            if (charLoc == 'p') {
                newCharLoc = 'o';
            } else if (charLoc == 'o') {
                newCharLoc = 'n';
            } else if (charLoc == 'n') {
                newCharLoc = 'y';
            } else if (charLoc == 'y') {
                newCharLoc = 'p';
                newCount++;
                maxRes = Math.max(maxRes,newCount);
            }
            backTrack(word,newCharLoc,visited,newCount);
            visited[i] = false;
        }
    }
    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
