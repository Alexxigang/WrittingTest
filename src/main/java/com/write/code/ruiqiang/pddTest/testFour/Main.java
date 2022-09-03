package com.write.code.ruiqiang.pddTest.testFour;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void solute(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int r = sc.nextInt();
        int[][] grades = new int[n][2];
        for(int i=0;i<n;i++){
            grades[i][0] = sc.nextInt();
            grades[i][1] = sc.nextInt();
        }
        Arrays.sort(grades,(a,b)->{
            if(a[1] == b[1]){
                return a[0]-b[0];
            }
            return b[1]-a[1];
        });
        int m = (int)Math.ceil(n/c);
        int[][] rooms = new int[m][c];
        int last = n%m;
        int sum = 0,num=0;
        int k = r%m;
        for(int i=1;i<=n-last;i++){
            int temptK = i%m,temptIndex = i/m;
            rooms[temptIndex][temptK] = grades[i-1][1];
            if(r <= n-last && temptK == k){
                sum += grades[i-1][1];
                num += 1;
            }
        }
        if(num > 0){
            if(last == c)
        }


    }

    public static void main(String[] args) {

    }
}
