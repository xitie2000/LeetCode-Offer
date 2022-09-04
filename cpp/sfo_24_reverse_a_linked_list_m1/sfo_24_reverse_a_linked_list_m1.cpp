/*
 * @FilePath: sfo_24_reverse_a_linked_list_m1.cpp
 * @Author: xitie2000
 * @Date: 2022-09-04 03:30:45
 * @Url: https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/
 */
#include "../include/include.hpp"

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *prev = nullptr, *curr = head;
        while (curr) {
            ListNode* next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
};

int main() {
    // ======= Test Case =======
    ListNode* head = vectorToLinkedList(vector<int> { 1, 2, 3, 4, 5 });
    // ====== Driver Code ======
    Solution* slt = new Solution();
    ListNode* res = slt->reverseList(head);
    PrintUtil::printLinkedList(res);
    
    return 0;
}