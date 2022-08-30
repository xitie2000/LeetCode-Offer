/*
 * @FilePath: sfo_09_implement_a_queue_using_two_stacks_m1.java
* @Author: xitie2000
* @Date: 2022-08-30
* @Url: https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
*/

package sfo_09_implement_a_queue_using_two_stacks_m1;

import java.util.*;

// ===== Solution Code =====
class CQueue {
    LinkedList<Integer> st1, st2;
    public CQueue() {
        st1 = new LinkedList<>();
        st2 = new LinkedList<>();
    }
    
    public void appendTail(int value) {
        st1.offerLast(value);
    }
    
    public int deleteHead() {
        if (!st2.isEmpty()) return st2.pollLast();
        if (st1.isEmpty()) return -1;
        while (!st1.isEmpty()) {
            st2.offerLast(st1.pollLast());
        }
        return st2.pollLast();
    }
}

public class sfo_09_implement_a_queue_using_two_stacks_m1 {
    public static void main(String[] args) {
        // ====== Driver Code ======
        List<Integer> res = new ArrayList<>();
        CQueue cQueue = new CQueue();
        res.add(cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        res.add(cQueue.deleteHead());
        res.add(cQueue.deleteHead());
        System.out.println(Arrays.toString(res.toArray()));
    }
}
