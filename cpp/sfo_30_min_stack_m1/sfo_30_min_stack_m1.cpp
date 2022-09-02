/*
 * @FilePath: sfo_30_min_stack_m1.cpp
 * @Author: xitie2000
 * @Date: 2022-09-02 04:01:46
 * @Url: https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
#include "../include/include.hpp"

// ===== Solution Code =====
class MinStack {
   private:
    stack<pair<int, int>> st;
    int _min;

   public:
    MinStack() {
        _min = INT_MAX;
    }

    void push(int val) {
        _min = min(val, _min);
        st.push({val, _min});
    }

    void pop() {
        st.pop();
        _min = st.empty() ? INT_MAX : st.top().second;
    }

    int top() {
        return st.top().first;
    }

    int getMin() {
        return _min;
    }
};

int main() {
    // ====== Driver Code ======
    vector<int> res;
    MinStack minStack;
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    res.push_back(minStack.getMin());
    minStack.pop();
    minStack.top();
    res.push_back(minStack.getMin());
    PrintUtil::printVector(res);

    return 0;
}