class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map= new HashMap<>();
        int[] ans=new int[k];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int key : map.keySet()){
            pq.add(new Pair(key,map.get(key)));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0; i<k; i++){
            ans[i]=pq.remove().val;
        }
        return ans;
    }
}
class Pair implements Comparable<Pair>{
    int val;
    int freq;
    Pair(int val,int freq){
        this.val=val;
        this.freq=freq;
    }

    public int compareTo(Pair p){
        if(p.freq==this.freq) 
        return this.val-p.val;
        return this.freq-p.freq;
    }
}