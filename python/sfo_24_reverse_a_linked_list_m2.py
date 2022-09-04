'''
FilePath: sfo_24_reverse_a_linked_list_m2.py
Author: xitie2000
Date: 2022-09-04 04:00:55
Url: https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/
'''
from include import *

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next: return head
        node = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return node

# ======= Test Case =======
head = list_to_linked_list([1, 2, 3, 4, 5])
# ====== Driver Code ======
slt = Solution()
res = slt.reverseList(head)
print_linked_list(res)