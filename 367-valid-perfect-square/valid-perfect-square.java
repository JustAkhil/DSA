class Solution {
    public boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);

        if (sqrt * sqrt == num) {
            return true;
        } else {
            return false;
    }
    
}
}