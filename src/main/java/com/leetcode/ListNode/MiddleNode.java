package com.leetcode.ListNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 双指针链表
 * 876. 链表的中间结点
 * URL:https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * 核心思想:
 * 快慢指针，快指针结束之后正好,next和当前都为空时，慢指针到中间
 * **/
public class MiddleNode {
    public static void main(String [] args){
//        ListNode<int> arr=[7,1,5,3,6,4];
//        System.out.print(Arrays.toString(arr));
//        System.out.print(middleNode(arr));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slowList=head;
        ListNode fastList=head;
        while (fastList!=null &&fastList.next!=null ){
            slowList=slowList.next;
            fastList=fastList.next.next;
        }
        return  slowList;

    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}