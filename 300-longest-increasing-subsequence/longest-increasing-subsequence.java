class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int[][] dp=new int[n][n+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return helper(0,-1,arr,dp);
    }

    public static int helper(int idx,int prevIdx,int[] arr,int[][] dp){
        if(idx>=arr.length) return 0;
        if(dp[idx][prevIdx+1]!=-1) return dp[idx][prevIdx+1];
        int skip=helper(idx+1,prevIdx,arr,dp);
        if(prevIdx!=-1 && arr[idx]<=arr[prevIdx])
        return skip;
        int pick=1+helper(idx+1,idx,arr,dp);
        return dp[idx][prevIdx+1]=Math.max(pick,skip);
    }
}