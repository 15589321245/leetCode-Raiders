package com.leetcode.DoublePointer;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 单调递增站（栈底从大到小）
 * 283. 买卖股票的最佳时机
 * URL:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 核心思想:
 * 维护栈顶最小，后面遇到大的就是减求差值，找出差值最大的，就是价格最合适的
 * **/
public class MaxProfit {
    public static void main(String [] args){
        int[] arr={7,1,5,3,6,4};
        System.out.print(Arrays.toString(arr));
        System.out.print(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int l=prices.length;
        int res=0;
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(99999);
        for (int i=0;i<l;i++){

            if (!stack.isEmpty() && prices[i]>stack.peek()){
                    int stackVal=stack.peek();
                    res=Math.max(res,prices[i]-stackVal);
            }

            if (prices[i]<stack.peek()){
                stack.push(prices[i]);
            }

        }
        return res;

    }
}
