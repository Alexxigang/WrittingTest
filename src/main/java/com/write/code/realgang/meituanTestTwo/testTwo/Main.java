package com.write.code.realgang.meituanTestTwo.testTwo;

import java.util.*;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-08-13 11:59
 **/
public class Main {

    public int[][] direction = new int[][]{{0,-1},{1,0},{0,1},{-1,0}};
    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int x1 = reader.nextInt();
        int y1 = reader.nextInt();
        int x2 = reader.nextInt();
        int y2 = reader.nextInt();
        int x3 = reader.nextInt();
        int y3 = reader.nextInt();

        x1--;
        y1--;
        x2--;
        y2--;
        x3--;
        y3--;

        int d1 = reader.nextInt();
        int d2 = reader.nextInt();
        int d3 = reader.nextInt();

        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        int[][] map3 = new int[n][n];

        backTrack(map1,x1,y1,x1,y1,d1);
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                if (map1[i][j] > 1) {
                    map1[i][j] = 1;
                }
            }
        }
        backTrack(map2,x2,y2,x2,y2,d2);
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                if (map2[i][j] > 1) {
                    map2[i][j] = 1;
                }
            }
        }
        backTrack(map3,x3,y3,x3,y3,d3);
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                if (map3[i][j] > 1) {
                    map3[i][j] = 1;
                }
            }
        }

        int[][] map = new int[n][n];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                map[i][j] += map1[i][j];
                map[i][j] += map2[i][j];
                map[i][j] += map3[i][j];
            }
        }
        int finalX = 0;
        int finalY = 0;

        List<int[]> res = new ArrayList<>();
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                if (map[i][j] == 3) {
                    res.add(new int[]{j,i});
//                    if (i == 0 && j == 0) {
//                        finalX = 0;
//                        finalY = 0;
//                    } else {
//                        if (finalX != 0 && finalY != 0) {
//                            if (j < finalX || j == finalX && i < finalY) {
//                                finalX = j;
//                                finalY = i;
//                            }
//                        } else {
//                            finalX = j;
//                            finalY = i;
//                        }
//                    }
                    finalX = j;
                    finalY = i;
                }
            }
        }
        res.sort((a,b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        finalX = res.get(0)[0];
        finalY = res.get(0)[1];
        finalX++;
        finalY++;

        System.out.printf(finalX + " " + finalY);

    }

    public void backTrack(int[][] map,int x,int y,int startX,int startY,int d) {
        if (d == 0) {
            if (map[startY][startX] == 0) {
                map[startY][startX] = 1;
            } else if (map[startY][startX] == 1) {
                map[startY][startX] = 2;
            } else if (map[startY][startX] == 2) {
                map[startY][startX] = 3;
            }

            return;
        }
//        if (!(startX == x && startY == y)) {
//            map[startY][startX] += 1;
//        }
        map[startY][startX] = -1;
        for (int i = 0;i < direction.length;i++) {
            int nextX = startX + direction[i][0];
            int nextY = startY + direction[i][1];
            if (map[nextY][nextX] == -1) {
                continue;
            }
            if (isValid(map,x,y,nextX,nextY)) {
                backTrack(map,x,y,nextX,nextY,d - 1);
            }
        }
    }

    public boolean isValid(int[][] map,int x,int y,int curX,int curY) {
        int m = map.length;
        int n = map[0].length;
        if (!(curX == x && curY == y) && curX >= 0 && curX < n && curY >= 0 && curY < m) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.solution();
    }
}
