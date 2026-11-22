class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        while(i!=nums.length){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(nums[i],i);
            i++;
        }
        return new int[]{-1};
    }
}