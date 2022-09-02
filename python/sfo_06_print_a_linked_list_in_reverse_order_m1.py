'''
FilePath: sfo_06_print_a_linked_list_in_reverse_order_m1.py
Author: xitie2000
Date: 2022-09-02 05:00:49
Url: https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
'''
from include import *

class Solution:
    def reversePrint(self, head: ListNode) -> List[int]:
        ans = []

        def dfs(head: ListNode) -> None:
            if not head: return
            dfs(head.next)
            ans.append(head.val)

        dfs(head)
        return ans

# ======= Test Case =======
head = list_to_linked_list([1, 3, 2])
# ====== Driver Code ======
slt = Solution()
res = slt.reversePrint(head)
print(res)