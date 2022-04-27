package writeTest.huaWeiTest.testOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ：
 * @description：
 * @date ： 2022/4/27 19:39
 */
public class Main {
    int maxValue = 0;
    public void test() {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int[][] projectPreValue = new int[m + 1][2];
        List<int[] > projectPersonList = new ArrayList<>();
        int[] teamSum = new int[3];
        teamSum[0] = reader.nextInt();
        teamSum[1] = reader.nextInt();
        teamSum[2] = reader.nextInt();

        for (int i = 0;i < m;i++) {
            // 记录索引位置
            projectPreValue[i][0] = i;
            // 记录项目预估值
            projectPreValue[i][1] = reader.nextInt();
        }

        // 按照项目预估值降序排序
        Arrays.sort(projectPreValue,(a,b) -> {
            return b[1] - a[1];
        });

        for (int i = 0;i < m;i++) {
            int[] needPerson = new int[3];
            needPerson[0] = reader.nextInt();
            needPerson[1] = reader.nextInt();
            needPerson[2] = reader.nextInt();
            projectPersonList.add(needPerson);
        }

        int[] sumLeft = new int[3];
        sumLeft[0] = teamSum[0];
        sumLeft[1] = teamSum[1];
        sumLeft[2] = teamSum[2];

        backTrack(projectPreValue,teamSum,sumLeft,projectPersonList,m,0,0);

        System.out.println(maxValue);
    }

    public void backTrack(int[][] projectPreValue,int[] teamSum,int[] sumLeft,List<int[] > projectPersonList,int m,int startIndex,int valueSum) {
        if (startIndex >= m) {
            return;
        }
        if (sumLeft[0] <=0 || sumLeft[1] <= 0 || sumLeft[2] <= 0) {
            return;
        }

        for (int i = startIndex;i < m;i++) {
            int projectIndex = projectPreValue[i][0];
            if (sumLeft[0] >= projectPersonList.get(i)[0] && sumLeft[1] >= projectPersonList.get(i)[1] && sumLeft[2] >= projectPersonList.get(i)[2]) {
                sumLeft[0] -= projectPersonList.get(i)[0];
                sumLeft[1] -= projectPersonList.get(i)[1];
                sumLeft[2] -= projectPersonList.get(i)[2];
                valueSum += projectPreValue[i][1];
                maxValue = Math.max(maxValue,valueSum);
                backTrack(projectPreValue,teamSum,sumLeft,projectPersonList,m,i + 1,valueSum);
                valueSum -= projectPreValue[i][1];
                sumLeft[0] += projectPersonList.get(i)[0];
                sumLeft[1] += projectPersonList.get(i)[1];
                sumLeft[2] += projectPersonList.get(i)[2];
            }
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}
