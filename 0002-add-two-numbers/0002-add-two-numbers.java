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
        ListNode p1 = l1, p2 = l2;
        ListNode dummy = new ListNode(-1), p = dummy;
        int carry = 0;
        while (p1!= null || p2!= null || carry > 0) {
            int n = p1 != null && p2 != null? p1.val + p2.val: p1 == null && p2 == null? 0 : p1 == null ? p2.val : p1.val;
            if (carry > 0) {
                 n += carry;
                 carry = 0;
            }
            while (n >= 10) {
                carry++;
                n -= 10;
            }
            p.next = new ListNode(n);
            p = p.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        return dummy.next;
    }
}