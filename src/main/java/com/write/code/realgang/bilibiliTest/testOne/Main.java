package com.write.code.realgang.bilibiliTest.testOne;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-20 19:25
 **/



public class Main {
    class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode longestList (ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode next = cur;
        if (cur.next.next == null) {
            cur.next = null;
            return head;
        }

        while (next != null) {
            next = cur.next;
            if (cur.val % 2 == 0) {
                while (next != null && next.val % 2 == 0) {
                    next = next.next;
                }
                cur.next = next;
            } else {
                while (next != null && next.val % 2 == 1) {
                    next = next.next;
                }
                cur.next = next;
            }
            cur = next;
        }

        return head;
    }
}
