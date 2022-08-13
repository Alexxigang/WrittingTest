package com.write.code.ruiqiang.microsoftTest.testTwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public int solution(int[] X,int[] Y){
        Stack<Integer> st = new Stack<>();
        double[] fractions = new double[X.length];
        for(int i=0;i<X.length;i++){
            fractions[i] = Double.valueOf(X[i])/Double.valueOf(Y[i]);
        }
        Arrays.sort(fractions);
        Map<Double,Integer> table = new HashMap<>();
        int result = 0;
        for(int i=0;i<X.length;i++){
            double tempt = fractions[i];
            int right = i+1;
            while(right< fractions.length&&tempt + fractions[right] <= 1){
                if(tempt + fractions[right]==1){
                    result+= 1;
                }
                right ++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,1,2,12,8,4};
        int[] y = new int[]{5,10,15,2,4,15,10,5};
        double x1 = Double.valueOf(x[0])/Double.valueOf(y[0]);
        double x2 = Double.valueOf(x[2])/Double.valueOf(y[2]);
        System.out.println(Double.valueOf(x[0])/Double.valueOf(y[0]));
        System.out.println(x1+x2);
        Main ma = new Main();
        System.out.println(ma.solution(x,y));
    }
}
