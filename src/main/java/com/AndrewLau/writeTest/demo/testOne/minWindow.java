package com.AndrewLau.writeTest.demo.testOne;

import java.util.HashMap;
import java.util.Map;

public class minWindow {

    public String minwindow(String s,String t){
        int lenS = s.length();
        int lenT = t.length();
        Map<Character,Integer> tWindow = new HashMap<>();
        Map<Character,Integer> sWindow = new HashMap<>();
        for(char c:t.toCharArray()){
            tWindow.put(c,tWindow.getOrDefault(c,0)+1);
        }

        int num = 0;
        for(int i=0;i< lenS;i++){
            char tempt = s.charAt(i);
            sWindow.put(tempt,sWindow.getOrDefault(tempt,0)+1);
            if(tWindow.containsKey(tempt)&&sWindow.get(tempt)==tWindow.get(tempt)){
                num ++;
            }
        }
        return "";
    }
}
