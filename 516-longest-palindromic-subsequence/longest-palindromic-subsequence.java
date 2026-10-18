class Solution {
    public int longestPalindromeSubseq(String s1) {
        StringBuilder s2=new StringBuilder(s1);
        s2.reverse();
        int[][] dp=new int[s1.length()][s1.length()];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return LPS(s1.length()-1,s1.length()-1,s1,s2,dp);
    }
    public static int LPS(int i ,int j,String s1,StringBuilder s2,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+LPS(i-1,j-1,s1,s2,dp);
        return dp[i][j]=Math.max(LPS(i-1,j,s1,s2,dp),LPS(i,j-1,s1,s2,dp));
    }
}