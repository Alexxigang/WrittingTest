package com.write.code.ruiqiang.meituanTest2.testOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        System.out.println(a);
        System.out.println(b);
        sc.close();
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        char[] res = new char[n*2];
        for(int i=0;i<2*n;i+=2){
            int index = i/2;
            System.out.println(index);
            System.out.println(i);
            res[i] = aChar[index];
            res[i+1] = bChar[index];
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }

}
