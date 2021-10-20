package com.leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * 单调栈题目
 * 84. 柱状图中最大的矩形
 * URL:https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 * 核心思想:
 * **/
public class MaxRectangle {
    public static void main(String [] args){
        Solution2 Solution=new Solution2();
        int[] arr={73,74,75,71,69,72,76,73};
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(Solution.dailyTemperatures(arr)));
    }


}
