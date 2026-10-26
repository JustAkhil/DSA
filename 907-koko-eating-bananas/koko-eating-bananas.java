class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        int ans=-1;
        for(int ele : arr){
            high=Math.max(high,ele);
        }
        while(low<=high){
            int speed=low+(high-low)/2;
            if(hour(speed,arr)<=h){
                high=speed-1;
                ans=speed;
            }else{
                low=speed+1;
            }
        }
        return ans;
    }

    public static long hour(int speed,int[] arr){
        long hour=0;
        for(int ele : arr){
            if(ele%speed==0) hour+=ele/speed;
            else hour+=(ele/speed)+1;
        }
        return hour;
    }
}