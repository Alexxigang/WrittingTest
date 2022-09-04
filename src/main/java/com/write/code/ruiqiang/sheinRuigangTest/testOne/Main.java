package com.write.code.ruiqiang.sheinRuigangTest.testOne;

import java.util.HashMap;

public class Main {
    class Solution {
        public int[] firstSon(char[] s, String t) {

            int j = 0;
            int start = 0,end = 0;
            int[] result = new int[2];
            for(int i = 0;i < s.length;i ++)
            {
                if(s[i] == t.charAt(j)){

                    if(j==0){
                        start = i;
                    }
                    j += 1;
                }
                if(j==t.length()){
                    end = i;
                    result[0] = start;
                    result[1] = end;
                    return result;
                }

            }
            return new int[]{};
        }
    }


}
