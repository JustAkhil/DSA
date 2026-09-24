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
    static int maxDepth;
    public int findBottomLeftValue(TreeNode root) {
        ans=root.val;
        maxDepth=-1;
        helper(root, 0);
        return ans;
    }
    public static void helper(TreeNode root, int depth) {
        if (root == null) return;
        if (depth > maxDepth) {
            maxDepth = depth;
            ans = root.val;
        }
        helper(root.left, depth + 1);
        helper(root.right, depth + 1);
    }
}