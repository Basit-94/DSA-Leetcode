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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode n = dummy,first=head;

        while(first!=null && first.next!=null)
        {
            ListNode t = first.next.next;
            n.next = swap(first);
            n = first;
            first = t;
        }

        return dummy.next;
    }
    private ListNode swap(ListNode curr)
    {
        ListNode s = curr.next;
        curr.next = s.next;
        s.next = curr;

        return s;
    }
}