/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

bool hasCycleRecursive (struct ListNode *slow, struct ListNode *fast) {
    if (fast == NULL || fast->next == NULL)  return false;
    slow = slow->next;
    fast = fast->next->next;
    if (fast == slow) return true;
    return hasCycleRecursive(slow, fast);
}

bool hasCycle(struct ListNode *head) {
    if (head == NULL) return false;
    return hasCycleRecursive(head, head);
}