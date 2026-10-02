class Solution {
    public TreeNode sortedArrayToBST(int[] ans) {
        return helper(0,ans.length-1,ans);
    }
    public static TreeNode helper(int low,int high,int[] ans){
        if(low>high) return null;
        int mid=low+(high-low)/2;
        TreeNode root=new TreeNode(ans[mid]);
        root.left=helper(low,mid-1,ans);
        root.right=helper(mid+1,high,ans);
        return root;
    }
}