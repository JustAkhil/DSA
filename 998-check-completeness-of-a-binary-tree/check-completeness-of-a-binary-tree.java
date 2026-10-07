class Solution {
    public boolean isCompleteTree(TreeNode root) {
        int s=size(root);
        return isCBT(root,1,s);
    }

    public static boolean isCBT(TreeNode root,int idx,int size){
        if(root==null) return true;
        if(idx>size) return false;
        return isCBT(root.left,2*idx,size) && isCBT(root.right,2*idx+1,size);
    }

    public static int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
}