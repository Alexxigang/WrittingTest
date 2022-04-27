package writeTest.hornorTest.testThree;

import java.util.*;

/**
 * @author ：RealGang
 * @description： 相当于m个数放入到n个堆里
 * @date ： 2022/4/16 18:42
 */
public class Main {
    PriorityQueue<Integer> pq;
    Set<String> resSet;
    public void test() {
        Scanner reader = new Scanner(System.in);
        long MOD = 1000000007;
        int m = reader.nextInt();
        int n = reader.nextInt();
        long[][] dp = new long[201][n + 1];
        for (int i = 1;i <= 200;i++) {
            for (int j = 1;j <= i;j++) {
                if(j == i || j == 1) {
                    dp[i][j]=1;
                } else {
                    dp[i][j]=(dp[i-1][j-1]+dp[i-j][j])%MOD;
                }
            }
        }
//        int[] area = new int[m + 1];
//        pq = new PriorityQueue<>();
//        resSet = new HashSet<>();
//        LinkedList<Integer> track = new LinkedList<>();
//        backTrack(area,m,n,0,track);
//        for(String s:resSet) {
//            System.out.println(s);
//        }
        long res = dp[m][n] % MOD;
        System.out.println(res);
    }


    public void backTrack(int[] area,int m,int n,int startIndex,LinkedList<Integer> track) {
        if (track.size() == n - 1) {
            for (int i = 0;i < track.size();i++) {
                if (i == 0) {
                    pq.offer(track.get(i) - 0);
                } else {
                    pq.offer(track.get(i) - track.get(i - 1));
                }
            }
            pq.offer(m - track.getLast());
            StringBuilder sb = new StringBuilder();
            while (!pq.isEmpty()) {
                sb.append(pq.poll());
                sb.append("-");
            }
            resSet.add(sb.toString());
            return;
        }

        for (int i = startIndex;i < area.length;i++) {
            track.add(i);
            backTrack(area,m,n,i,track);
            track.removeLast();
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}
