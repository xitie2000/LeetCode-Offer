'''
FilePath: sfo_06_print_a_linked_list_in_reverse_order_m2.py
Author: xitie2000
Date: 2022-09-02 05:04:47
Url: https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
'''
from include import *

class Solution:
    def reversePrint(self, head: ListNode) -> List[int]:
        ans = []

        while head:
            ans.append(head.val)
            head = head.next

        ans.reverse()
        return ans

# ======= Test Case =======
head = list_to_linked_list([1, 3, 2])
# ====== Driver Code ======
slt = Solution()
res = slt.reversePrint(head)
print(res)