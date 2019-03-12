package jianZhiOffer;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class test3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (listNode == null) {
            return list;
        }
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode q = new ListNode(2);
        listNode.next = q;
        ArrayList<Integer> res = printListFromTailToHead(listNode);
        for(Integer x:res){
            System.out.println("i:" + x);
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}