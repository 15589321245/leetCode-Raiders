package com.leetcode.BreadthFirstSearch;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 深度优先
 * 733. 图像渲染
 * URL:https://leetcode-cn.com/problems/flood-fill/
 * 核心思想:
 *  递归将上下左右都改色
 * **/
public class FloodFill {
    public static void main(String [] args){
        int[][] arr={{0,0,0},{0,1,1},{0,1,1}};
//        System.out.print(Arrays.toString(arr));
        System.out.print(Arrays.deepToString(floodFill(arr,1,1,1)));

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        dfs(image,sr,sc,newColor,image[sr][sc]);

       return image;
    }

    private static void dfs(int[][] image,int sr, int sc, int newColor,int oldColor){
            if (sr<0 || sc<0 || sr>=image.length || sc>=image[sr].length || image[sr][sc]!=oldColor){
                  return;
            }
            //如果要替换
            if (image[sr][sc]!=newColor){
                image[sr][sc]=newColor;
                //上
                dfs(image,sr+1,sc,newColor,oldColor);
                //下
                dfs(image,sr-1,sc,newColor,oldColor);
                //左
                dfs(image,sr,sc-1,newColor,oldColor);
                //右
                dfs(image,sr,sc+1,newColor,oldColor);
            }

    }


}
