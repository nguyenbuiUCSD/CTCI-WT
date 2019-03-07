package com.github.nguyenbuiUCSD.CTCI;

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
	
	
}
