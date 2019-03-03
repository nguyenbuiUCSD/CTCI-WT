package com.github.nguyenbuiUCSD.CTCI;

public class MergeList {
	/*
	 * function name: mergeTwoList
	 * param:
	 * 		list1: first list
	 * 		list2: second list
	 * 		return:		new merged List
	 * Usage: Merge two sorted list
	 * Note: O(n+m) space and time if using recursion. O(1) space if use non recursive solution
	 */
	public SLLNode mergeTwoList(SLLNode l1, SLLNode l2) {
		return mergeTwoListNonRecursive(l1,l2);
	}
	
	/*
	 * function name: mergeTwoList
	 * param:
	 * 		list1: first list
	 * 		list2: second list
	 * 		return:		new merged List
	 * Usage: Merge two sorted list
	 * Note: O(n+m) space and time if using recursion
	 */
	private SLLNode mergeTwoListRecursive(SLLNode l1, SLLNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        
        if (l1.data<l2.data){
            l1.next = mergeTwoListRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next=mergeTwoListRecursive(l1, l2.next);
            return l2;
        }
	}
        
    	/*
    	 * function name: mergeTwoList
    	 * param:
    	 * 		list1: first list
    	 * 		list2: second list
    	 * 		return:		new merged List
    	 * Usage: Merge two sorted list
    	 * Note: O(n+m) space and time if using recursion
    	 */
	private SLLNode mergeTwoListNonRecursive(SLLNode l1, SLLNode l2) {
        SLLNode current = new SLLNode('Z');
        SLLNode ret = current;
        
        while(l1!=null&&l2!=null) {
        	if (l1.data<l2.data) {
        		current.next = l1;
        		l1=l1.next;
        	} else {
        		current.next=l2;
        		l2=l2.next;
        	}
        	current=current.next;
        }
        
        if (l1==null) {
        	current.next=l2;
        } else {
        	current.next=l1;
        }
        
        return ret.next;
	}
}
