class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        List<Integer>ans=new ArrayList<>();
        for(int ele : arr){
            int diff=Math.abs(ele-x);
            pq.add(new Pair(ele,diff));
            if(pq.size()>k) pq.remove();
        }
        while(pq.size()>0) ans.add(pq.remove().val);
        Collections.sort(ans);
        return ans;
    }
}
class Pair implements Comparable<Pair>{
    int val;
    int diff;
    Pair(int val, int diff){
        this.val=val;
        this.diff=diff;
    }
    public int compareTo(Pair p){
        if(p.diff==this.diff)
        return Integer.compare(this.val,p.val);
        return Integer.compare(this.diff,p.diff);
    }
}