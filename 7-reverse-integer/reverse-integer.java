class Solution {
    public int reverse(int x) {
        boolean negative=x<0;
        x=Math.abs(x);
        int rev=0;

        while (x != 0) {
            int digit = x % 10;
             if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            x /= 10;
            rev = rev * 10 + digit;
        }

        if(negative){
            rev=-rev;
        }

        return rev;
    }
}