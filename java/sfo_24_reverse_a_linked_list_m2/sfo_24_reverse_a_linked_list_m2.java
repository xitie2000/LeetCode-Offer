/*
 * @FilePath: sfo_24_reverse_a_linked_list_m2.java
 * @Author: xitie2000
 * @Date: 2022-09-04 03:50:15
 * @Url: https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/
 */

package sfo_24_reverse_a_linked_list_m2;

import java.util.*;
import include.*;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}

public class sfo_24_reverse_a_linked_list_m2 {
    public static void main(String[] args) {
        // ======= Test Case =======
        ListNode head = ListNode.arrToLinkedList(new int[] { 1, 2, 3, 4, 5 });
        // ====== Driver Code ======
        Solution slt = new Solution();
        ListNode res = slt.reverseList(head);
        PrintUtil.printLinkedList(res);
    }
}
