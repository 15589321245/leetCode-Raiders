package com.leetcode.Stack;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    /**
     * 接雨水
     * 核心思想，求每层的差值和宽度，差值和宽度乘积就是面积，
     * 求差值的时候用最栈顶 左边和当前元素最小的一个来决定最高的高度
     * (因为最左边肯定是最大的，所以栈顶左右需要求出最小的先pop出去)，求差值
     * **/
    public int trap(int[] height) {
        int length=height.length;
        Stack<Integer> stack=new Stack<Integer>();
        int area=0;
        for (int i=0;i<length;i++){
            while (!stack.empty() && height[i]>height[stack.peek()]){
                int top=stack.pop();
                if (stack.empty()){
                    break;
                }
                int left=stack.peek();
                int h=Math.min(height[i],height[left])-height[top];
                int w=i-left-1;
                area+=h*w;
            }
            stack.push(i);
        }
        return area;
    }

    /**
     * 下一个更大元素 I
     * 利用递增栈维护 栈底到栈顶从大到小，如果遍历过程中遇到比栈顶元素大的，就记录到map里
     * **/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length=nums2.length;
        Stack<Integer> stack=new Stack<Integer>();
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for (int i=0;i<length;i++){
            while (!stack.empty() && stack.peek()<nums2[i]){
                hash.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int[] res=new int[nums1.length];
        for (int j=0;j<nums1.length;j++){
            res[j]=hash.getOrDefault(nums1[j],-1);
        }
        return res;

    }
    /**
     * 柱状图中最大的矩形
     * 单调递增栈原理，核心：遍历往右找，找到小于栈顶元素的值，然后开始出栈，根据宽*高计算面积
     * 因为栈的顺序都是小到大，所有最右边肯定是最大的，所以出栈的时候往左计算，中间隔着的范围肯定是包含这个高度的
     * **/
    public int largestRectangleArea(int[] heights) {
        int[] tmp=new int [heights.length+2];
        System.arraycopy(heights,0,tmp,1,heights.length);
        Deque<Integer> stack=new ArrayDeque<>();
        int area=0;
        for (int i=0;i<tmp.length;i++){
            while (!stack.isEmpty() && tmp[i]<tmp[stack.peek()]){
                int top=stack.pop();
                int h=tmp[top];
                int l=stack.peek();
                int w=i-l-1;
                area=Math.max(area,h*w);

            }
            stack.push(i);
        }
        return area;

    }


    /**
     * 二分查找
     * 核心思想，只循环数组一半长度的查找，每次循环中心点的左右都去查找是否等于目标值
     * **/
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            if (nums[left]==target){
                return left;
            }
            if (nums[right]==target){
                return right;
            }
            left++;
            right--;

        }
        return -1;

    }


    /**
     * 第一个错误的版本
     * 核心思想，还是二分查找,但是是每次范围缩小，每次查中间看看，是否是true，如果是true证明有错误版本，
     * 然后继续往左找，如果是false证明没有错误版本继续往右缩小找
     *
     * **/
    public int firstBadVersion(int n) {
       int left=1,right=n;
       while (left<right){
           int mid=left+(right-left)/2;
//           if(isBadVersion(mid)){
//               right=mid;
//           }else {
//               left=mid+1;
//           }

       }
       return left;

    }

    /**
     * 搜索插入位置
     * 核心思想，还是二分查找,但是是每次范围缩小，每次查中间看看，是否小于等于该值，如果等于直接返回，如果小于则缩小左侧范围继续查找
     * 如果大于则往右查找
     *
     * **/
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }
           if(target>nums[mid]){
               left=mid+1;
           }else {
               right=mid-1;
           }

        }
        return left;
    }









































}


