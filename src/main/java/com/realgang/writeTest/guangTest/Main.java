package com.realgang.writeTest.guangTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-04-20 20:44
 **/
public class Main {
    Map<String,Integer> map;
    public void test() {

    }

    public void initMap() {
        map = new HashMap<>();
        map.put("0-1",4);
        map.put("1-0",4);
        map.put("0-2",3);
        map.put("2-0",3);
        map.put("0-3",3);
        map.put("3-0",3);
        map.put("0-4",4);
        map.put("4-0",4);
        map.put("0-5",3);
        map.put("5-0",3);
        map.put("0-6",2);
        map.put("6-0",2);

        map.put("0-7",3);
        map.put("7-0",3);
        map.put("0-8",1);
        map.put("8-0",1);
        map.put("0-9",3);
        map.put("9-0",3);
    }

    public int get(int a,int b) {
        String str = a + "-" + b;
        return map.get(str);
    }
    public static void main(String[] args) {

    }
}
