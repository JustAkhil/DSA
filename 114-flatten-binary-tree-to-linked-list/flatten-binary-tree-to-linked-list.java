class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode>ans=new ArrayList<>();
        dfs(ans,root);
        for(int i=0; i<ans.size()-1; i++){
           TreeNode right=ans.get(i);
           TreeNode next=ans.get(i+1);
           right.right=next;
           right.left=null;
        }
        TreeNode last= ans.get(ans.size()-1);
        last.right=null;
        last.left=null;
    }

    public static void dfs(ArrayList<TreeNode>ans,TreeNode root){
        if(root==null) return;

        ans.add(root);
        dfs(ans,root.left);
        dfs(ans,root.right);
    }
}