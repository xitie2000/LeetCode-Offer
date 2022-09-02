/*
 * @FilePath: sfo_30_min_stack_m1.java
 * @Author: xitie2000
 * @Date: 2022-09-02 04:01:46
 * @Url: https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
package sfo_30_min_stack_m1;

import java.util.*;

import javafx.util.Pair;

class MinStack {

    private LinkedList<Pair<Integer, Integer>> stk;
    private int minElem;

    public MinStack() {
        stk = new LinkedList<>();
        minElem = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        minElem = Math.min(minElem, x);
        stk.push(new Pair<>(x, minElem));
    }
    
    public void pop() {
        stk.pop();
        minElem = stk.isEmpty() ? Integer.MAX_VALUE : stk.peek().getValue();
    }
    
    public int top() {
        return stk.peek().getKey();
    }
    
    public int min() {
        return minElem;
    }
}

public class sfo_30_min_stack_m1 {
    public static void main(String[] args) {
        // ====== Driver Code ======
        List<Integer> res = new ArrayList<>();
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        res.add(minStack.min());
        minStack.pop();
        res.add(minStack.top());
        res.add(minStack.min());
        System.out.println(Arrays.toString(res.toArray()));
    }
}