package com.github.nguyenbuiUCSD.CTCI;

import java.util.HashSet;

public class SingleLinkedList {
	SLLNode start;
	private SLLNode end;
	public SingleLinkedList(char in){
		start = new SLLNode(in);
	}
	public SingleLinkedList(SLLNode in){
		start = in;
	}
	public SingleLinkedList(){
		start=end=null;
	}
	
	/*
	 * function name: reverseList
	 * param:
	 * 		startNode:	all Nodes after startNode will be reversed
	 * 		return:		startNode
	 * Usage: Reverse all nodes that is after one specific Node
	 */
	public SLLNode reverseList(SLLNode startNode){
		
		if (startNode == null){
			return start;
		}
		
		SLLNode newEnd = startNode.next;
		
		
		if (newEnd == null){
			return start;
		}
		
		SLLNode left,middle,right;
		left = newEnd;
		middle = left.next;
		
		while (middle!=null){
			right = middle.next;
			middle.next = left;
			left = middle;
			middle = right;
		}
		
		startNode.next = left;
		end = newEnd;
		end.next = null;
		
		return startNode;
	}
	
	/*
	 * function name: reverseList
	 * param:
	 * 		startNode:	all Nodes after startNode will be reversed
	 * 		return:		startNode
	 * Usage: Reverse n nodes that is after one specific Node
	 */
	public SLLNode reverseList(SLLNode startNode, int n){
		
		if (startNode == null){
			return start;
		}
		
		SLLNode newEnd = startNode.next;
		
		
		if (newEnd == null){
			return start;
		}
		
		SLLNode left,middle,right;
		left = newEnd;
		middle = left.next;
		
		while (middle!=null && n>1){
			right = middle.next;
			middle.next = left;
			left = middle;
			middle = right;
			n--;
		}
		
		if (middle==null){		
			startNode.next = left;
			end = newEnd;
			end.next = null;
		} else {
			startNode.next = left;
			newEnd.next = middle;
		}
		
		return startNode;
	}
	
	
	/*
	 * function name: reverseListInclusive
	 * param:
	 * 		startNode:	all Nodes after startNode will be reversed
	 * 		return:		the last node in group of nodes that get reverse
	 * Usage: Reverse n nodes that is after one specific Node.
	 * CAUTION: if startNode == null, this function will reverse from root
	 */
	public SLLNode reverseListInclusive(SLLNode startNode, int n){

		
		SLLNode newEnd;
		
		if (startNode == null){
			newEnd = start;
		} else {
			newEnd = startNode.next;
		}
		

		
		
		if (newEnd == null){
			return startNode;
		}
		
		SLLNode left,middle,right;
		left = newEnd;
		middle = left.next;
		
		while (middle!=null && n>1){
			right = middle.next;
			middle.next = left;
			left = middle;
			middle = right;
			n--;
		}
		
		// Connect the head of reverse nodes
		if (startNode==null){
			start = left;
		} else {
			startNode.next = left;
		}
		
		// Connect the tail of reverse nodes
		if (middle==null){
			end = newEnd;
			end.next = null;
		} else {
			newEnd.next = middle;
		}
		
		return newEnd;
	}
	
	
	/*
	 * function name: reverseEveryNNode
	 * param:
	 * 		n:	number node in sub group to be reverse
	 * 		return:		void
	 * Usage: Reverse every n nodes in the list
	 */
	public void reverseEveryNNode(int n){
		if (n==0){
			return;
		}
		SLLNode temp=reverseListInclusive(null,n);;
		while (temp!=null && temp.next!=null){
			temp = reverseListInclusive(temp,n);
		}
	}
	
	
	public SLLNode insertNode(char in){
		SLLNode newNode = new SLLNode(in);
		if (start==null){
			start=newNode;
			end = newNode;
		} else {
			end.next = newNode;
			end=newNode;
		}
		return start;
	}
	
	public void printList(){
		SLLNode temp = start;
		while (temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	

	
	public String toString(){
		SLLNode temp = start;
		String ret = "";
		while (temp!=null){
			ret+=temp.data;
			temp = temp.next;
		}
		return ret;
	}
	
	public SLLNode search(char in){
		SLLNode temp = start;
		while (temp!=null){
			if (temp.data==in){
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	/*
	 * function name: removeDuplicate
	 * param:
	 * 		return:		the last node in group of nodes that get reverse
	 * Usage: Remove all duplicate data in linked list
	 * Note: O(N) space and time. Use two pointer if want O(1) space, O(N^2) time
	 */
	public void removeDuplicate() {
		HashSet<Character> hashset = new HashSet<Character>();
		SLLNode current=start;
		
		if (current == null) {
			return;
		}
		
		hashset.add(current.data);
		
		while(current.next!=null) {
			if (hashset.contains(current.next.data)) {
				current.next=current.next.next;
			} else {
				hashset.add(current.next.data);
				current = current.next;
			}
		}
	}
	
	/*
	 * function name: removeMiddleNode
	 * param:
	 * 		thisNode: Node to be removed
	 * 		return:		true/false indicate successful/fail to remove Node
	 * Usage: Remove middle Node (Not the first or Last)
	 * Note: O(1) space and time. However, this does not work on the last node, and potentially introduce bug
	 * 		if the next node is using from other place
	 */
	public boolean removeNode(SLLNode thisNode) {
		if ((thisNode==start)||(thisNode==end)||thisNode==null||thisNode.next==null) {
			return false;
		}
		
		thisNode.data=thisNode.next.data;
		thisNode.next=thisNode.next.next;
		
		return true;
	}
	

	public SLLNode gethead() {
		return start;
	}
	
}
