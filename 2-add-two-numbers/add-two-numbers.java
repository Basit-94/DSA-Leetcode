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
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int s=0,d=0,carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            if(l1!=null)
            {
                s = s+l1.val;
                l1 = l1.next;
            }
            if(l2!=null)
            {
                s = s+l2.val;
                l2 = l2.next;
            }

            s = s+carry;
            carry=0;
            if(s<10)
            {
                curr.next = new ListNode(s);
            }
            else
            {
                d = s%10;
                curr.next = new ListNode(d); 
                carry = s/10;
            }
            curr = curr.next;
            s=0;
        }

        return dummy.next;
    }
}