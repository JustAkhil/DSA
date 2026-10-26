class Solution {
    public int smallestDivisor(int[] arr, int k) {
        int low=1;
        int high=Integer.MIN_VALUE;
        int ans=-1;
        for(int ele : arr) high=Math.max(high,ele);
        while(low<=high){
            int divisor=low+(high-low)/2;
            if(total(divisor,arr)<=k){
                high=divisor-1;
                ans=divisor;
            }else{
                low=divisor+1;
            }
        }
        return ans;
    }
    public static int total(int divisor,int[] arr){
        int sum=0;
        for(int ele : arr){
            if(ele%divisor==0) sum+=ele/divisor;
            else if(ele<divisor) sum+=1;
            else sum+=(ele/divisor)+1;
        }
        return sum;
    }
}