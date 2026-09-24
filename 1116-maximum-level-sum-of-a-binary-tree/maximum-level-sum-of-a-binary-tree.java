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
    public int maxLevelSum(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        int maxi=Integer.MIN_VALUE;
        int level=0;
        int currLevel=0;
        q.add(new Pair(root,1));
        while(q.size()>0){
            int size=q.size();
            int sum=0;
            for(int i=0; i<size; i++){
                Pair front=q.remove();
                sum+=front.root.val;
                if(front.root.right!=null)
                q.add(new Pair(front.root.right,front.level+1));
                if(front.root.left!=null)
                q.add(new Pair(front.root.left,front.level+1));
                currLevel=front.level;
            }
            if(sum>maxi){
                maxi=sum;
                level=currLevel;
            }
        }
        return level;
    }
}

class Pair{
    int level; TreeNode root;
    Pair(TreeNode root,int level){
        this.root=root;
        this.level=level;
    }
}