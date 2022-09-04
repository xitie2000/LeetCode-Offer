'''
FilePath: sfo_24_reverse_a_linked_list_m1.py
Author: xitie2000
Date: 2022-09-04 03:56:51
Url: https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/
'''
from include import *

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev, curr = None, head
        while curr:
            curr.next, prev, curr = prev, curr, curr.next
        return prev

# ======= Test Case =======
head = list_to_linked_list([1, 2, 3, 4, 5])
# ====== Driver Code ======
slt = Solution()
res = slt.reverseList(head)
print_linked_list(res)
