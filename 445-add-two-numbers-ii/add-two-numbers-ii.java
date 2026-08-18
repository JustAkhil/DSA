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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp1=reverse(l1);
        ListNode temp2=reverse(l2);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(temp1!=null || temp2!=null || carry>0){
            int val1=(temp1!=null)?temp1.val:0;
            int val2=(temp2!=null)?temp2.val:0;
            int sum=val1+val2+carry;
            carry=sum/10;
            ListNode next=new ListNode(sum%10);
            temp.next=next;
            temp=temp.next;
            if(temp1!=null){
                temp1=temp1.next;
            }if(temp2!=null){
                temp2=temp2.next;
            }
        }
        return reverse(dummy.next);
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}