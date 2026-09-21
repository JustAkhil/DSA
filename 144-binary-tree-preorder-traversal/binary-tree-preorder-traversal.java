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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        return treeTraversal(root,arr);
    }
    public static List<Integer> treeTraversal(TreeNode root,List<Integer>arr){
        if(root==null) return arr;
        arr.add(root.val);
        treeTraversal(root.left,arr);
        treeTraversal(root.right,arr);
        return arr;
    }
}