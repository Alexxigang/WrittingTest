package com.write.code.ruiqiang.guangliandaTest.testOne;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public void solute(){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] starts = new int[n];
        int[] ends = new int[n];
        int[] startMap = new int[n+1];
        int[] endMap = new int[n+1];
        for(int i=0;i<n;i++){
            starts[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            ends[i] = sc.nextInt();
        }
//        for(int i=1;i<n+1;i++){
//            startMap[starts[i-1]] = i-1;
//            endMap[ends[i-1]] = i-1;
//        }
        int num = 0;
//        for(int i=1;i<n+1;i++){
//            if(startMap[i]>=endMap[i]){
//                num ++;
//            }
//        }
        LinkedList<Integer> startQue = new LinkedList<>();
        LinkedList<Integer> endStack = new LinkedList<>();
        for(int i=0;i<n;i++){
            startQue.addLast(starts[i]);
        }
        for(int i=0;i<n;i++){
            int cur = startQue.peekFirst();
            if(cur!=ends[i]){
                num ++;
                endStack.addLast(ends[i]);
            }
            else{
                startQue.pollFirst();
                while(!startQue.isEmpty()&&!endStack.isEmpty()&&startQue.peekFirst()==endStack.peekLast()){
                    startQue.pollFirst();
                    endStack.pollLast();
                }
            }
        }
        System.out.println(num);

    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solute();
    }
}
