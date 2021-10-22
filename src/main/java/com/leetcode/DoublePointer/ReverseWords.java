package com.leetcode.DoublePointer;

import java.util.Arrays;

/**
 * 双指针
 * 反转字符串中的单词 III
 * URL:https://leetcode-cn.com/problems/reverse-string/
 * 核心思想:
 * 双指针替换
 * **/
public class ReverseWords {
    public static void main(String [] args){
        String arr="Let's take LeetCode contest";
//        System.out.print(Arrays.toString(arr));
        System.out.print(reverseWords(arr));
    }

    private static String reverseWords(String s) {
        String [] parts = s.split(" ");
        String res="";
        for (int i=0;i<parts.length;i++){
            if (res.isEmpty()){
                res=res+reverse(parts[i].split(""));
            }else{
                res=res+" "+reverse(parts[i].split(""));
            }
        }
        return res;


    }
    private static String reverse(String[] str){
        String r="";
        String l="";
        int i=0,len=str.length;

        while (i<len){
            r=str[i]+r;
            if (i!=len-1){
                l=l+str[len-1];
            }
            i++;
            len--;
        }

        return l+r;

    }
}
