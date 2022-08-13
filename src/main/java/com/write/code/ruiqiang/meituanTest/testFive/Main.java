package com.write.code.ruiqiang.meituanTest.testFive;
//import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    int result = 0;
    public void solution(TreeBuilder.TreeNode root,int curRes){
        if(root==null)return;
        curRes += root.data;
        if(root.left==null&&root.right==null){

            result = Math.max(result,curRes);
            return;
        }

        if(root.left!=null){
            solution(root.left,curRes);
        }
        if(root.right!=null){
            solution(root.right,curRes);
        }

    }

    public static void main(String[] args) {
        TreeBuilder tb = new TreeBuilder();
        TreeBuilder.TreeNode treeNode = tb.arrayToBTree(new int[]{1,2,3,4,5,6,7});
        Main ma = new Main();
        ma.solution(treeNode,0);
        System.out.println(ma.result);

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
            TreeNode treeNode = new TreeNode();
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
