class Solution {
    static int absSum;
    public int findTargetSumWays(int[] nums, int target) {
        absSum=0;
        for(int ele : nums){
            absSum+=Math.abs(ele);
        }
        int[][] dp= new int[nums.length][2*absSum+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        return helper(0,0,target,nums,dp);
    }
    public static int helper(int i,int sum,int target,int[] arr,int[][] dp){
        if(i==arr.length){
            if(sum==target) return 1;
            return 0;
        }
        if(dp[i][absSum-sum]!=-1) return dp[i][absSum-sum]; 
        int add= helper(i+1,sum+arr[i],target,arr,dp);
        int sub= helper(i+1,sum-arr[i],target,arr,dp);
        return dp[i][absSum-sum]=add+sub;
    }
}