/*
 * @FilePath: sfo_24_reverse_a_linked_list_m1.java
 * @Author: xitie2000
 * @Date: 2022-09-04 03:50:15
 * @Url: https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/
 */
package sfo_24_reverse_a_linked_list_m1;

import java.util.*;
import include.*;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

public class sfo_24_reverse_a_linked_list_m1 {
    public static void main(String[] args) {
        // ======= Test Case =======
        ListNode head = ListNode.arrToLinkedList(new int[] { 1, 2, 3, 4, 5 });
        // ====== Driver Code ======
        Solution slt = new Solution();
        ListNode res = slt.reverseList(head);
        PrintUtil.printLinkedList(res);
    }
}