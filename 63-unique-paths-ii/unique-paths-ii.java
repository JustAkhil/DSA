class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length-1;
        int n=arr[0].length-1;
        int[][] dp=new int[m+1][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(m,n,arr,dp);
    }

    public static int helper(int m,int n,int[][] arr,int[][] dp){
        if(m<0 || n<0) return 0;
        if(arr[m][n]==1) return 0;
        if (m == 0 && n == 0) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        return dp[m][n]=helper(m-1,n,arr,dp)+helper(m,n-1,arr,dp);
    }
}