package com.github.nguyenbuiUCSD.CTCI;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class StringUtil {
	
	/*
	 * function name: isUnique
	 * param:
	 * 		inString:	Input String
	 * 		return:		true/salse
	 * Usage: Check if a string have all unique characters
	 * Note: We can argue tht this is o(1) time. Space can be ruduced by using bit manipulation.
	 * 		Assume we have 256 characters
	 */
	public static boolean isUnique(String inString) {
		
		// Validation check
		if (inString==null) {
			return false;
		}
		
		if (inString.length()>256) {
			return false;
		}
		
		boolean frequenceTable[] = new boolean[256]; 
		
		for (int i = 0; i<inString.length();i++) {
			if (frequenceTable[inString.charAt(i)]) {
				return false;
			} else {
				frequenceTable[inString.charAt(i)] = true;
			}
		}
		
		return true;
	}
	
	/*
	 * function name: isPermutation
	 * param:
	 * 		inString1:	Input String
	 * 		inString2: 	Input String
	 * 		return:		true/salse
	 * Usage: Check if one is permutation of the orther
	 * Note: Assume we have 256 characters, space is significant, case sensitive. If not use sort algorithm
	 */
	public static boolean isPermutation(String inString1, String inString2) {
		
		// Validation check
		if (inString1==null||inString2==null) {
			return false;
		}
		
		if (inString1.length()!=inString2.length()) {
			return false;
		}
		
		int frequenceTable[] = new int[256]; 
		
		for (int i = 0; i<inString1.length();i++) {
			frequenceTable[inString1.charAt(i)]++;
		}
		
		for (int i = 0; i<inString1.length();i++) {
			frequenceTable[inString1.charAt(i)]--;
			if (frequenceTable[inString1.charAt(i)]<0) {
				return false;
			}
		}
		
		return true;
	}
	/*
	 * function name: urlify
	 * param:	
	 * 			inURL: in put string
	 * 			return: output string with all spaces replaced by '%20'
	 * Promt:	Write a method to replace all spaces in a string with '%20'.
	 * Note:	Assumptions: 
	 * 				the string has sufficient space at the end to hold the additional characters
	 * 				given the "true" length of the string (The string after spaces replaced)
	 * 			This method scan from right to left of the string to avoid using additional spaces.
	 * 			O(n) time, O(n) spaces. (If input is array of char then O(1) space)
	 */
	public static String urlify(String inString) {
		
		// Vars declaration
		String ret = "";
		
		for (int i=0; i<inString.length();i++) {
			char ch = inString.charAt(i);
			if (ch == ' ') {
				ret +="%20";
			} else {
				ret+=ch;
			}
		}
		
		return ret;
	}
	
	/*
	 * function name: urlify
	 * param:	
	 * 			inURL: in put string
	 * 			int trueSize: size of input URL
	 * 			return: output string with all spaces replaced by '%20'
	 * Promt:	Write a method to replace all spaces in a string with '%20'.
	 * Note:	Assumptions: 
	 * 				the string has sufficient space at the end to hold the additional characters
	 * 				given the "true" length of the string (The string before spaces replaced)
	 * 			This method scan from right to left of the string to avoid using additional spaces.
	 * 			O(n) time, O(n) spaces. (If input is array of char then O(1) space)
	 */
	public static boolean urlify(char[] inURL, int trueSize) {
		
		// Vars declaration
		int spaceCount=0;
		
		//Valid check
		if (inURL.length<trueSize) {
			return false;
		}
		
		// Count number of spaces
		for (int i=0;i<trueSize;i++) {
			if (inURL[i] == ' ') {
				spaceCount++;
			}
		}
		
		int index = trueSize + 2*spaceCount;
		
		for (int i = trueSize-1; i>=0; i--) {
			if (inURL[i]== ' ') {
				inURL[--index] = '0';
				inURL[--index] = '2';
				inURL[--index] = '%';
			} else {
				inURL[--index] = inURL[i];
			}
		}
		return true;
	}
	
	
	
}
