class Solution {
    public TreeNode bstFromPreorder(int[] pre) {
        int n=pre.length;
        return helper(pre,0,n-1);
    }

    public static TreeNode helper(int[]pre,int low,int high){
        if(low>high) return null;
        TreeNode root=new TreeNode(pre[low]);
        int i=low+1;
        while(i<=high && pre[i]<pre[low]) i++;
        root.left=helper(pre,low+1,i-1);
        root.right=helper(pre,i,high);
        return root;
    }
}