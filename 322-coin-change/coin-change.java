class Solution {
    public int coinChange(int[] coins, int a) {
        if(a==0) return 0;
        int[][] dp=new int[coins.length][a+1];
        int ans = helper(0, coins, a, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static int helper(int i,int[] coins,int a,int[][] dp){
        if(i==coins.length){
            if(a==0) return 0;
            return Integer.MAX_VALUE;
        }
        if(dp[i][a]!=0) return dp[i][a]; 
        int skip=helper(i+1,coins,a,dp);
        if(a<coins[i])  return dp[i][a]=skip;
        int take=helper(i,coins,a-coins[i],dp);
        int pick=take==Integer.MAX_VALUE ? take :take+1;
        return dp[i][a]=Math.min(pick,skip);
    }
}