package com.write.code.realgang.meituanTest.testThree;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-13 11:59
 **/
public class Main {

    public void sulution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] pukes = new int[n];

        for (int i = 0;i < n;i++) {
            pukes[i] = reader.nextInt();
        }

        if (n <= 2) {
            for (int i = 0;i < n;i++) {
                System.out.print(pukes[i]);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            return;
        }

        LinkedList<Integer> deque = new LinkedList<>();
        deque.addFirst(pukes[n - 2]);
        deque.addLast(pukes[n - 1]);

        for (int i = n - 3;i >= 0;i--) {
            deque.addFirst(pukes[i]);
            int last = deque.peekLast();
            deque.pollLast();
            deque.addFirst(last);

            last = deque.peekLast();
            deque.pollLast();
            deque.addFirst(last);
        }

        for (int x:deque) {
            n -= 1;
            System.out.print(x);
            if (n > 0) {
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.sulution();
    }
}
