class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=arr.length,col=arr[0].length;
        int low=0, high=(row*col)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int rowMid=mid/col;
            int colMid=mid%col;
            if(arr[rowMid][colMid]==target) return true;
            else if(arr[rowMid][colMid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}