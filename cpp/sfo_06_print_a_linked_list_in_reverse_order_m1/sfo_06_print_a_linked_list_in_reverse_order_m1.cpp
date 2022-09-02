/*
 * @FilePath: sfo_06_print_a_linked_list_in_reverse_order_m1.cpp
 * @Author: xitie2000
 * @Date: 2022-09-02 04:38:06
 * @Url: https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
#include "../include/include.hpp"

class Solution {
private:
    vector<int> ans;
    void dfs(ListNode* head) {
        if (head == nullptr) return;
        dfs(head->next);
        ans.emplace_back(head->val);
    }
public:
    vector<int> reversePrint(ListNode* head) {
        dfs(head);
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