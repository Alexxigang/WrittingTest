package com.write.code.realgang.meituanTest.testFive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-13 11:59
 **/
public class Main {
    int maxMoney = 0;
    int sum = 0;

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        int[] nodes = new int[n];

        for (int i = 0;i < n;i++) {
            nodes[i] = reader.nextInt();
        }
        TreeBuilder tb = new TreeBuilder();
        TreeBuilder.TreeNode treeNode = tb.arrayToBTree(nodes);

        backTrack(treeNode);

        System.out.println(maxMoney);
    }

    public void backTrack(TreeBuilder.TreeNode root) {
        if (root == null) {
            maxMoney = Math.max(maxMoney,sum);
            return;
        }
        sum += root.data;
        if (root.left != null) {
            sum += root.left.data;
            backTrack(root.left);
            sum -= root.left.data;
        }

        if (root.right != null) {
            sum += root.right.data;
            backTrack(root.right);
            sum -= root.right.data;
        }
    }

    public static void main(String[] args) {
        TreeBuilder tb = new TreeBuilder();
        TreeBuilder.TreeNode treeNode = tb.arrayToBTree(new int[]{1,2,3,4,5,6,7});
    }


}

class TreeBuilder {

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode arrayToBTree(int[] arrs) {
        if (arrs == null || arrs.length == 0) {
            return new TreeNode();
        }

        List<TreeNode> nodes = new ArrayList<>(arrs.length);
        for (int obj : arrs) {
            TreeNode
                    treeNode = new TreeNode();
            treeNode.data = obj;
            nodes.add(treeNode);
        }

        for (int i = 0; i < arrs.length/2 - 1; i++) {
            TreeNode node = nodes.get(i);
            node.left = nodes.get(i*2 + 1);
            node.right = nodes.get(i*2 + 2);
        }
        // 只有当总节点数是奇数时，最后一个父节点才有右子节点
        int lastPNodeIndex = arrs.length/2 - 1;
        TreeNode lastPNode = nodes.get(lastPNodeIndex);
        lastPNode.left = nodes.get(lastPNodeIndex*2 + 1);
        if (arrs.length%2 != 0) {
            lastPNode.right = nodes.get(lastPNodeIndex*2 + 2);
        }

        return nodes.get(0);
    }



}

