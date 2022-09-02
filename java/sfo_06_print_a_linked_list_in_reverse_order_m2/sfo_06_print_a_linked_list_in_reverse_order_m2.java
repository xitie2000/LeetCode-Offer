/*
 * @FilePath: sfo_06_print_a_linked_list_in_reverse_order_m2.java
 * @Author: xitie2000
 * @Date: 2022-09-02 04:01:46
 * @Url: https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
package sfo_06_print_a_linked_list_in_reverse_order_m2;

import java.util.*;
import include.*;

class Solution {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> temp = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            temp.add(curr.val);
            curr = curr.next;
        }
        int n = temp.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = temp.get(n - 1 - i);
        }
        return ans;
    }
}

public class sfo_06_print_a_linked_list_in_reverse_order_m2 {
    public static void main(String[] args) {
        // ======= Test Case =======
        ListNode head = ListNode.arrToLinkedList(new int[] { 1, 3, 2 });
        // ====== Driver Code ======
        Solution slt = new Solution();
        int[] res = slt.reversePrint(head);
        System.out.println(Arrays.toString(res));
    }
}
