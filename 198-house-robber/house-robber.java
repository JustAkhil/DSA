class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(0,nums,dp);
    }
    public static int helper(int idx,int[] arr,int[] dp){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int pick=arr[idx]+helper(idx+2,arr,dp);
        int skip=helper(idx+1,arr,dp);
        dp[idx]=Math.max(pick,skip);
        return dp[idx];
    }
}