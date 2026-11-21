class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi=Integer.MIN_VALUE;
        int m=accounts.length;
        int n=accounts[0].length;
        for(int i=0; i<m; i++){
            int sum=0;
            for(int j=0; j<n; j++){
                sum+=accounts[i][j];
            }
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
}