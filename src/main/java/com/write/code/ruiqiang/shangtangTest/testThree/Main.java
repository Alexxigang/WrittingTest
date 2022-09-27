package com.write.code.ruiqiang.shangtangTest.testThree;

public class Main {
    public int pick (int[] nums) {
        // write code here
        int n = nums.length;
        if(n<1)return 0;
        else if(n==1) return nums[0];
        int[][] dp = new int[n-1][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        int maxRes = Integer.MIN_VALUE;
        maxRes = Math.max(maxRes,dp[0][1]);
        for(int i=1;i<n-1;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = dp[i-1][0] + nums[i];
            maxRes = Math.max(maxRes,Math.max(dp[i][0],dp[i][1]));
        }
        dp[0][0] = 0;
        dp[0][1] = nums[1];
        maxRes = Math.max(maxRes,dp[0][1]);
        for(int i=1;i<n-1;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = dp[i-1][0] + nums[i-1];
            maxRes = Math.max(maxRes,Math.max(dp[i][0],dp[i][1]));
        }
        return maxRes;
    }
}
