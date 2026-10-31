
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(arr[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        helper(0, arr, n, ans);

        return ans;
    }

    public static void helper(int row, char[][] arr, int n,List<List<String>> ans){
        if(row == n){
            List<String> temp = new ArrayList<>();

            for(int i = 0; i < n; i++){
                temp.add(new String(arr[i]));
            }

            ans.add(temp);
            return;
        }

        for(int col = 0; col < n; col++){
            if(isPlaced(row, col, arr, n)){
                arr[row][col] = 'Q';

                helper(row + 1, arr, n, ans);

                arr[row][col] = '.';
            }
        }
    }

    public static boolean isPlaced(int row, int col,
                                   char[][] arr, int n){

        int i = row - 1;

        while(i >= 0){
            if(arr[i][col] == 'Q') return false;
            i--;
        }

        i = row - 1;
        int j = col - 1;

        while(i >= 0 && j >= 0){
            if(arr[i][j] == 'Q') return false;
            i--;
            j--;
        }

        i = row - 1;
        j = col + 1;

        while(i >= 0 && j < n){
            if(arr[i][j] == 'Q') return false;
            i--;
            j++;
        }

        return true;
    }
}
