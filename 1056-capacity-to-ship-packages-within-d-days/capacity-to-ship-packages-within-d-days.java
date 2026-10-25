class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(int ele:arr){
            sum+=ele;
            max=Math.max(max,ele);
        }
        int low=max; int high=sum;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(days(mid,arr)<=days){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int days(int capacity,int[] arr){
        int c=capacity;
        int days=0;
        for(int ele : arr){
            if(capacity>=ele){
                capacity-=ele;
            }else{
                days++;
                capacity=c-ele;
            }
        }
        return ++days;
    }
}