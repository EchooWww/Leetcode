/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* reverseLL (struct ListNode* head) {
    if (head == NULL || head -> next == NULL) return head;
    struct ListNode* newHead = reverseLL(head->next);
    head->next->next = head;
    head->next = NULL;
    return newHead;
}

bool isPalindrome(struct ListNode* head){
    struct ListNode* slow = head;
    struct ListNode* fast = head;
    while (fast != NULL && fast->next!=NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }
    struct ListNode* left = head;
    struct ListNode* right = reverseLL(slow);
    while (left != NULL && right != NULL) {
        if (left->val != right->val) return false;
        left = left->next;
        right = right->next;
    }
    return true;
}
