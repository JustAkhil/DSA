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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode>q=new LinkedList<>();
        ArrayList<Long>ans=new ArrayList<>();
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            long sum=0;
            for(int i=0; i<n; i++){
                TreeNode front=q.remove();
                sum+=front.val;
                if(front.left!=null)
                q.add(front.left);
                if(front.right!=null)
                q.add(front.right);
            }
            ans.add(sum);
        }
        if(ans.size()<k) return -1;
        Collections.sort(ans);
        return ans.get(ans.size()-k);
    }
}