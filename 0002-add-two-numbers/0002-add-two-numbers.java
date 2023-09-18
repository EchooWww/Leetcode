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

        // As long as there's value in p1, p2, or carry, we should continue the loop
        while (p1!= null || p2!= null || carry > 0) {
            int n = 0;
            if (p1 != null) {
                n += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                n += p2.val;
                p2 = p2.next;
            }
            if (carry > 0) {
                 n += carry;
                 carry = 0;
            }
            if (n >= 10) {
                carry += n / 10;
                n %= 10;
            }
            p.next = new ListNode(n);
            p = p.next;
        }
        return dummy.next;
    }
}