package com.leetcode.ListNode;

/**
 * 双指针链表
 * 19. 删除链表的倒数第 N 个结点
 * URL:https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * 核心思想:
 * 快指针先走n步，然后循环快指针，快指针循环完，慢指针正好到到剔除的位置
 * **/
public class RemoveNthFromEnd {
    public static void main(String [] args){
//        ListNode<int> arr=[7,1,5,3,6,4];
//        System.out.print(Arrays.toString(arr));
//        System.out.print(middleNode(arr));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast=head,slow=head,parent=head;
            for (int i=0;i<n;i++){
                fast=fast.next;
            }
            while (fast!=null){
                parent=slow;
                slow=slow.next;
                fast=fast.next;
            }
            if (head==slow){
                head=head.next;
            }else{
                parent.next=slow.next;
            }
            return head;

    }
}

