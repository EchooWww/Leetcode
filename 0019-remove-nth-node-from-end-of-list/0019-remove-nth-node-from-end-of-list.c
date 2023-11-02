/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if (head == NULL) return head;
    struct ListNode* counter = head;
    struct ListNode* dummy = malloc(sizeof(struct ListNode));
    dummy->next = head;
    struct ListNode* remover = dummy;
    int numNodes = 0;
    while(counter != NULL) {
        counter = counter->next;
        numNodes++;
    }
    if (n > numNodes) return head;
    for (int i = 0; i < numNodes - n; i++) remover = remover->next;
    struct ListNode* temp = remover->next->next;
    free(remover->next);
    remover->next = temp;
    return dummy->next;
}