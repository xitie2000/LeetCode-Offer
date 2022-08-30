/*
 * @FilePath: sfo_09_implement_a_queue_using_two_stacks_m1.cpp
 * @Author: xitie2000
 * @Date: 2022-08-30 04:47:01
 * @Url: https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */

#include "../include/include.hpp"

// ===== Solution Code =====
class CQueue {
private:
    stack<int> st1, st2;
public:
    CQueue() { }
    
    void appendTail(int value) {
        st1.emplace(value);
    }
    
    int deleteHead() {
        if (!st2.empty()) {
            int res = st2.top();
            st2.pop();
            return res;
        }
        if (st1.empty()) {
            return -1;
        }
        while (!st1.empty()) {
            st2.emplace(st1.top());
            st1.pop();
        }
        int res = st2.top();
        st2.pop();
        return res;
    }
};

int main() {
    // ====== Driver Code ======
    vector<int> res;
    CQueue* cQueue = new CQueue();
    res.push_back(cQueue->deleteHead());
    cQueue->appendTail(5);
    cQueue->appendTail(2);
    res.push_back(cQueue->deleteHead());
    res.push_back(cQueue->deleteHead());
    PrintUtil::printVector(res);

    return 0;
}