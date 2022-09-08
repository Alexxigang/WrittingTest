package com.write.code.realgang.shangtangTest.testOne;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-08 20:09
 **/
public class Main {

    public int[][] rotate(int[][] matrix) {
        // 思路：先沿着对角线反转，然后反转每一行，就相当于顺时针翻转矩阵
        int n = matrix.length;
        if (n == 1) {
            return matrix;
        }
        // 先沿着对角线反转
        for (int i = 0;i < n;i++) {
            for (int j = i;j < n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 翻转每一行
        for (int[] row:matrix) {
            reverse(row);
        }

        return matrix;
    }

    private void reverse(int[] row) {
        int left = 0,right = row.length-1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
