'''
FilePath: sfo_30_min_stack_m1.py
Author: xitie2000
Date: 2022-09-02 03:49:43
Url: https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/
'''
from include import *
import sys


# ===== Solution Code =====
class MinStack:

    def __init__(self):
        self.stk = []
        self.minElem = sys.maxsize


    def push(self, x: int) -> None:
        self.minElem = min(self.minElem, x)
        self.stk.append([x, self.minElem])

    def pop(self) -> None:
        self.stk.pop()
        self.minElem = self.stk[-1][1] if self.stk else sys.maxsize

    def top(self) -> int:
        return self.stk[-1][0]

    def min(self) -> int:
        return self.minElem


# ====== Driver Code ======
minStack = MinStack()
res = [
    minStack.push(-2),
    minStack.push(0),
    minStack.push(-3),
    minStack.min(),
    minStack.pop(),
    minStack.top(),
    minStack.min()
]
print(res)