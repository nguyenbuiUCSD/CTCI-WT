package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.SingleLinkedList;
import com.github.nguyenbuiUCSD.CTCI.MergeList;

public class SingleLinkedListTestMergeList {

	@Test
	public void test() {
		SingleLinkedList singleLinkedList1 = new SingleLinkedList() {{
			insertNode('A');
			insertNode('C');
			insertNode('E');
			insertNode('G');
		}};
		SingleLinkedList singleLinkedList2 = new SingleLinkedList() {{
			insertNode('B');
			insertNode('D');
			insertNode('F');
			insertNode('H');
		}};
		
		MergeList mergeList = new MergeList();
		SingleLinkedList singleLinkedList3 = new SingleLinkedList(mergeList.mergeTwoList(
						singleLinkedList1.gethead(), singleLinkedList2.gethead()));
		assertEquals("ABCDEFGH", singleLinkedList3.toString());
	}
	
	@Test
	public void test2() {
		SingleLinkedList singleLinkedList1 = new SingleLinkedList() {{
			insertNode('A');
		}};
		SingleLinkedList singleLinkedList2 = new SingleLinkedList();
		
		MergeList mergeList = new MergeList();
		SingleLinkedList singleLinkedList3 = new SingleLinkedList(mergeList.mergeTwoList(
						singleLinkedList1.gethead(), singleLinkedList2.gethead()));
		assertEquals("A", singleLinkedList3.toString());
	}
	
	@Test
	public void test3() {
		SingleLinkedList singleLinkedList1 = new SingleLinkedList();
		SingleLinkedList singleLinkedList2 = new SingleLinkedList();
		
		MergeList mergeList = new MergeList();
		SingleLinkedList singleLinkedList3 = new SingleLinkedList(mergeList.mergeTwoList(
						singleLinkedList1.gethead(), singleLinkedList2.gethead()));
		assertEquals("", singleLinkedList3.toString());
	}
	
	@Test
	public void test4() {
		SingleLinkedList singleLinkedList1 = new SingleLinkedList();
		SingleLinkedList singleLinkedList2 = new SingleLinkedList() {{
			insertNode('A');
		}};

		
		MergeList mergeList = new MergeList();
		SingleLinkedList singleLinkedList3 = new SingleLinkedList(mergeList.mergeTwoList(
						singleLinkedList1.gethead(), singleLinkedList2.gethead()));
		assertEquals("A", singleLinkedList3.toString());
	}

}
