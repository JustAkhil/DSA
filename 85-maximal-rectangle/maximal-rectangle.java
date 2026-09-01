class Solution {
    public static int maxHist(int[] arr){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int[] nse=new int[n];
        nse[n-1]=n;
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>= arr[i]) st.pop();
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();
        
        int[] pse=new int[n];
        st.push(0);
        pse[0]=-1;
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int maxi=0;
        
        for(int i=0; i<n; i++){
            int area=arr[i]*(nse[i]-pse[i]-1);
            maxi=Math.max(maxi,area);
        }
        return maxi;
        
        
    }
    public int maximalRectangle(char[][] arr) {
        int n=arr.length;
        int m=arr[0].length;

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = arr[i][j]-'0';
            }
        }
        
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==1) matrix[i][j] +=matrix[i-1][j];
            }
        }
        int maxi=0;
        for(int[] row : matrix){
            int area=maxHist(row);
            maxi=Math.max(maxi,area);
        }
        return maxi;
    }
}