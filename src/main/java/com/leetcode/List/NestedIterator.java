package com.leetcode.List;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * HashMap
 * 387. 字符串中的第一个唯一字符
 * URL:https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * 核心思想:
 * map里放字符出现的次数，遍历的时候如果等于1就是首次出现的
 * **/
public class NestedIterator implements Iterator<Integer> {
    static int sum;
    static List<NestedInteger> next;
    public NestedIterator(List<NestedInteger> nestedList) {
        next=nestedList;
    }

    @Override
    public Integer next() {
       if (next.get()){

       }
    }

    @Override
    public boolean hasNext() {
        if (next!=null){
            return true;
        }
        return false;
    }
}

 public  interface NestedInteger {

       public boolean isInteger();


      public Integer getInteger();


      public List<NestedInteger> getList();
}
