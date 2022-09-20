package com.write.code.realgang.ponyTest.testThree;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
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

        LinkedList<Integer> pQue = new LinkedList<>();
        LinkedList<Integer> oQue = new LinkedList<>();
        LinkedList<Integer> nQue = new LinkedList<>();
        LinkedList<Integer> yQue = new LinkedList<>();

        for (int i = 0;i < word.length();i++) {
            char charLoc = word.charAt(i);
            if (charLoc == 'p') {
                pQue.addLast(i);
            } else if (charLoc == 'o') {
                oQue.addLast(i);
            } else if (charLoc == 'n') {
                nQue.addLast(i);
            } else if (charLoc == 'y') {
                yQue.addLast(i);
            }
        }

        int count = 0;
        while (!pQue.isEmpty() && !oQue.isEmpty()  && !yQue.isEmpty() && !yQue.isEmpty() ) {
            int pIndex = pQue.pollFirst();
            while (!oQue.isEmpty() && oQue.peekFirst() < pIndex) {
                oQue.pollFirst();
            }
            if (oQue.isEmpty()) {
                break;
            }
            int oIndex = oQue.pollFirst();

            while (!nQue.isEmpty() && nQue.peekFirst() < oIndex) {
                nQue.pollFirst();
            }
            if (nQue.isEmpty()) {
                break;
            }
            int nIndex = nQue.pollFirst();

            while (!yQue.isEmpty() && yQue.peekFirst() < nIndex) {
                yQue.pollFirst();
            }
            if (yQue.isEmpty()) {
                break;
            }
            yQue.pollFirst();
            count++;

        }
//        boolean[] visited = new boolean[N];
//        backTrack(word,'p',visited,0);

        System.out.println(count);
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
