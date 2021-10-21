package com.leetcode.DoublePointer;

import java.util.Arrays;

/**
 * 双指针，空间缩小法
 * 167. 两数之和 II - 输入有序数组
 * URL:https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * 核心思想:
 * 指针两侧相加如果小于目标值，则左侧指针往前移，因为最左侧的值，加了最大的还是小于目标
 * 右侧同理，加了最小的还是大于目标值，所以移动指针
 * **/
public class TwoSum {
    public static void main(String [] args){
        int[] arr={2,7,11,15};
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(twoSum(arr,9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i=0,length=numbers.length;
        int[] res=new int[2];
        while (i<length){
            int sum=numbers[i]+numbers[length-1];
            if (sum>target){
                length--;
            }else if(sum<target){
                i++;
            }else{
                res[0]=i+1;
                res[1]=length;
                return  res;
            }

        }
        return res;
    }
}
