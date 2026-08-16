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
        public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode head1=slow.next;
        slow.next=null;
        head1=reverse(head1);
        merge(head,head1);
    }
    public static ListNode reverse(ListNode head1){
        ListNode prev=null;
        ListNode curr=head1;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void merge(ListNode head,ListNode head1){
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        ListNode temp1=head1;
        ListNode temp=head;
        while(temp1!=null && temp!=null){
            t.next=temp;
            t=t.next;
            temp=temp.next;
            t.next=temp1;
            t=t.next;
            temp1=temp1.next;
        }
        t.next=temp1!=null?temp1 :temp;
    }
}