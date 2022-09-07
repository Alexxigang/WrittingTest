package com.write.code.ruiqiang.huaweiTestTwo.testTwo;

import javax.jws.soap.SOAPBinding;
import java.util.LinkedList;
import java.util.Scanner;


class Node {
    int x, y;
    Node pre=null;
    int dis = Integer.MAX_VALUE;

    public Node(int x, int y, int dis, Node pre) {
        this.x = x;
        this.y = y;
        this.dis = dis;
        this.pre = pre;
    }
}

public class Main {

    int[][] memo;
    int[] starts;
    int[]  ends;
    int[][] matrix;
    int minDis = Integer.MAX_VALUE;
    int[][] flags;
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] block = new char[m][n];
        sc.nextLine();
        for(int i=0;i<m;i++){
//            str[i] = sc.nextLine();
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            for(int j=0;j<n;j++){
                block[i][j] = chars[j];
            }
//            System.out.println(str[i]);
        }
        //需要记录上一次最近的走法的方向。
        flags = new int[m][n];
        flags[0][0] = 1;
        starts = new int[2];
        ends = new int[2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(block[i][j]=='S'){
                    starts[0] = i;
                    starts[1] = j;
                }
                else if (block[i][j] == 'E'){
                    ends[0] = i;
                    ends[1] = j;
                }
            }
        }
        bfs(block,starts[0],starts[1],ends[0],ends[1]);
        System.out.println(minDis);


    }

    public void bfs(char[][] block, int sr, int sc, int er, int ec){
        int[][] move = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };// 上下左右
        LinkedList<Node> queue = new LinkedList<Node>();
        Node start = new Node(sr, sc, 0, null);
        int m = block.length,n=block[0].length;
        int[][] minDists = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=0&&j!=0){
                    minDists[i][j] = Integer.MAX_VALUE;
                }
            }
        }
//        int minDis = Integer.MAX_VALUE;
//        matrix[sr][sc] = 1;// 标记走过
        queue.offer(start);// 加入队列
        while (!queue.isEmpty()) {
            Node tmp = queue.poll();
            Node preNode = tmp.pre;
            for (int i = 0; i != move.length; i++) {// (1,2) 往上 (0,2)
                int x = tmp.x + move[i][0];
                int y = tmp.y + move[i][1];
                // 判断这一步是否合法
                if (x < 0 || x >= block.length || y < 0 || y >= block[0].length)
                    continue;
                if (block[x][y] == 'X')
                    continue;
                if(preNode!=null&&(preNode.x == x&&preNode.y==y))continue;
                int dis = tmp.dis + 1;
                if(preNode!=null){
                    int xPreDirect = Math.abs(preNode.x-tmp.x);
                    int yPreDirect = Math.abs(preNode.y-tmp.y);
                    //判断方向有无改变
                    if(xPreDirect!=Math.abs(move[i][0])||yPreDirect!=Math.abs(move[i][1])){
                        dis += 1;
                    }
                }
                if(x==er&&y==ec){
                    minDis = Math.min(minDis,dis);
                    break;
                }
                flags[x][y] = 1;
                Node cur = new Node(x,y,dis,tmp);
                queue.offer(cur);

            }
        }
//        return minDis;

    }

//    public void dfs(String[] str, int sr, int sc,int er, int ec){
//
//    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solution();
    }
}
