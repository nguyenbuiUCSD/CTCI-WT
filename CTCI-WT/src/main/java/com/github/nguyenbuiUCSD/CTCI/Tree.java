package com.github.nguyenbuiUCSD.CTCI;


public class Tree {
	TreeNode root;
	static int rootIndex = 0;
	
	public Tree (TreeNode in){
		root = in;
	}
	public Tree (){
		root = null;
	}
	
	public String toStringInorder(){
		return toStringInorder(root);
	}
	
	public String toStringPreorder(){
		return toStringPreorder(root);
	}
	
	/*
	 * function name: treeConstruct
	 * param:
	 * 		char inOrder[]
	 * 		char preOrder[]
	 * 		return: void
	 * Usage: 	reconstruct tree from in-order and pre-order traverses
	 * Note:	This function does not do any validation check on
	 * 			invalid input
	 */
	public void treeConstruct(char inOrder[], char preOrder[]){
		int numberOfNodes = inOrder.length-1;
		root = treeConstruction(inOrder,preOrder,0,numberOfNodes);
	}
	
	private TreeNode treeConstruction (char inOrder[], char preOrder[], int start, int end){

		if (start>end){
			return null;
		}
		TreeNode root = new TreeNode (preOrder[rootIndex]);	
		rootIndex++;
		
		if (start==end){
			return root;
		}
		
		int rootIndexInInorderTraverse = searchForRootInInorderTraverse(inOrder,root.data);
		root.left = treeConstruction(inOrder,preOrder,start,rootIndexInInorderTraverse-1);
		root.right = treeConstruction(inOrder,preOrder,rootIndexInInorderTraverse+1,end);
		
		return root;
	}
	
	private int searchForRootInInorderTraverse(char inOrder[],char item){
		for (int i=0; i<inOrder.length;i++){
			if (inOrder[i]==item){
				return i;
			}
		}
		return -1;
	}
	
	
	
	private String toStringInorder(TreeNode root){
		if (root == null) {
			return "";
		}
		return toStringInorder(root.left) + root.data + toStringInorder(root.right);
	}
	
	private String toStringPreorder(TreeNode root){
		if (root == null) {
			return "";
		}
		return root.data + toStringPreorder(root.left) + toStringPreorder(root.right);
	}
}
