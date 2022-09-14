package com.write.code.realgang.xiaomiTest.testTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-14 19:23
 **/
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    Node pre = null;
    Node head = null;
    /* Write Code Here */
    public Node  Convert(Node pRootOfTree) {

        if (pRootOfTree == null) {
            return null;
        }
        backTrack(pRootOfTree);

        return head;
    }

    public void backTrack(Node cur) {
        if (cur == null) {
            return;
        }

        backTrack(cur.left);

        if (pre == null) {
            head = cur;
        } else {
            pre.right = cur;
        }

        cur.left = pre;
        pre = cur;

        backTrack(cur.right);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Node res = null;
        List<Node> list = new ArrayList<>();

        while (in.hasNext()) {
            int item = in.nextInt();
            if (item == -1) {
                list.add(null);
            } else {
                list.add(new Node(item));
            }
        }
        int len = list.size();
        int i = 0;
        while (i <= (len - 2) / 2) {
            if (2 * i + 1 < len && list.get(i) != null) {
                list.get(i).left = list.get(2 * i + 1);
            }
            if (2 * i + 2 < len && list.get(i) != null) {
                list.get(i).right = list.get(2 * i + 2);
            }
            i++;
        }

        res = new Solution().Convert(list.get(0));
        if (res != null) {
            while (res.right != null && res.data != -1) {
                System.out.print(String.valueOf(res.data) + " ");
                res = res.right;
            }
            System.out.print(res.data + " ");
            while (res.left != null && res.data != -1) {
                System.out.print(String.valueOf(res.data) + " ");
                res = res.left;
            }
            System.out.print(res.data);
        }
        System.out.println();
    }
}
