class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        return helper(root,ans,0);
    }

    public static List<Integer>helper(TreeNode root,List<Integer>ans,int level){
        if(root==null) return ans;
        if(level>=ans.size()) ans.add(root.val);
        else ans.set(level,root.val);

        helper(root.left,ans,level+1);
        helper(root.right,ans,level+1);
        return ans;
    }
}