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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        inOrder(root,ans,k);
        if(k>ans.size()) return -1;
        return ans.get(k-1);
    }
    public static void inOrder(TreeNode root,ArrayList<Integer>ans,int k){
        if(root==null) return;
        inOrder(root.left,ans,k);
        ans.add(root.val);
        inOrder(root.right,ans,k);
    }
}