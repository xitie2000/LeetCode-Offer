/*
 * @FilePath: sfo_06_print_a_linked_list_in_reverse_order_m2.cpp
 * @Author: xitie2000
 * @Date: 2022-09-02 04:44:16
 * @Url: https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
#include "../include/include.hpp"

class Solution {
public:
    vector<int> reversePrint(ListNode* head) {
        vector<int> ans;
        ListNode* curr = head;
        while (curr) {
            ans.emplace_back(curr->val);
            curr = curr->next;
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};

int main() {
    // ======= Test Case =======
    ListNode* head = vectorToLinkedList(vector<int> { 1, 3, 2 });
    // ====== Driver Code ======
    Solution* slt = new Solution();
    vector<int> res = slt->reversePrint(head);
    PrintUtil::printVector(res);
    
    return 0;
}