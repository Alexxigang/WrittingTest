package com.write.code.realgang.huaweiTestTwo.testOne;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-07 19:14
 **/
public class Main {

    class TreeNode {
        int val;
        List<TreeNode> children;

        TreeNode(int x) {
            val = x;
            if (children == null) {
                children = new ArrayList<>();
            }
        }
    }

    public Map<Integer,TreeNode> treeNodeMap;
    public Set<Integer> parentSet;
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();
        int M = reader.nextInt();

        treeNodeMap = new HashMap<>();
        parentSet = new HashSet<>();


        String s = reader.nextLine();
        for (int i = 0;i < M;i++) {
            String[] strs = reader.nextLine().split(" ");
            int x = Integer.parseInt(strs[0]);
            parentSet.add(x);
            TreeNode head = new TreeNode(x);
            if (!treeNodeMap.containsKey(x)) {
                treeNodeMap.put(x,head);
            }
            for (int j = 1;j < strs.length;j++) {
                int childVal = Integer.parseInt(strs[j]);
                TreeNode child = new TreeNode(childVal);
                treeNodeMap.put(childVal,child);
                head.children.add(child);
            }
            treeNodeMap.put(x,head);

        }

        int m1 = reader.nextInt();
        int m2 = reader.nextInt();

        TreeNode p = treeNodeMap.get(m1);
        TreeNode q = treeNodeMap.get(m2);

        int distance = -1;
        for (Integer rootVal: parentSet) {
            TreeNode commonParent = findNearParent(treeNodeMap.get(rootVal),p,q);
            if (commonParent != null) {
                distance = 0;
                distance += getDistance(commonParent,p,0);
                distance += getDistance(commonParent,q,0);
                break;
            }
        }

        System.out.println(distance);
    }

    public TreeNode findNearParent(TreeNode root,TreeNode p,TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        root = treeNodeMap.get(root.val);
        TreeNode[] childRes = new TreeNode[root.children.size()];

        for (int i = 0;i < childRes.length;i++) {
            childRes[i] = findNearParent(root.children.get(i),p,q);
        }

        int leftIndex = -1;
        int rightIndex = -1;

        for (int i = 0;i < childRes.length;i++) {
            if (childRes[i] != null) {
                if (leftIndex == -1) {
                    leftIndex = i;
                } else if (rightIndex == -1) {
                    rightIndex = i;
                    break;
                } else {
                    break;
                }
            }
        }

        if (leftIndex == -1 && rightIndex == -1) {
            return null;
        }

        if (leftIndex != -1 && rightIndex == -1) {
            return childRes[leftIndex];
        }

        if (leftIndex != -1 && rightIndex != -1) {
            return root;
        }

        return null;
    }

    public int getDistance(TreeNode parent,TreeNode p,int dist) {
        if (parent == p) {
            return dist;
        }

        if (parent == null) {
            return -1;
        }

        parent = treeNodeMap.get(parent.val);

        for (TreeNode child:parent.children) {
            int resTemp = getDistance(child,p,dist + 1);
            if (resTemp!= -1) {
                return resTemp;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}
