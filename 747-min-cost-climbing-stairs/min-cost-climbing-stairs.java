class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp= new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(0,cost,dp),helper(1,cost,dp));
    }

    public static int helper(int idx,int[] arr,int[] dp){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=arr[idx]+Math.min(helper(idx+2,arr,dp),helper(idx+1,arr,dp));
    }
}