package com.leetcode.String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 滑动窗口，map
 * 3. 无重复字符的最长子串
 * URL:https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 核心思想:
 * 使用map记录重复下标的最大index，遇到相同的计算距离
 * **/
public class LengthOfLongestSubstring {
    public static void main(String [] args){
        String par=" ";
        System.out.println(lengthOfLongestSubstring(par));
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans=0;
        int maxIndex=0;
        if (s.length()==0){
            return ans;
        }
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                maxIndex=Math.max(maxIndex,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            ans=Math.max(ans,i-maxIndex+1);
        }
        return ans;
    }
}