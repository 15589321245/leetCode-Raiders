package com.leetcode.DoublePointer;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 双指针
 * 344. 反转字符串
 * URL:https://leetcode-cn.com/problems/reverse-string/
 * 核心思想:
 * 双指针替换
 * **/
public class ReverseString {
    public static void main(String [] args){
        char[] arr={'h','e','l','l','o'};
        System.out.print(Arrays.toString(arr));
        System.out.print(reverseString(arr));
    }

    public static char[]  reverseString(char[] s) {
        int i=0,l=s.length;
        while (i<l){
            char tmp=s[i];
            s[i]=s[l-1];
            s[l-1]=tmp;
            i++;
            l--;

        }
        return  s;

    }
}
