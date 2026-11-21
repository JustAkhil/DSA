class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int cnt=0;
        for(int ele : nums){
            cnt+=map.getOrDefault(ele,0);
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        return cnt;
    }
}