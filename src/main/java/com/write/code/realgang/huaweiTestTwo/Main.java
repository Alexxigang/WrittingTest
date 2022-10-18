package com.write.code.realgang.huaweiTestTwo;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-10-12 10:04
 **/
public class Main {
    class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }
    // DBACEGF
    // ABCDEFG

    public void solution(char[] preOrder,char[] midOrder) {
        TreeNode root = buildTree(preOrder,0,preOrder.length - 1,midOrder,0,midOrder.length - 1);
        outPutAfterTree(root);
    }

    public TreeNode buildTree(char[] preOrder,int leftPreIndex,int rightPreIndex,char[] midOrder,int leftMidIndex,int rightMidIndex) {
        if (leftPreIndex > rightPreIndex) {
            return null;
        }
        char curRootChar = preOrder[leftPreIndex];
        TreeNode curRoot = new TreeNode(curRootChar);

        int midIndex = leftMidIndex;
        int i = leftMidIndex;
        for (;i <= rightMidIndex;i++) {
            if (midOrder[i] == curRootChar) {
                midIndex = i;
                break;
            }
        }

        curRoot.left = buildTree(preOrder,leftPreIndex + 1,leftPreIndex + (i - leftMidIndex),midOrder,leftMidIndex,midIndex - 1);
        curRoot.right = buildTree(preOrder,leftPreIndex + (i - leftMidIndex) + 1,rightPreIndex,midOrder,midIndex + 1,rightMidIndex);

        return curRoot;
    }

    public void outPutAfterTree(TreeNode root) {
        if (root == null) {
            return;
        }
        outPutAfterTree(root.left);
        outPutAfterTree(root.right);
        System.out.printf(String.valueOf(root.val));
    }
    public static void main(String[] args) {
        // DBACEGF
        // ABCDEFG
        char[] preOrder = new char[]{'D','B','A','C','E','G','F'};
        char[] midOrder = new char[]{'A','B','C','D','E','F','G'};
        Main mainClass = new Main();
        mainClass.solution(preOrder,midOrder);
    }
}
