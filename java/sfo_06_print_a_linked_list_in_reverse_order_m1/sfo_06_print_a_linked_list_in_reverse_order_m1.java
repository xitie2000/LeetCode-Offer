/*
 * @FilePath: sfo_06_print_a_linked_list_in_reverse_order_m1.java
 * @Author: xitie2000
 * @Date: 2022-09-02 04:56:27
 * @Url: https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
package sfo_06_print_a_linked_list_in_reverse_order_m1;

import java.util.*;
import include.*;

class Solution {
    private ArrayList<Integer> temp = new ArrayList<>();
    private void dfs(ListNode head) {
        if (head == null) return;
        dfs(head.next);
        temp.add(head.val);
    }
    public int[] reversePrint(ListNode head) {
        dfs(head);
        int n = temp.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = temp.get(i);
        }
        return ans;
    }
}

public class sfo_06_print_a_linked_list_in_reverse_order_m1 {
    public static void main(String[] args) {
        // ======= Test Case =======
        ListNode head = ListNode.arrToLinkedList(new int[] { 1, 3, 2 });
        // ====== Driver Code ======
        Solution slt = new Solution();
        int[] res = slt.reversePrint(head);
        System.out.println(Arrays.toString(res));
    }
}
