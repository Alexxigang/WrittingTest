package com.write.code.ruiqiang.ddTest.testOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void solute(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] peachs = new Integer[n];
        for(int i=0;i<n;i++){
            peachs[i] = sc.nextInt();
        }
        Arrays.sort(peachs,(a,b)->{
            return b-a;
        });
        int end = n-1;
        int sum=0;
        double mean;
        int maxRoom = 0;
//        for(int i=0;i<n;i++){
//            sum += peachs[i];
//            mean = (double)((double)sum/(double)(i+1));
//            if(peachs[i]>k*mean){
//                break;
//            }
//            maxRoom = i+1;
//        }
//        for(int i=0;i<n;i++){
//            sum += peachs[i];
//        }
        int left = 0;
        for(int i=0;i<n;i++){
            sum += peachs[i];
            mean = (double)((double)sum/(double)(i-left+1));
            while(peachs[left]> k*mean&&left<n){
                left ++;
                sum -= peachs[left];
                mean = (double)((double)sum/(double)(i-left+1));
            }
            maxRoom = Math.max(maxRoom,i-left+1);
        }
//        while(end >=0){
//            mean = (double)((double)sum/(double)(end+1));
//            if(peachs[end]<=k*mean){
//                maxRoom = end+1;
//                break;
//            }
//            end--;
//            sum -= peachs[end];
//
//        }
        System.out.println(maxRoom);
    }

    public static void main(String[] args) {

        Main ma = new Main();
        ma.solute();
    }
}
