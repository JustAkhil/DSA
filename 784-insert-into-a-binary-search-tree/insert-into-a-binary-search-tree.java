/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return  helper(root,val);
    }

    public static TreeNode helper(TreeNode root,int k){
        if(root==null) return new TreeNode(k);
        if(root.val==k) return root;
        if(root.val>k){
            if(root.left==null){
                root.left=new TreeNode(k);
                return root;
            }else helper(root.left,k);
        }else{
            if(root.right==null){
                root.right=new TreeNode(k);
                return root;
            }else helper(root.right,k);
        }
        return root;
    }
}