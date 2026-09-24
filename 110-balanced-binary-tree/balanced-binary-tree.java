class Solution {
    static boolean flag;
    static int height;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        flag=true;
        helper(root);
        return flag;
    }
    public static void helper(TreeNode root){
        if(root==null){
            height=-1;
            return;
        }

        helper(root.left);
        int leftNodeHeight=height;
        helper(root.right);
        int rightNodeHeight=height;
        if(Math.abs(leftNodeHeight-rightNodeHeight)>1) {
            flag=false;
        }

        height = 1+Math.max(rightNodeHeight,leftNodeHeight);
    }
}
// class Solution {
//     static boolean flag;
//     public boolean isBalanced(TreeNode root) {
//         if(root==null) return true;
//         flag=true;
//         helper(root);
//         return flag;
//     }
//     public static int helper(TreeNode root){
//         if(root==null) return 0;
//         int leftNodeHeight=helper(root.left);
//         int rightNodeHeight=helper(root.right);
//         if(Math.abs(leftNodeHeight-rightNodeHeight)>1) {
//             flag=false;
//         }

//         return 1+Math.max(rightNodeHeight,leftNodeHeight);
//     }
// }