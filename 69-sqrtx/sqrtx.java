class Solution {
    public int mySqrt(int n) {
        if (n == 0) return 0;

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square > n) {
                high = mid - 1;
            } else if (square < n) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return high;
    }
}