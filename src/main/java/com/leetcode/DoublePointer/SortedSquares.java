package com.leetcode.DoublePointer;

import java.util.Arrays;

/**
 * 二分问题，双指针
 * 977. 有序数组的平方
 * URL:https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 * 核心思想:
 * 数组本身是有序的，但是有负数的存在，求平方后可能会变大，但是最大的只会存在于数组的头和尾，
 * 所以双指针每次遍历的时候只需比较两侧平方后哪个大，然后放入数组中
 * **/
public class SortedSquares {
    public static void main(String [] args){
        int[] arr={-4,-1,0,3,10};
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int left=0,right=nums.length-1,index=nums.length-1;
        while (left<=right){
            int leftSquares=nums[left]*nums[left];
            int rightSquares=nums[right]*nums[right];
            if(leftSquares>rightSquares){
                res[index]=leftSquares;
                left++;
            }else {
                res[index]=rightSquares;
                right--;
            }
            index--;

        }

        return res;
    }

}
