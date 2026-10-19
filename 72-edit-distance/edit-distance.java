class Solution {
    public int minDistance(String s1, String s2) {
        int m=s1.length(); int n=s2.length();
        int dp[][]= new int[m][n];
        for(int[] row : dp) Arrays.fill(row,-1);
        return helper(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
    }
    public static int helper(int i,int j,StringBuilder s1,StringBuilder s2,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=helper(i-1,j-1,s1,s2,dp);
        int replace=helper(i-1,j-1,s1,s2,dp);
        int remove=helper(i-1,j,s1,s2,dp);
        int insert=helper(i,j-1,s1,s2,dp);
        return dp[i][j]=1+Math.min(replace,Math.min(remove,insert));
    }
}