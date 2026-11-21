class Solution {
    public int[] buildArray(int[] arr) {
       solve(0,arr);
       return arr;
    }
    public static void solve(int i,int[] arr){
        if(i==arr.length) return;
        int res=arr[arr[i]];
        solve(i+1,arr);
        arr[i]=res;
    }
}