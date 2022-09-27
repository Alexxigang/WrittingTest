//package com.write.code.ruiqiang.xinshiyuzhouTest;
package com.write.code.ruiqiang.mindVerse;
import java.util.Arrays;
import java.util.Scanner;

public class TestOne {

    public void solution() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[][] virtualMan = new int[n][2];

        for (int i = 0;i < n;i++) {
            virtualMan[i][0] = reader.nextInt();
        }
        for (int i = 0;i < n;i++) {
            virtualMan[i][1] = reader.nextInt();
        }

        Arrays.sort(virtualMan,(a,b) -> {
            return b[0] - a[0];
        });

        double minTime = Integer.MAX_VALUE;

        for (int i = 0;i < n - 1;i++) {
            for (int j = i + 1;j < n;j++) {
                double tempTime = (double)(virtualMan[i][0] - virtualMan[j][0]) / (double)(virtualMan[i][1] + virtualMan[j][1]);
                double curLoc = virtualMan[i][0] - virtualMan[i][1] * tempTime;
                boolean isValid = true;
                for (int k = 0;k < i;k++) {
                    if (virtualMan[k][0] - virtualMan[k][1] * tempTime > curLoc) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    for (int k = i + 1;k < j;k++) {
                        if (curLoc == virtualMan[k][0]) {
                            continue;
                        }
                        if (curLoc > virtualMan[k][0]) {
                            if (virtualMan[k][0] + virtualMan[k][1] * tempTime < curLoc) {
                                isValid = false;
                                break;
                            }
                        } else {
                            if (virtualMan[k][0] - virtualMan[k][1] * tempTime > curLoc) {
                                isValid = false;
                                break;
                            }
                        }
                    }
                }
                if (isValid) {
                    for (int k = j + 1;k < n;k++) {
                        if (virtualMan[k][0] + virtualMan[k][1] * tempTime < curLoc) {
                            isValid = false;
                            break;
                        }
                    }
                }

                if (isValid) {
                    minTime = Math.min(minTime,tempTime);
                }
            }
        }

        System.out.println(minTime);

    }

    public static void main(String[] args) {
        TestOne main = new TestOne();
        main.solution();
    }
}
