package com.write.code.realgang.huaweiTestTwo.testOne;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-07 19:14
 **/
public class Main {
//
//    class TreeNode {
//        int val;
//        List<TreeNode> children;
//
//        TreeNode(int x) {
//            val = x;
//            if (children == null) {
//                children = new ArrayList<>();
//            }
//        }
//    }
//
//    public Map<Integer,TreeNode> treeNodeMap;
//    public Set<Integer> parentSet;
//    public void solution() {
//        Scanner reader = new Scanner(System.in);
//        int N = reader.nextInt();
//        int M = reader.nextInt();
//
//        treeNodeMap = new HashMap<>();
//        parentSet = new HashSet<>();
//
//
//        String s = reader.nextLine();
//        for (int i = 0;i < M;i++) {
//            String[] strs = reader.nextLine().split(" ");
//            int x = Integer.parseInt(strs[0]);
//            parentSet.add(x);
//            TreeNode head = new TreeNode(x);
//            if (!treeNodeMap.containsKey(x)) {
//                treeNodeMap.put(x,head);
//            }
//            for (int j = 1;j < strs.length;j++) {
//                int childVal = Integer.parseInt(strs[j]);
//                TreeNode child = new TreeNode(childVal);
//                treeNodeMap.put(childVal,child);
//                head.children.add(child);
//            }
//            treeNodeMap.put(x,head);
//
//        }
//
//        int m1 = reader.nextInt();
//        int m2 = reader.nextInt();
//
//        TreeNode p = treeNodeMap.get(m1);
//        TreeNode q = treeNodeMap.get(m2);
//
//        int distance = -1;
//        for (Integer rootVal: parentSet) {
//            TreeNode commonParent = findNearParent(treeNodeMap.get(rootVal),p,q);
//            if (commonParent != null) {
//                distance = 0;
//                distance += getDistance(commonParent,p,0);
//                distance += getDistance(commonParent,q,0);
//                break;
//            }
//        }
//
//        System.out.println(distance);
//    }
//
//    public TreeNode findNearParent(TreeNode root,TreeNode p,TreeNode q) {
//        if (root == null || root == p || root == q) {
//            return root;
//        }
//        root = treeNodeMap.get(root.val);
//        TreeNode[] childRes = new TreeNode[root.children.size()];
//
//        for (int i = 0;i < childRes.length;i++) {
//            childRes[i] = findNearParent(root.children.get(i),p,q);
//        }
//
//        int leftIndex = -1;
//        int rightIndex = -1;
//
//        for (int i = 0;i < childRes.length;i++) {
//            if (childRes[i] != null) {
//                if (leftIndex == -1) {
//                    leftIndex = i;
//                } else if (rightIndex == -1) {
//                    rightIndex = i;
//                    break;
//                } else {
//                    break;
//                }
//            }
//        }
//
//        if (leftIndex == -1 && rightIndex == -1) {
//            return null;
//        }
//
//        if (leftIndex != -1 && rightIndex == -1) {
//            return childRes[leftIndex];
//        }
//
//        if (leftIndex != -1 && rightIndex != -1) {
//            return root;
//        }
//
//        return null;
//    }
//
//    public int getDistance(TreeNode parent,TreeNode p,int dist) {
//        if (parent == p) {
//            return dist;
//        }
//
//        if (parent == null) {
//            return -1;
//        }
//
//        parent = treeNodeMap.get(parent.val);
//
//        for (TreeNode child:parent.children) {
//            int resTemp = getDistance(child,p,dist + 1);
//            if (resTemp!= -1) {
//                return resTemp;
//            }
//        }
//
//        return -1;
//    }
//
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.solution();
//    }

    /**
     * ##########################################################
     * 思路
     * 先根据输入 使用 unordered_map 记录每只小猪的猪妈妈是谁，并且找的树的根，将其妈妈编码设定为 -1，作为循环终止条件。
     *
     * 从 m1 开始遍历 m1 的所有祖先，若有 m2，输出当前距离，直接 return 掉；若不是 m2，则使用 unordered_map 把当前祖先到 m1 的距离记下来。
     *
     * 若没结束，再从 m2 开始遍历 m2 的所有祖先，若出现 m1 的祖先，直接将两个距离相加输出，结束。
     *
     * 如果此时还没结束，说明 m1 和 m2 没有公共祖先，则输出 -1，结束；
     */


//    int main() {
//
//        int N, M;
//        cin >> N >> M;
//        unordered_map<int, int> pigs_mum;
//        while (M--) {
//            int pig_mum, pig_son;
//            cin >> pig_mum;
//            while (cin >> pig_son) {
//                pigs_mum[pig_son] = pig_mum;
//                if (cin.get() == '\n') break;
//            }
//        }
//        for (int i = 0; i < N; ++i) {
//            if (pigs_mum.find(i) == pigs_mum.end()) {
//                pigs_mum[i] = -1;
//            }
//        }
//
//        int m1, m2;
//        cin >> m1 >> m2;
//        unordered_map<int, int> distance;
//        int tmp = m1, d = 0;
//        while (tmp != -1) {
//            if (tmp == m2) {
//                cout << d << endl;
//                return 0;
//            }
//            else {
//                distance[tmp] = d;
//                d++;
//                tmp = pigs_mum[tmp];
//            }
//        }
//        tmp = m2; d = 0;
//        while (tmp != -1) {
//            if (distance.find(tmp) != distance.end()) {
//                cout << (d + distance[tmp]) << endl;
//                return 0;
//            }
//            else {
//                d++;
//                tmp = pigs_mum[tmp];
//            }
//        }
//        cout << -1 << endl;
//
//        return 0;
//    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //输入
            int n = scanner.nextInt();
            scanner.nextLine();
            int row = scanner.nextInt();
            scanner.nextLine();
            //用于存储亲属关系的map<son-father>
            HashMap<Integer, Integer> relation = new HashMap<>();
            for (int i = 0; i < row; i++) {
                String s = scanner.nextLine();
                String[] split = s.split("\\s+");
                int father = Integer.parseInt(split[0]);
                for (int j = 1; j < split.length; j++) {
                    int son = Integer.parseInt(split[j]);
                    relation.put(son, father);
                }
            }
            int m1 = scanner.nextInt();
            int m2 = scanner.nextInt();
            List<Integer> m1List, m2List;
            m1List = new ArrayList<>();
            m2List = new ArrayList<>();
            getList(m1, relation, m1List);
            getList(m2, relation, m2List);
            int res = calculateDis(m1List, m2List);
            System.out.println(res);
        }
    }

    private static int calculateDis(List<Integer> m1List, List<Integer> m2List) {
        for (int i = 0; i < m1List.size(); i++) {
            Integer num1 = m1List.get(i);
            for (int j = 0; j < m2List.size(); j++) {
                Integer num2 = m2List.get(j);
                if(num1.equals(num2)){
                    return i+j;
                }
            }
        }
        return -1;
    }

    private static void getList(int m, HashMap<Integer, Integer> relation, List<Integer> list) {
        list.add(m);
        if (relation.containsKey(m)) {
            getList(relation.get(m), relation, list);
        }
    }
}
