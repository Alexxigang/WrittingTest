package com.write.code.ruiqiang;

import java.util.Scanner;

public class TestTwo {

    public void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] absA = new int[n-1];
        for(int i=0;i<n-1;i++){
            absA[i] = Math.abs(a[i]-a[i+1]);
        }
        double maxRes = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            double tempt = absA[i];
            maxRes = Math.max(maxRes,tempt);
            for(int j=i+1;j<n-1;j++){
                double pre = Math.pow(-1.0,(double)(j-i))*(double)absA[j];
                tempt += pre;
                maxRes = Math.max(maxRes,tempt);
            }
        }
        System.out.println(maxRes);
    }

    public static void main(String[] args) {
        TestTwo two = new TestTwo();
        two.solution();
    }
}
