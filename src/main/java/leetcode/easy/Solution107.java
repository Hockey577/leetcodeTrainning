package leetcode.easy;

import java.util.*;

//二叉树的层序遍历
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<TreeNode> list = new LinkedList<TreeNode>();
        if (root == null){
            return null;
        }
        list.add(root);
        while (!list.isEmpty()){
            List<Integer> curList = new ArrayList<Integer>();
            List<TreeNode> nextList = new ArrayList<TreeNode>();
            for (TreeNode i:list){
                curList.add(i.val);
                if (i.left!=null)
                    nextList.add(i.left);
                if (i.right!=null)
                    nextList.add(i.right);
            }
            res.add(curList);
            list = nextList;
        }
        Collections.reverse(res);
        return res;
    }
}
