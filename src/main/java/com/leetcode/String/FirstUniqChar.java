package com.leetcode.String;

import java.util.HashMap;

/**
 * HashMap
 * 387. 字符串中的第一个唯一字符
 * URL:https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * 核心思想:
 * map里放字符出现的次数，遍历的时候如果等于1就是首次出现的
 * **/
public class FirstUniqChar {
    public static void main(String [] args){
          String s="loveleetcode";
//        System.out.print(Arrays.toString(arr));
        System.out.print(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;

    }
}
