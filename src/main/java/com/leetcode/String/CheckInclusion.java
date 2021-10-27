package com.leetcode.String;

import java.util.HashMap;

/**
 * 滑动窗口，map
 * 567. 字符串的排列
 * URL:https://leetcode-cn.com/problems/permutation-in-string/
 * 核心思想:
 * 先遍历将s1和s2，s1个长度的窗口，然后比较如果相等则返回，不行等，利用左右窗口，在map中记录每个key 出现的次数，然后左侧缩小，右侧增加，滑动窗口
 * **/
public class CheckInclusion {
    public static void main(String [] args){
        System.out.print(checkInclusion("adc","dcda"));
    }

    public static Boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
        for (int i=0;i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }

        if (map1.equals(map2)){
            return true;
        }
        int right=s1.length();
        for (int i=right;i<s2.length();i++){
            //右侧元素入map
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            //左侧元素出map
            char index=s2.charAt(i-s1.length());
            if (map2.get(index)==1){
                map2.remove(index);
            }else{
                map2.put(index,map2.get(index)-1);
            }
            if (map1.equals(map2)){
                return true;
            }

        }



        return false;
    }
}