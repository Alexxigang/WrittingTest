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
        int m = (int)Math.ceil((double)n/c);
        System.out.println(m);
        int last = n%m;
        int sum = 0,num=0,preSum = 0;
        int k = r%m;
        for(int i=1;i<=n-last;i++){
            int temptK = i%m,temptIndex = i/m;
//            rooms[temptIndex][temptK] = grades[i-1][1];
            preSum += grades[i-1][1];
            if(r <= n-last && temptK == k){
                sum += grades[i-1][1];
                num += 1;
            }
        }
        if(num > 0){
            if(last == c){
                for(int i= n-last+1;i<=n;i++){
                    if(i%m == k){
                        sum += grades[i-1][1];
                        num += 1;
                    }
                }
                double res = (double)((double)sum/(double)num);
                System.out.print(res);
            }
            else{
                int lastSum = 0;
                for(int i= n-last+1;i<=n;i++){
                    lastSum += grades[i-1][1];
                }
                int allSum= last * sum + lastSum;
                double meanOne = (double)(allSum)/(num+1) + (double)(sum)/num;
                double res = (double)(meanOne/(last +1));
                System.out.print(res);
            }
        }
        else{
            int allSum = preSum + grades[r-1][1]*c;
            double res = (double)((double)allSum/(double)((m)*c));
            System.out.print(res);
        }


    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solute();
    }
}