class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        return helper(ans,arr,root);

    }
    public static List<String>helper(List<String>ans,List<Integer>arr,TreeNode root){
        if(root==null) return ans;

        arr.add(root.val);
        if(root.left==null && root.right==null){
            String str="";
            for(int i=0; i<arr.size(); i++){
                str+=arr.get(i);

                if(i!=arr.size()-1){
                    str+="->";
                }
            }
            ans.add(str);
            arr.remove(arr.size()-1);
            return ans;
        }
        helper(ans,arr,root.right);
        helper(ans,arr,root.left);
        arr.remove(arr.size()-1);
        return ans;
    }
}