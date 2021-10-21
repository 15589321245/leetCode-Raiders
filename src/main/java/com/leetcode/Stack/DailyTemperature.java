package com.leetcode.Stack;

import java.util.Arrays;
import java.util.Stack;
/**
 * 单调栈题目
 * 739. 每日温度
 * URL:https://leetcode-cn.com/problems/daily-temperatures/
 * 核心思想:
 * 求每层的差值和宽度，差值和宽度乘积就是面积，
 * 求差值的时候用最栈顶 左边和当前元素最小的一个来决定最高的高度
 * (因为最左边肯定是最大的，所以栈顶左右需要求出最小的先pop出去)，求差值
 * **/
public class DailyTemperature {
    public static void main(String [] args){
        int[] arr={73,74,75,71,69,72,76,73};
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(dailyTemperatures(arr)));
    }
    //双层循环版
    private static int[] dailyTemperatures(int[] temperatures) {
        int temLen=temperatures.length;
        int [] intervalArray=new int[temperatures.length];
        for (int i=0;i<temLen;i++){
            int sum=0;
            for (int j=i;j<temLen;j++){
                if (temperatures[j]>temperatures[i]){
                    sum=j-i;
                    break;
                }

            }

            intervalArray[i]=sum;

        }

        return intervalArray;
    }
    //单调栈
    private static int[] dailyTemperatures2(int[] temperatures) {
        int [] intervalArray=new int[temperatures.length];
        Stack<Integer> stack=new Stack<Integer>();
        for (int i=0;i<temperatures.length;i++){
            while (!stack.empty()&&temperatures[i]>temperatures[stack.peek()]){
                Integer val=stack.pop();
                intervalArray[val]=i-val;
            }
            stack.push(i);

        }

        return intervalArray;
    }

}

////双层循环版
//class Solution1 {
//    public int[] dailyTemperatures(int[] temperatures) {
//        int temLen=temperatures.length;
//        int [] intervalArray=new int[temperatures.length];
//        for (int i=0;i<temLen;i++){
//            int sum=0;
//            for (int j=i;j<temLen;j++){
//                if (temperatures[j]>temperatures[i]){
//                    sum=j-i;
//                    break;
//                }
//
//            }
//
//            intervalArray[i]=sum;
//
//        }
//
//        return intervalArray;
//    }
//}
//
////单调栈
//class Solution2 {
//    public int[] dailyTemperatures(int[] temperatures) {
//        int [] intervalArray=new int[temperatures.length];
//        Stack<Integer> stack=new Stack<Integer>();
//        for (int i=0;i<temperatures.length;i++){
//            while (!stack.empty()&&temperatures[i]>temperatures[stack.peek()]){
//                    Integer val=stack.pop();
//                    intervalArray[val]=i-val;
//            }
//            stack.push(i);
//
//        }
//
//        return intervalArray;
//    }
//}