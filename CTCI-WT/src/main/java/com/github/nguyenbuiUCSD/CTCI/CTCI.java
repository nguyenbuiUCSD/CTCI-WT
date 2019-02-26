package com.github.nguyenbuiUCSD.CTCI;

public class CTCI {
	public static void main(String args[]){
		System.out.println("Hello World");
//		testTreeConstruct();
//		testReverseLinkList();
//		testReverseEveryFewNodesLinkedList();
//		testBinsandBalls();
//		testAnagram();
		
	}
	
	public static void testTreeConstruct(){
		char inOrder[] = new char[] {'D', 'B', 'E', 'A', 'F', 'C'};
		char preOrder[] = new char[] {'A', 'B', 'D', 'E', 'C', 'F'};
		Tree tree = new Tree();
		tree.treeConstruct(inOrder, preOrder);
	}
	
	public static void testReverseLinkList(){
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		
		singleLinkedList.insertNode('A');
		singleLinkedList.insertNode('B');
		singleLinkedList.insertNode('C');
		singleLinkedList.insertNode('D');
		singleLinkedList.insertNode('E');
		singleLinkedList.insertNode('F');
		singleLinkedList.insertNode('G');
		singleLinkedList.insertNode('H');
		
		singleLinkedList.printList();
		singleLinkedList.reverseListInclusive(singleLinkedList.search('D'),6);
		singleLinkedList.printList();
	}
	
	public static void testReverseEveryFewNodesLinkedList(){
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		
		singleLinkedList.insertNode('A');
		singleLinkedList.insertNode('B');
		singleLinkedList.insertNode('C');
		singleLinkedList.insertNode('D');
		singleLinkedList.insertNode('E');
		singleLinkedList.insertNode('F');
		singleLinkedList.insertNode('G');
		singleLinkedList.insertNode('H');
		
		singleLinkedList.printList();
		SLLNode temp=singleLinkedList.reverseListInclusive(null,4);;
		while (temp!=null && temp.next!=null){
			temp = singleLinkedList.reverseListInclusive(temp,4);
		}
		
		singleLinkedList.printList();
	}
	
	public static void testAnagram(){
		Anagram anagram = new Anagram();
		System.out.println(anagram.findAnagrams("BACDGABCDA", "ABCD").toString());
	}
	
}
