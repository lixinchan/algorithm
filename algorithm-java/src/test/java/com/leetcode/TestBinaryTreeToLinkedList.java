package com.leetcode;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestBinaryTreeToLinkedList {

	@Test
	public void testTransfer() {
		TreeNode root = new TreeNode(1);
		root.setLeftNode(new TreeNode(2).setLeftNode(new TreeNode(4)).setRightNode(new TreeNode(5)));
		root.setRightNode(new TreeNode(3).setLeftNode(new TreeNode(6)).setRightNode(new TreeNode(7)));
		System.out.println(root);
		TreeNode tn = BinaryTreeToLinkedList.transfer(root);
		System.out.println(tn);
	}
}
