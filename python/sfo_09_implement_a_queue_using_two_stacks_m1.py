'''
FilePath: sfo_09_implement_a_queue_using_two_stacks_m1.py
Author: xitie2000
Date: 2022-09-02 03:44:23
Url: https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
'''
from include import *


# ===== Solution Code =====
class CQueue:
    def __init__(self):
        self.A, self.B = [], []

    def appendTail(self, value: int) -> None:
        self.A.append(value)

    def deleteHead(self) -> int:
        if self.B: 
            return self.B.pop()
        if not self.A: 
            return -1
        
        while self.A:
            self.B.append(self.A.pop())

        return self.B.pop()


# ====== Driver Code ======
c_queue = CQueue()
res = [
    c_queue.deleteHead(),
    c_queue.appendTail(5),
    c_queue.appendTail(2),
    c_queue.deleteHead(),
    c_queue.deleteHead()
]
print(res)