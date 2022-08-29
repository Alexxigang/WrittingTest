package com.write.code.realgang.wangyiTest.testOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-08-13 09:49
 **/
public class Main {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        Random random = new Random();
        System.out.println(random.nextInt(100));
//        System.out.println(0);

    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
