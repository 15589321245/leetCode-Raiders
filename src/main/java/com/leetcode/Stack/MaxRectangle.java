package com.leetcode.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 单调栈题目
 * 84. 柱状图中最大的矩形
 * URL:https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 * 核心思想:
 *  遍历往右找，找到小于栈顶元素的值，然后开始出栈，根据宽*高计算面积
 *  因为栈的顺序都是小到大，所有最右边肯定是最大的，所以出栈的时候往左计算，中间隔着的范围肯定是包含这个高度的
 * **/
public class MaxRectangle {
    public static void main(String [] args){
        int[] arr={2,1,5,6,2,3};
        System.out.print(Arrays.toString(arr));
        System.out.print(largestRectangleArea(arr));
    }
    private static int largestRectangleArea(int[] heights) {
        int l=heights.length;
        int[] tmpArr=new int[l+2];
        System.arraycopy(heights,0,tmpArr,1,l);
        int ans=0;
        Deque<Integer> stack=new ArrayDeque<>();
        for (int i=0;i<tmpArr.length;i++){
            while (!stack.isEmpty() && tmpArr[i]<tmpArr[stack.peek()]){
                int top=stack.pop();
                int h=tmpArr[top];
                int left=stack.peek();
                int w=i-left-1;
                ans=Math.max(ans,h*w);

            }

            stack.push(i);
        }
        return ans;

    }

}
