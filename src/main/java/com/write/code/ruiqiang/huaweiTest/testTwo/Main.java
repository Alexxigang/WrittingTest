package com.write.code.ruiqiang.huaweiTest.testTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    int minStep = Integer.MAX_VALUE;
    int pathStep = 0;
    int n,m;
    int [][] visited;
    public void solute(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrix = new int[n][m];
        visited = new int[n][m];
        int startX=0,startY=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 2){
                    startX = i;
                    startY = j;
                }
            }
        }
        back_trace(matrix,startX,startY);
        System.out.println(minStep);
    }

    public void back_trace(int[][] matrix,int x,int y){
        if(matrix[x][y]== 3){
            pathStep += 1;
            minStep = Math.min(minStep,pathStep);
            return;
        }
        int[][] steps = {{-1,0},{1,0},{0,-1},{0,1}};
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(steps[0]);
        int cost = 1;
        List<List<Integer>> change_pos = new ArrayList<>();
        if(matrix[x][y]==1||visited[x][y] == 1){
            return;
        }
        else if(matrix[x][y]==4){

            cost = 3;
        }
        else if(matrix[x][y] == 2){
            cost = 0;
        }

        else if(matrix[x][y]==6){

            for(int i=0;i<4;i++){
                int xStep = steps[i][0],yStep = steps[i][1];
                if(isValid(matrix,x+xStep,y+yStep)&&(matrix[x+xStep][y+yStep]==1)){

                    matrix[x+xStep][y+yStep] = 0;
                    change_pos.add(Arrays.asList(x+xStep,y+yStep));
                }
            }
        }
        pathStep += cost;
        visited[x][y] = 1;
//        System.out.println(pathStep);
        for(int i=0;i<4;i++){
            int xStep = steps[i][0],yStep = steps[i][1];
            if(isValid(matrix,x+xStep,y+yStep)&&(visited[x+xStep][y+yStep]==0)){
//                System.out.println(x+xStep);
//                System.out.println(y+yStep);
                back_trace(matrix,x+xStep,y+yStep);
            }
        }
        visited[x][y] = 0;

        pathStep -= cost;
//        System.out.println(pathStep);
        if(matrix[x][y]==6){
            for(int i=0;i<4;i++){
                for(List<Integer> ls:change_pos){
                    int tempX = ls.get(0),tempY = ls.get(1);
                    matrix[tempX][tempY] = 1;
                }
            }
        }


    }

    public boolean isValid(int[][] matrix,int x,int y){
        int n = matrix.length,m=matrix[0].length;
        return x>=0&&x<n&&y>=0&&y<m;
    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solute();
    }
}
