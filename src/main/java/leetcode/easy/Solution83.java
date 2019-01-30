package leetcode.easy;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode cur = head;
        ListNode q = head;
        while (q.next != null) {
            if (q.next.val != q.val) {
                head.next = q.next;
                q = q.next;
                head = head.next;
            } else {
                q = q.next;
                head.next = null;
            }
        }
        return cur;
    }
}
