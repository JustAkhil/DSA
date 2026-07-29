class Solution {
    public int maximumCount(int[] arr) {
        int posFirstIdx=arr.length-posFirstIndex(arr);
        int negCount=firstNonNegativeNum(arr);
        return Math.max(posFirstIdx,negCount);
    }
    public static int firstNonNegativeNum(int[] arr){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=0){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int posFirstIndex(int[] arr){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>0){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}