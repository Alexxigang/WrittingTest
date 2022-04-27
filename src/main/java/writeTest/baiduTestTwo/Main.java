package writeTest.baiduTestTwo;

import java.util.Scanner;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-03-29 20:13
 **/
public class Main {

    public void test() {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int x = reader.nextInt();
        int y = reader.nextInt();

        int count = 0;
        int maxGift = Math.max(a,b);
        int minGift = Math.min(a,b);

        int maxCon = Math.max(x,y);
        int minCon = Math.min(x,y);
        while (maxGift >= maxCon && minGift >= minCon) {
            count++;
            maxGift -= maxCon;
            minGift -= minCon;

            if (maxGift < minGift) {
                int temp = maxGift;
                maxGift = minGift;
                minGift = temp;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}
