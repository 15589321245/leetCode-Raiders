package com.leetcode.String;

import java.util.HashMap;

/**
 * 滑动窗口，map
 * 567. 字符串的排列
 * URL:https://leetcode-cn.com/problems/permutation-in-string/
 * 核心思想:
 *
 * **/
public class CheckInclusion {
    public static void main(String [] args){
        System.out.print(checkInclusion("adc","dcda"));
    }

    public static Boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for (int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }



        return false;
    }
}