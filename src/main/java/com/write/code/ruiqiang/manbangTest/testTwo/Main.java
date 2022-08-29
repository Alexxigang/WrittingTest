package com.write.code.ruiqiang.manbangTest.testTwo;

import java.util.Scanner;

public class Main {
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] f = new int[n];
        for(int i=0;i<n;i++){
            f[i] = sc.nextInt();
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int max_res = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                int tempt = Math.max(0,f[j]-Math.abs(i-j)*c);
                max_res = Math.max(tempt,max_res);
            }
            res[i] = max_res;
            System.out.print(res[i]);
            if(i<n-1){
                System.out.print(" ");
            }

        }

    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solution();
    }
}
