package com.github.nguyenbuiUCSD.CTCI;

public class Palindrome {
	public String findPalindrome(String inString) {
		
		//Variables declaration
		int start,end, maxLen; //Start, end and length of longest Palindrome
		int inStringLen;
		
		// Input validation
		if (inString.isEmpty()) {
			return "";
		}

		inStringLen = inString.length();
		maxLen = 1;
		start = 0;
		end = 0;
		
		// Check for Palindrome centered at i, start from second letter to last character 
		// Because for even length Palindrome, the center of off to the right [(i-1,i),(i-2,i+1),..]
		// ex: a-b-c-b-a
		//       ^
		//	     i
		for (int i=1;i<inStringLen;i++) {
			
			//  Local vars declaration;
			int subStart, subEnd, subMaxLen;
			subStart = i-1;
			subEnd = i;
			
			//Check for even length Palindrome
			while(subStart >= 0 && subEnd < inStringLen && inString.charAt(subStart)== inString.charAt(subEnd) ) {
				subMaxLen = subEnd - subStart + 1;
				if (subMaxLen > maxLen) {
					maxLen = subMaxLen;
					start = subStart;
					end = subEnd;
				}
				
				subStart--;
				subEnd++;
			}
			
			subStart = i-1;
			subEnd = i+1;
			//Check for odd length Palindrome
			while(subStart >= 0 && subEnd < inStringLen && inString.charAt(subStart)== inString.charAt(subEnd) ) {
				subMaxLen = subStart - subEnd + 1;
				if (subMaxLen > maxLen) {
					maxLen = subMaxLen;
					start = subStart;
					end = subEnd;
				}
				
				subStart--;
				subEnd++;
			}
			
			
		}
		
		return inString.substring(start, end+1);
	}
}
