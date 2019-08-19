package com.wkw.leetcode;

import javax.swing.tree.TreeNode;

public class LeetCode101 {

	public static boolean isSymmetric(TreeNode root) {
	    
		if ( root == null)  {
			return true;
		}
		
		isSym(root.left, root.right);
		
		return false;
    }
	public static boolean isSym(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null  || right == null) {
			return false;
		}
		return left.val == right.val && isSym(left.left, right.right) && isSym(left.right, right.left);
	}
	
	public static void main(String[] args) {
		
	}
}
