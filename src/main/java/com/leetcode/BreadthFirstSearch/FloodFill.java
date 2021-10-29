package com.leetcode.BreadthFirstSearch;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 单调递增站（栈底从大到小）
 * 733. 图像渲染
 * URL:https://leetcode-cn.com/problems/flood-fill/
 * 核心思想:
 *
 * **/
public class FloodFill {
    public static void main(String [] args){
        int[][] arr={{1,1,1},{1,1,0},{1,0,1}};
        System.out.print(Arrays.toString(arr));
        System.out.print(floodFill(arr,1,1,2));

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

    }



}
