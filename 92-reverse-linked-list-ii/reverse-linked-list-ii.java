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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        dummy.next=head;
        for(int i=1; i<=l-1; i++){
            temp=temp.next;
        }
        ListNode head2=temp.next;
        ListNode tail=temp;
        for(int i=1; i<=r-l+1; i++){
            temp=temp.next;
        }
        ListNode head3=temp.next;
        ListNode tail2=temp;

        tail.next=null;
        tail2.next=null;
        reverse(head2);
        tail.next=tail2;
        head2.next=head3;
        return dummy.next;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}