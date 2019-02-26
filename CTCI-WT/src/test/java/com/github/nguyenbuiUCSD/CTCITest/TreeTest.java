package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.Tree;

public class TreeTest {

	@Test
	public void treeConstructTest() {
		char inOrder[] = new char[] {'D', 'B', 'E', 'A', 'F', 'C'};
		char preOrder[] = new char[] {'A', 'B', 'D', 'E', 'C', 'F'};
		Tree tree = new Tree();
		tree.treeConstruct(inOrder, preOrder);
		assertEquals("DBEAFC", tree.toStringInorder());
		assertEquals("ABDECF", tree.toStringPreorder());
	}

}
