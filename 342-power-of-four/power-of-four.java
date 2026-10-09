class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        return isPowerOfTwo(n)&&isPerfectSquare(n);
    }
    public boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public boolean isPerfectSquare(int n){
        long root=(long)(Math.sqrt(n));
        return (root*root==n); 
    }
}