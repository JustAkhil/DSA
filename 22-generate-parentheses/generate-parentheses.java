class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        helper(n,ans,"",0,0);
        return ans;
    }
    public void helper(int n,List<String>ans,String s,int l,int r){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) helper(n,ans,s+"(",l+1,r);
        if(r<l) helper(n,ans,s+")",l,r+1);
    }
}