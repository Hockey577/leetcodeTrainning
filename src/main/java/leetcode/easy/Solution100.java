package leetcode.easy;

public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //如果两棵树都为空，则相同
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
