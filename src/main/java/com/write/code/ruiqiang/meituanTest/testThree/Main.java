package com.write.code.ruiqiang.meituanTest.testThree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] pukes = new int[n];
        for(int i=0;i<n;i++){
            pukes[i] = reader.nextInt();
        }
        if(n<=2){
            for(int i=0;i<n;i++){
                System.out.print(pukes[i]);
                if(i<n-1){
                    System.out.print(" ");
                }

            }
            return;
        }
        LinkedList<Integer> deque = new LinkedList<>();
        deque.addFirst(pukes[n-2]);
        deque.addLast(pukes[n-1]);
        for(int i=n-3;i>=0;i--){
            deque.addFirst(pukes[i]);
            int last = deque.peekLast();
            deque.pollLast();
            deque.addFirst(last);
            last = deque.peekLast();
            deque.pollLast();
            deque.addFirst(last);
        }
        for(Integer x:deque){
            n -= 1;
            System.out.print(x);
            if(n>0){
                System.out.print(" ");
            }
        }
    }
}
