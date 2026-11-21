class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq= new int[101];
        int[] ans=new int[nums.length];

        for(int ele : nums){
            freq[ele]++;
        }

        for(int i=1; i<101; i++){
            freq[i]+=freq[i-1];
        }

        for(int i=0; i<nums.length; i++){
           if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = freq[nums[i] - 1];
            }
        }
        return ans;
    }
}