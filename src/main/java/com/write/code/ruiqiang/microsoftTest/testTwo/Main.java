package com.write.code.ruiqiang.microsoftTest.testTwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public int solution(int[] X,int[] Y){
        double[] nums = new double[X.length];
        for(int i = 0;i < X.length;i++){
            nums[i] = Double.valueOf(X[i])/Double.valueOf(Y[i]);
        }
        Arrays.sort(nums);
        int res = 0;

        for(int i = 0;i < X.length;i++){
            double fraction = nums[i];
            int next = i+1;
            while(next < nums.length && fraction + nums[next] <= 1){
                if(fraction + nums[next]==1){
                    res+= 1;
                }
                next++;
            }

        }
        return res;
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
