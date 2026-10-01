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
    static int ans;
    static int k2;
    public int kthSmallest(TreeNode root, int k) {
        k2=k;
        ans=-1;
        inOrder(root);
        return ans;
    }
    public static void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        k2--;
        if(k2==0){
            ans=root.val;
            return;
        }
        inOrder(root.right);
    }
}