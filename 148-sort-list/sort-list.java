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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head1=slow.next;
        slow.next=null;
        head1=sortList(head1);
        head=sortList(head);
        ListNode ans=merge(head1,head);
        return ans;
    }
    public static ListNode merge(ListNode head1,ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode i=head1;
        ListNode j=head2;
        ListNode k=dummy;
        while(i!=null && j!=null){
            if(i.val>j.val){
                k.next=j;
                j=j.next;
            }else{
                k.next=i;
                i=i.next;
            }
            k=k.next;
        }
        if(i==null){
            k.next=j;
        }
        if(j==null){
            k.next=i;
        }
        return dummy.next;
    }
}