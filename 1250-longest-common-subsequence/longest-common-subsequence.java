class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m=s1.length()-1;
        int n=s2.length()-1;
        int[][] dp=new int[m+1][n+1];
        for(int[] row : dp) Arrays.fill(row,-1);
        return LCS(m,n,s1,s2,dp);
    }
    public static int LCS(int i,int j,String s1,String s2,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+LCS(i-1,j-1,s1,s2,dp);
        return dp[i][j]=Math.max(LCS(i,j-1,s1,s2,dp),LCS(i-1,j,s1,s2,dp));
    }
}