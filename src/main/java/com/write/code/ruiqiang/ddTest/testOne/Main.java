package com.write.code.ruiqiang.ddTest.testOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void solute(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] peachs = new int[n];
        for(int i=0;i<n;i++){
            peachs[i] = sc.nextInt();
        }
        Arrays.sort(peachs);
        int end = n-1;
        int sum;
        double mean;
        int maxRoom = 0;
        int start = 0;
        while(start <= n-1){

        }
        while(end >=0){

            sum = 0;
            for(int i=0;i<=end;i++){
                sum += peachs[i];
            }
            mean = (double)((double)sum/(double)(end+1));
            if(peachs[end]<=k*mean){
                maxRoom = end+1;
                break;
            }
            end--;

        }
        System.out.println(maxRoom);
    }

    public static void main(String[] args) {

        Main ma = new Main();
        ma.solute();
    }
}
