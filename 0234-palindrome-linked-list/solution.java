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
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder("");

        while(head!=null)
        {
            sb.append(head.val);
            head = head.next;
        }

        String o = sb.toString();
        String r = sb.reverse().toString();
        return o.equals(r);
    }
}
