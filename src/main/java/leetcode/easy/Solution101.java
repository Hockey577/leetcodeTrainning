package leetcode.easy;

//递归实现
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        //如果根为空
        if (root == null) {
            return true;
        }
        return Symmetric(root.left, root.right);

    }

    private boolean Symmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return (left.val == right.val) && Symmetric(left.left, right.right) && Symmetric(left.right, right.left);
    }
}
