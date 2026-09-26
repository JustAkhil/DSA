class Solution {
    public TreeNode buildTree(int[] pre, int[] in) {
        int n=in.length;
        return helper(0,n-1,0,n-1,pre,in);
    }

    public static TreeNode helper(int preLo,int preHi,int inLo,int inHi,int[] pre,int[] in){
        if(inLo>inHi) return null;
        int val=pre[preLo];
        TreeNode root=new TreeNode(val);
        int r=0;
        for(int i=inLo; i<=inHi; i++){
           if(in[i]==val){
            r=i;
            break;
           } 
        }
        int cnt=r-inLo;
        root.left=helper(preLo+1,preLo+cnt,inLo,r-1,pre,in);
        root.right=helper(preLo+cnt+1,preHi,r+1,inHi,pre,in);
        return root; 
    }
}