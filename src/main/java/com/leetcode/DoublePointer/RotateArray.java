package com.leetcode.DoublePointer;

import java.util.Arrays;

/**
 * 数组三次翻转,双指针
 * 189. 旋转数组
 * URL:https://leetcode-cn.com/problems/rotate-array/
 * 核心思想:
 * 先翻转一遍数组，因为尾部肯定要翻转到前面
 * 第二次翻转0 ~ k-1长度的前部分数组让其顺序翻转回原来
 * 第三次讲k~length-1 部分翻转回原来的顺序
 * 1,2,3,4,5 k=2
 * 1:54321
 * 2:45321
 * 3:45123 yes
 * **/
public class RotateArray {
    public static void main(String [] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(rotate(arr,18)));
    }

    public static int[] rotate(int[] nums, int k) {
        if (nums.length>1){
            int n = nums.length;
            k =k%n;
            nums=reversal(nums,0,nums.length-1);
            nums=reversal(nums,0,k-1);
            nums=reversal(nums,k,nums.length-1);

            System.out.println(Arrays.toString(nums));
        }

        return nums;
    }
    private static int[]  reversal(int[] nums,int start,int end){
        while (start<=end){
                int endVal=nums[end];
                nums[end]=nums[start];
                nums[start]=endVal;
                start++;
                end--;
        }
        return nums;
    }

}
