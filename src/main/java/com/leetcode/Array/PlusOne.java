package com.leetcode.Array;

import java.util.Arrays;

/**
 * 数组
 * 66. 加一
 * URL:https://leetcode-cn.com/problems/plus-one/
 * 核心思想:
 * 取余10 如果加一之后取余10有余数，则代表需要进位，没有直接返回
 * **/
public class PlusOne {
    public static void main(String [] args){
        int[] arr={1,2,9};
        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            int tmp=digits[i]+1;
            if(tmp%10==0){
                digits[i]=0;
            }else{
                digits[i]=digits[i]+1;
                return digits;
            }

        }
        digits=new int[digits.length+1];
        digits[0]=1;

        return digits;

    }
}
