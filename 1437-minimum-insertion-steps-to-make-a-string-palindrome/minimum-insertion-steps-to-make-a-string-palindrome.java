class Solution {
    public int minInsertions(String s1) {
        StringBuilder s2=new StringBuilder(s1);
        s2.reverse();
        int len=s1.length();
        int[][] dp=new int[len][len];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return len-helper(len-1,len-1,s1,s2,dp);
    }
    public static int helper(int i,int j,String s1,StringBuilder s2, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+helper(i-1,j-1,s1,s2,dp);
        return dp[i][j]=Math.max(helper(i-1,j,s1,s2,dp),helper(i,j-1,s1,s2,dp));
    } 
}