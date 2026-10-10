class Solution {
    public int singleNumber(int[] arr) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int cnt = 0;

            for (int ele : arr) {
                if (((ele >> i) & 1) == 1) {
                    cnt++;
                }
            }

            if (cnt % 3 != 0) {
                ans |= (1 << i);
            }
        }

        return ans;
    }
}