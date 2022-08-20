package com.write.code.ruiqiang.meituanTest2.testFour;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b= new int[m];
        int maxLen = n>m ? n:m;
        boolean aL = true;
        boolean bL = true;
        int aIndex = n,bIndex=m;
        int aPosNum=0,bPosNum=0;
        int aPosSum = 0,aNegSum=0;
        int bPosSum = 0,bNegSum=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i]<0){
                aNegSum += Math.abs(a[i]);
                if(aIndex==n)aIndex = i;
            }
            else{
                aPosSum += Math.abs(a[i]);
                aPosNum ++;
            }
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
            if(b[i]<0){
                bNegSum += Math.abs(b[i]);
                if(bIndex==m)bIndex = i;
            }
            else{
                bPosSum += Math.abs(b[i]);
                bPosNum++;
            }
        }
        Integer[] aCopy = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Integer[] bCopy = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(aCopy, Collections.reverseOrder());
        int result = 0;
        if(aIndex==n&&bIndex==m){
            int sumA=0,sumB=0;
            for(int i=0;i<n;i++){
                sumA += a[i];
            }
            for(int i=0;i<m;i++){
                sumB += b[i];
            }
            result = Math.abs(sumA-sumB);

        }
        else{
            result = Math.abs(aPosSum-bPosSum) + Math.abs(aNegSum-bNegSum);
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
