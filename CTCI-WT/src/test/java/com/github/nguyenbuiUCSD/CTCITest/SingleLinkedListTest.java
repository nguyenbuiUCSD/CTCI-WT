package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.SLLNode;
import com.github.nguyenbuiUCSD.CTCI.SingleLinkedList;

public class SingleLinkedListTest {

	SingleLinkedList singleLinkedList = new SingleLinkedList(){{
		insertNode('A');
		insertNode('B');
		insertNode('C');
		insertNode('D');
		insertNode('E');
		insertNode('F');
		insertNode('G');
		insertNode('H');
	}};
	
	@Test
	public void testReverseListInclusive1() {
		SLLNode retNode = singleLinkedList.reverseListInclusive(singleLinkedList.search('D'),2);
		assertEquals(singleLinkedList.toString(), "ABCDFEGH");
		assertEquals(retNode, singleLinkedList.search('E') );
	}
	
	@Test
	public void testReverseList1() {
		SLLNode retNode = singleLinkedList.reverseList(singleLinkedList.search('D'),2);
		assertEquals(singleLinkedList.toString(), "ABCDFEGH");
		assertEquals(retNode, singleLinkedList.search('D') );
	}
	
	@Test
	public void testReverseEveryNNode1() {
		singleLinkedList.reverseEveryNNode(1);
		assertEquals("ABCDEFGH", singleLinkedList.toString());
	}
	
	@Test
	public void testReverseEveryNNode2() {
		singleLinkedList.reverseEveryNNode(2);
		assertEquals("BADCFEHG", singleLinkedList.toString());
	}
	
	@Test
	public void testReverseEveryNNode3() {
		singleLinkedList.reverseEveryNNode(3);
		assertEquals("CBAFEDHG", singleLinkedList.toString());
	}
	

	
	@Test
	public void testReverseEveryNNode4() {
		singleLinkedList.reverseEveryNNode(4);
		assertEquals("DCBAHGFE", singleLinkedList.toString());
	}
	
	@Test
	public void testReverseEveryNNode5() {
		singleLinkedList.reverseEveryNNode(0);
		assertEquals("ABCDEFGH", singleLinkedList.toString());
	}
	
	@Test
	public void testReverseEveryNNode6() {
		singleLinkedList.reverseEveryNNode(10);
		assertEquals("HGFEDCBA", singleLinkedList.toString());
	}
	
	

}