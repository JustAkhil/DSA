class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>init=new ArrayList<>();
        sub(init,nums,0,ans);
        return ans;
    }
    public static void sub(List<Integer>init,int[] nums,int idx,List<List<Integer>>ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(init));
            return;
        }
        List<Integer> include = new ArrayList<>(init);
        include.add(nums[idx]);
        sub(include, nums, idx + 1, ans);
        sub(init, nums, idx + 1, ans);
    }
}