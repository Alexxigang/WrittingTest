package com.write.code.realgang.shenxinfuTest.testThree;

/**
 * @description: main
 * @author: RealGang
 * @create: 2022-09-01 18:56
 **/
public class Main {
    public static void main(String[] args) {
        /**
         *
         * # 数据字典
         * data = "@#￥%&"
         * dict = {
         *     "@": "0",
         *     "#": "1",
         *     "￥": "2",
         *     "%": "3",
         *     "&": "4",
         *     "0": "@",
         *     "1": "#",
         *     "2": "￥",
         *     "3": "%",
         *     "4": "&",
         *     ".": "."
         * }
         *
         *
         * # 数据输入函数
         * def inPut():
         *     while True:
         *         x = input("输入第一个数字：")
         *         count = 0
         *         for i in x:
         *             if i not in data:
         *                 print("输入字符错误，里面包含" + data + "之外的符号！")
         *                 break
         *             count += 1
         *         if len(x) == count:
         *             break
         *     while True:
         *         y = input("输入第二个数字：")
         *         count = 0
         *         for i in y:
         *             if i not in data:
         *                 print("输入字符错误，里面包含" + data + "之外的符号！")
         *                 break
         *             count += 1
         *         if len(y) == count:
         *             break
         *     return x, y
         *
         *
         * # 10进制转换5进制
         * def f_5(n):
         *     int_b, float_b = "", ""
         *     int_n = eval(str(n).partition(".")[0])
         *     float_n = 0
         *     if str(n).partition(".")[2] != "":
         *         float_n = eval("0." + str(n).partition(".")[2])
         *     while True:
         *         s = int_n // 5  # 商
         *         y = int_n % 5  # 余数
         *         int_b += str(y)
         *         if s == 0:
         *             break
         *         int_n = s
         *     if str(n).partition(".")[2] != "":
         *         for i in range(5):
         *             s = float_n * 5
         *             if (s != 0):
         *                 float_b += str(s).partition(".")[0]
         *             else:
         *                 break
         *             float_n = eval("0." + str(s).partition(".")[2])
         *     return int_b[::-1] + "." + float_b
         *
         *
         * # 5进制转换10进制
         * def f_10(x):
         *     s_x = ""
         *     n = 0
         *     for i in range(len(x)):
         *         s_x += dict[x[i]]
         *     if s_x.partition(".")[2] != "":
         *         numx = int(s_x.partition(".")[0], 5)
         *         s = s_x.partition(".")[2]
         *         for i in range(len(s)):
         *             n += eval(s[i]) * (5 ** (-(i + 1)))
         *     else:
         *         numx = eval(str(int(s_x.partition(".")[0], 5)))
         *     #     print(numx+n)
         *     return numx + n
         */
    }
}
