/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* result = NULL;
    struct ListNode* tail = NULL;
    int carry = 0;
    while (l1 != NULL || l2 != NULL) {
        int sum = carry;
        if (l1 != NULL) {
        sum += l1->val;
        l1 = l1->next;
        }
        if (l2 != NULL) {
        sum += l2->val;
        l2 = l2->next;
        }
        carry = sum / 10;
        struct ListNode* newNode = malloc(sizeof(struct ListNode));
        newNode->val = sum % 10;
        newNode->next = NULL;
        if (result == NULL) {
        result = tail = newNode;
        } else {
        tail->next = newNode;
        tail = newNode;
        }
    }
    if (carry > 0) {
        struct ListNode* newNode = malloc(sizeof(struct ListNode));
        newNode->val = carry;
        newNode->next = NULL;
        tail->next = newNode;
    }
    return result;
}