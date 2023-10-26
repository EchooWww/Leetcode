/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode* ptr1 = list1;
    struct ListNode* ptr2 = list2;
    struct ListNode* dummy = malloc(sizeof(struct ListNode));
    struct ListNode* curr = dummy;
    while (ptr1 != NULL && ptr2 != NULL) {
        if (ptr1->val <= ptr2->val) {
            curr -> next = ptr1;
            ptr1 = ptr1 -> next;
        } else {
            curr -> next = ptr2;
            ptr2 = ptr2 ->next;
        }
        curr = curr->next;
    }
    if (ptr1 == NULL) curr -> next = ptr2;
    else curr->next = ptr1;
    return dummy->next;
}