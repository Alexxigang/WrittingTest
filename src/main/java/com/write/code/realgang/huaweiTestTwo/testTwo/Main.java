package com.write.code.realgang.huaweiTestTwo.testTwo;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-07 19:14
 **/
public class Main {
//    int startX = -1;
//    int startY = -1;
//    int endX = -1;
//    int endY = -1;
//
//    public void solution() {
//        Scanner reader = new Scanner(System.in);
//        int M = reader.nextInt();
//        int N = reader.nextInt();
//
//        char[][] block = new char[M][N];
//        reader.nextLine();
//        for (int i = 0;i < M;i++) {
//            String s = reader.nextLine();
//            char[] chars = s.toCharArray();
//            for (int j = 0;j < N;j++) {
//                block[i][j] = chars[j];
//            }
//        }
//
//        for (int i = 0;i < M;i++) {
//            for (int j = 0;j < N;j++) {
//                if (block[i][j] == 'S') {
//                    startX = i;
//                    startY = j;
//                }
//                if (block[i][j] == 'E') {
//                    endX = i;
//                    endY = j;
//                }
//                if (startX != -1 && endX != -1) {
//                    break;
//                }
//            }
//        }
//
//        int m = endY - startX + 1;
//        int n = endX - startX + 1;
//        System.out.println(13);
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.solution();
//    }

    /**
     * ##########################################################
     */

//    static int res = INT32_MAX;
//    void dfs(vector<vector<char>>& map, int i, int j, int step, int dir) {
//        if (i < 0 || i >= map.size() || j < 0 || j >= map[0].size()) return;
//        if (map[i][j] == 'X' || map[i][j] == 'S') return;
//        if (map[i][j] == 'E') {
//            res = min(res, step);
//            return;
//        }
//        map[i][j] = 'X';
//        int step_plus[4];
//        step_plus[0] = (dir == 0 ? 1 : 2);
//        step_plus[1] = (dir == 1 ? 1 : 2);
//        step_plus[2] = (dir == 2 ? 1 : 2);
//        step_plus[3] = (dir == 3 ? 1 : 2);
//        dfs(map, i - 1, j, step + step_plus[0], 0);
//        dfs(map, i, j + 1, step + step_plus[1], 1);
//        dfs(map, i + 1, j, step + step_plus[2], 2);
//        dfs(map, i, j - 1, step + step_plus[3], 3);
//        map[i][j] = 'B';
//    }
//
//    int main() {
//
//        int m, n;
//        cin >> m >> n;
//        int start_x, start_y;
//        vector<vector<char>> map(m, vector<char>(n));
//        for (int i = 0; i < m; ++i) {
//            string s;
//            cin >> s;
//            for (int j = 0; j < n; ++j) {
//                map[i][j] = s[j];
//                if (s[j] == 'S') {
//                    start_x = i;
//                    start_y = j;
//                }
//            }
//        }
//
//        dfs(map, start_x - 1, start_y, 1, 0);
//        dfs(map, start_x, start_y + 1, 1, 1);
//        dfs(map, start_x + 1, start_y, 1, 2);
//        dfs(map, start_x, start_y - 1, 1, 3);
//
//        if (res == INT32_MAX) cout << -1 << endl;
//        else cout << res << endl;
//
//        return 0;
//    }


    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[] direction = {false, true, false, true};//上下定义为true,横向定义为false

    private static int getShortDis(char[][] grid, int[] start, int[] end) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        //按照距离升序排列
        PriorityQueue<Node> nodes = new PriorityQueue<>((a, b) -> {
            return a.dis - b.dis;
        });
        //添加初始节点
        nodes.add(new Node(start[0], start[1], 0, null));
        while (!nodes.isEmpty()) {
            Node poll = nodes.poll();
            //已经遍历过则跳过
            if (visited[poll.x][poll.y]) continue;
            visited[poll.x][poll.y] = true;
            //如果途中找到了结果直接返回
            if (poll.x == end[0] && poll.y == end[1]) return poll.dis;
            for (int i = 0; i < 4; i++) {
                int numSteps = 0;
                int x = poll.x+dx[i], y = poll.y+dy[i];
                //如果发生方向的转变需要额外增加1步
                if (poll.isUpDown != null && poll.isUpDown != direction[i]) {
                    numSteps++;
                }
                //搜索目标结果
                while (x >= 0 && x  < m && y  >= 0 && y  < n && (grid[x ][y ] == 'B' || grid[x][y ] == 'E')) {
                    numSteps++;
                    //如果已访问则不参与排序
                    if (!visited[x][y]) nodes.add(new Node(x, y, poll.dis + numSteps, i == 1 || i == 3));
                    x+=dx[i];
                    y+=dy[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            scanner.nextLine();
            char[][] grid = new char[row][col];
            int[] start = new int[2];
            int[] end = new int[2];
            for (int i = 0; i < row; i++) {
                String s = scanner.nextLine();
                for (int j = 0; j < col; j++) {
                    grid[i][j] = s.charAt(j);
                    if (grid[i][j] == 'S') {
                        start[0] = i;
                        start[1] = j;
                    } else if (grid[i][j] == 'E') {
                        end[0] = i;
                        end[1] = j;
                    }
                }
            }
            System.out.println(getShortDis(grid, start, end));

        }
    }

    static class Node {
        int x, y, dis;
        Boolean isUpDown;

        public Node(int x, int y, int dis, Boolean isUpDown) {
            this.x = x;
            this.y = y;
            this.dis = dis;
            this.isUpDown = isUpDown;
        }
    }


}
