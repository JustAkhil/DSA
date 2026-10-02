class Solution {
    static int maxSum;
    public int maxSumBST(TreeNode root){
        maxSum=0;
        helper(root);
        return maxSum;
    }
    public static Quad helper(TreeNode root){
        if(root==null) 
        return new Quad(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
        Quad lst=helper(root.left);
        Quad rst=helper(root.right);
        int max=Math.max(root.val,Math.max(lst.max,rst.max));
        int min=Math.min(root.val,Math.min(lst.min,rst.min));
        boolean isBst=root.val>lst.max && root.val<rst.min && lst.isBst && rst.isBst;
        if(isBst){
            int sum=root.val+lst.sum+rst.sum;
            maxSum=Math.max(sum,maxSum);
            return new Quad(min,max,sum,true);
        }
        return new Quad(min,max,0,isBst);
    }
}

class Quad{
    int max;
    int min;
    int sum;
    boolean isBst;
    Quad(int min,int max,int sum,boolean isBst){
        this.max=max;
        this.min=min;
        this.isBst=isBst;
        this.sum=sum;
    }
}