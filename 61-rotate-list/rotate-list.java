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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int len=length(head);
        k%=len;
        if(k==0){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        for(int i=1; i<=k+1; i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode a=slow.next;
        ListNode temp=a;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        slow.next=null;
        return a;
    }
    public static int length(ListNode n){
        int len=0;
        ListNode temp=n;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
}