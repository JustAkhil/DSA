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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy2= new ListNode(0);
        ListNode temp=head;
        ListNode temp1=dummy1;
        ListNode temp2=dummy2;
        int length=1;
        while(temp!=null){
            if(length%2==0){
                temp1.next=temp;
                temp1=temp1.next;
            }else{
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
            length++;
        }
        temp1.next=null;
        temp2.next=dummy1.next;
        return dummy2.next;
    }
}