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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0){
            return null;
        }
        int n=lists.length;
        while(n>1){
            int index=0;
            for(int i=0; i<n; i+=2){
                if(i+1<n){
                    lists[index++]=merge(lists[i],lists[i+1]);
                }else{
                    lists[index++]=lists[i];
                }
            }
            n=index;
        }
        return lists[0];
    }
    public static ListNode merge(ListNode a,ListNode b){
        ListNode i=a;
        ListNode j=b;
        ListNode dummy=new ListNode(0);
        ListNode k=dummy;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;
                i=i.next;
            }else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i!=null){
            k.next=i;
        }if(j!=null){
            k.next=j;
        }
        return dummy.next;
    }
}