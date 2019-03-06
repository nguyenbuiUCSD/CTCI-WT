package com.github.nguyenbuiUCSD.CTCI;

public class StringUtil {
	
	/*
	 * function name: isUnique
	 * param:
	 * 		in:	Input String
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
}
