class Solution {
    public int[] singleNumber(int[] arr) {
        int xor=0;
        for(int ele : arr){
            xor ^=ele;
        }
        int mask=(xor&(xor-1))^xor;
        int b1=0;
        int b2=0;
        for(int ele:arr){
            if((mask&ele)==0) b1^=ele;
            else b2^=ele;
        }
        int[] ans={b1,b2};
        if(arr[0]>arr[1]){
            return ans;
        }
        else{
            arr[0]=arr[0]^arr[1];
            arr[1]=arr[1]^arr[0];
            arr[0]=arr[0]^arr[1];
        }
        return ans;
    }
}