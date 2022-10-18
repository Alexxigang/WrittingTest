package com.write.code.realgang.antTest.testTwo;

import java.util.*;

/**
 * @description:
 * @author: RealGang
 * @create: 2022-09-27 20:07
 **/
public class Main {

    public void solute(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> note_map = new HashMap<>();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }

        int res = 0;

        for (int i = 0;i < n;i++) {
            int cur = nums[i];
            int val = map.get(cur);
            if (val > 1) {
                int temp = cur;
                res++;
                while (map.getOrDefault(temp + k,0) != 0) {
                    temp += k;
                    if (note_map.getOrDefault(temp,Integer.MIN_VALUE) > Integer.MIN_VALUE) {
                        res = res + (note_map.get(temp) - temp) / k + 1;
                        note_map.put(temp,note_map.get(temp) + k);
                        break;
                    }
                    res++;
                }

                note_map.put(cur,note_map.get(temp) + k);
                map.put(temp+k,1);
                map.put(cur,val - 1);
            }
        }

        System.out.println(res);
//        Arrays.sort(nums);
//        Set st = new HashSet();
//        for(int i=0;i<n;i++){
//            st.add(nums[i]);
//        }
//
//        int count = 0;
//        for(int i=1;i<n;i++){
//            if(nums[i] == nums[i-1]){
//                while(st.contains(nums[i])){
//                    nums[i] += k;
//                    count += 1;
//                }
//                st.add(nums[i]);
//            }
//        }
//
//
//        System.out.println(count);
    }

    public static void main(String[] args) {
        Main ma = new Main();
        ma.solute();
    }
}
