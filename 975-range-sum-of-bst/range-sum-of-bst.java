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
    public int rangeSumBST(TreeNode root, int l, int h) {
        return helper(root,l,h,0);
    }

    public static int helper(TreeNode root,int l,int h,int sum){
        if(root==null) return sum;
        if(root.val>=l && root.val<=h) sum+=root.val;
        sum=helper(root.left,l,h,sum);
        sum=helper(root.right,l,h,sum);
        return sum;
    }
}