package com.leetcode.DoublePointer;

import java.util.Arrays;

/**
 * 双指针
 * 283. 移动零
 * URL:https://leetcode-cn.com/problems/move-zeroes/
 * 核心思想:
 * 遍历数组，遇到不为0就往前移动，刷新两个指针的值，最后补0
 * **/
public class MoveZeroes {
    public static void main(String [] args){
        int[] arr={0,1,0,3,12};
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int[] nums) {
        int zeroNum=0,i=0,length=nums.length;
        while (i<length){
            if(nums[i]!=0){
                nums[zeroNum]=nums[i];
                zeroNum++;
            }
            i++;

        }
        while (zeroNum<length){
            nums[zeroNum]=0;
            zeroNum++;

        }


        return nums;
    }
}
