/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if (head == NULL || head->next == NULL) return head;
    struct ListNode * rest = swapPairs(head->next->next);
    struct ListNode * newHead = head->next;
    head->next->next = head;
    head->next = rest;
    return newHead;
}