class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0; i<nums.length; i++){
            if(i==nums[i]) continue;
            return i;

        }
        return i;
    }
}