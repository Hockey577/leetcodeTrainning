package leetcode.easy;

import java.util.Stack;

//迭代实现
public class Solution101_Temp {
    public boolean isSymmetric(TreeNode root) {
        TreeNode left, right;
        if (root == null) {
            return true;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root.left);
        s.push(root.right);
        while (!s.empty()) {
            left = s.pop();
            right = s.pop();
            if (left == null && right == null)
                continue;
            if (left == null || right == null)
                return false;
            if (left.val != right.val)
                return false;
            s.push(left.left);
            s.push(right.right);
            s.push(left.right);
            s.push(right.left);
        }

        return true;
    }
}
