class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(root.val>p.val && root.val>q.val) return lowestCommonAncestor(root.left,p,q);
        if(root.val<p.val && root.val<q.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}



// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root==null) return null;
//         if(root.val==p.val || root.val==q.val) return root;
//         boolean pExist=isExist(root.left,p.val);
//         boolean qExist=isExist(root.left,q.val);
//         if(pExist && qExist) return lowestCommonAncestor(root.left,p,q);
//         if(!pExist && !qExist) return lowestCommonAncestor(root.right,p,q);
//         else return root;
//     }

//     public static boolean isExist(TreeNode root,int val){
//         if(root==null) return false;
//         if(root.val==val) return true;
//         return isExist(root.left,val)|| isExist(root.right,val);
//     }
// }