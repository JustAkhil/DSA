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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        return treeTraversal(arr,root);
    }
    public static List<Integer> treeTraversal(List<Integer>arr,TreeNode root){
        if(root==null) return arr;
        treeTraversal(arr,root.left);
        treeTraversal(arr,root.right);
        arr.add(root.val);
        return arr;
    }
}