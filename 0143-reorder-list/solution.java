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
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next=null;
        ListNode prev = null,curr = second,next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        second = prev;

        ListNode first = head,t1=null,t2=null;
        while(second!=null)
        {
            t1 = first.next;
            t2 = second.next;
            first.next = second;
            second.next = t1;
            first = t1;
            second = t2;
        }












        // ListNode slow = head;
        // ListNode fast = head;
        
        // while(fast.next!=null && fast.next.next!=null)
        // {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // ListNode second = slow.next;
        // slow.next = null;

        // ListNode prev=null,curr=second,next=null;
        // while(curr!=null)
        // {
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // second = prev;

        // ListNode first = head,t1=null,t2=null;
        // while(second!=null)
        // {
        //     t1 = first.next;
        //     t2 = second.next;
            
        //     first.next = second;
        //     second.next = t1;

        //     first = t1;
        //     second = t2;
        // }
    }
}
