class Solution {
    public int change(int sum, int[] coins) {
        int[][] dp=new int[coins.length][sum+1];
        for(int[] row :dp){
            Arrays.fill(row,-1);
        }
        return helper(0,coins,sum,dp);
    }
    public static int helper(int i,int[] coins,int sum, int[][] dp){
        if(sum==0) return 1;
        if(i==coins.length) return 0;
        if(dp[i][sum]!=-1) return dp[i][sum];
        int pick=0;
        if(sum>=coins[i]){
            pick=helper(i,coins,sum-coins[i],dp);
        }
        int skip=helper(i+1,coins,sum,dp);
        return dp[i][sum]= pick+skip;
    }
}