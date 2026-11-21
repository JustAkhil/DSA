class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi=Integer.MIN_VALUE;
        List<Boolean>ans=new ArrayList<>();
        for(int ele : candies){
            maxi=Math.max(maxi,ele);
        }
        for(int i=0; i<candies.length; i++){
            if(maxi>extraCandies+candies[i]){
                ans.add(false);
            }else{
                ans.add(true);
            }
        }
        return ans;
    }
}