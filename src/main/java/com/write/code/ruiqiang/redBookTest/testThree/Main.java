package com.write.code.ruiqiang.redBookTest.testThree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public void solute(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[] starts = new int[m];
        int[] ends = new int[m];
        for(int i=0;i<m;i++){
            starts[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            ends[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
//            System.out.print(starts[i]);
//            System.out.print(ends[i]);
            matrix[starts[i]-1][ends[i]-1] = sc.nextInt();
            matrix[ends[i]-1][starts[i]-1] = matrix[starts[i]-1][ends[i]-1];
        }
        List<Integer> larges = new LinkedList<>();
        int[] maxCosts = new int[n];
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        int dist = 0;
        while(!que.isEmpty()){
            int size = que.size();
            if(dist>=k)break;
            for(int i=0;i<size;i++){
                int index = que.poll();
                for(int j=0;j<n;j++){
                    if(j==n-1&&matrix[index][j] > 0){
                        larges.add(Math.max(matrix[index][j],maxCosts[index]));
                    }
                    else if(matrix[index][j] > 0&&!visited[index][j]&&!visited[j][index]){
                        que.add(j);
                        maxCosts[j] = Math.max(maxCosts[j],maxCosts[index]);
                        visited[index][j] = true;
                        visited[j][index] = true;
                    }
                }
            }
            dist ++;
        }
        int minRes = Integer.MAX_VALUE;
        for(Integer x: larges){
            System.out.println(x);
            minRes = Math.min(minRes,x);
        }
        System.out.println(minRes);

    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solute();
    }
}
