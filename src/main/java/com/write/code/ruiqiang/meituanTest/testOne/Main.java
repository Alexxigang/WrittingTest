package com.write.code.ruiqiang.meituanTest.testOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int t = reader.nextInt();
        int[] deadlines = new int[n];
        for(int i=0;i<n;i++){
            deadlines[i] = reader.nextInt();
        }
        Arrays.sort(deadlines);
        int times = 0;
        int limit = n*t;
        int curIndex = -1;
        for(int i=n-1;i>=0;i--){
            if(deadlines[i]<limit){
                curIndex = i;
                break;
            }
        }
        if(curIndex==-1){
            System.out.println(times);
            return;
        }
        int curStep = deadlines[curIndex];
        for(int i=curIndex-1;i>=0;i--){
            if(curStep<t){
                times ++;
            }
            else if(deadlines[i]> curStep-t){
                times += 1;
            }
            else{
                curStep = deadlines[i];
            }
        }
        System.out.println(times);


    }

}
