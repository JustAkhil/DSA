class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Pair>q= new LinkedList<>();
        List<Integer>arr=new ArrayList<>();
        Stack<Pair>st=new Stack<>();
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front=q.remove();
            if(front.level%2==0){
                arr.add(front.root.val);
            }
            else{
                st.push(front);
            }
            if(front.root.left!=null) 
            q.add(new Pair(front.root.left,front.level+1));
            if(front.root.right!=null)
            q.add(new Pair(front.root.right,front.level+1));

            if(q.size()==0 || q.peek().level!=front.level){
                while(st.size()>0){
                    arr.add(st.pop().root.val);
                }
                ans.add(arr);
                arr=new ArrayList<>();
            }
        }
        return ans;

    }
}

class Pair{
    int level;
    TreeNode root;
    Pair(TreeNode root,int level){
        this.root=root;
        this.level=level;
    }

}