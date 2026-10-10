class Solution {
    public int matrixScore(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0; i<m; i++){
            if(arr[i][0]==0){
                for(int j=0; j<n; j++){
                    arr[i][j] ^=1;
                }
            }
        }
        for(int j=0; j<n; j++){
            int zeroCnt=0,onceCnt=0;
            for(int i=0; i<m; i++){
                if(arr[i][j]==1) onceCnt++;
                else zeroCnt++;
            }
            if(zeroCnt>onceCnt){
                for(int i=0; i<m; i++){
                    arr[i][j]^=1;
                }
            }
        }
        int sum=0;
        int pow=1;
        for(int j=n-1; j>=0; j--){
            int cnt=0;
            for(int i=0; i<m; i++){
                if(arr[i][j]==1) cnt++;
            }
            sum+=pow*cnt;
            pow=pow*2;
        }
        return sum;
    }
}