/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};
        int firstIdx=-1,lastIdx=-1,idx=1,minDis=Integer.MAX_VALUE;
        ListNode a=head;
        ListNode b=a.next;
        ListNode c=b.next;
        if(c==null){
            return ans;
        }
        while(c!=null){
            if((b.val>a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)){
                if(firstIdx==-1) firstIdx=idx;
                if(lastIdx!=-1){
                    int dis=idx-lastIdx;
                    minDis=Math.min(dis,minDis);
                }
                lastIdx=idx;
            }
            idx++;
            a=b;
            b=c;
            c=c.next;
        }
        int maxDis=lastIdx-firstIdx;
        if(maxDis==0){
            maxDis=-1;
        }
        if(minDis==Integer.MAX_VALUE){
            minDis=-1;
        }
        ans[0]=minDis;
        ans[1]=maxDis;
        return ans;
    }
}