class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        ListNode temp = head;

        int len = 0;

        // Separate odd and even position nodes
        while (temp != null) {
            if (len % 2 == 0) {
                temp1.next = temp;
                temp1 = temp1.next;
            } else {
                temp2.next = temp;
                temp2 = temp2.next;
            }

            temp = temp.next;
            len++;
        }

        temp1.next = null;
        temp2.next = null;

        ListNode k = new ListNode(0);
        ListNode t = k;

        temp1 = dummy1.next;
        temp2 = dummy2.next;

        while (temp1 != null && temp2 != null) {
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;

            t.next = temp2;
            t = t.next;

            t.next = temp1;
            t = t.next;

            temp1 = next1;
            temp2 = next2;
        }

        if (temp1 != null) {
            t.next = temp1;
        }

        return k.next;
    }
}