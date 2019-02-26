package com.github.nguyenbuiUCSD.CTCI;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	
	
	public List<Integer> findAnagrams(String s, String p) {
	    
        List<Integer> returnList = new ArrayList<Integer>();
        if (s==null || p==null  || s.isEmpty() || p.isEmpty()){
        	return returnList;
        }
        
        int sLen = s.length();
        int pLen = p.length();
        
        char freqP[] = new char[256];
        char freqSW[] = new char[256];
        
        for (int i = 0; i<pLen;i++){
            (freqP[p.charAt(i)])++;
            (freqSW[s.charAt(i)])++;
        }
        
        for (int i=pLen; i<sLen;i++){
            if (compareFreq(freqP,freqSW)){
                returnList.add(i-pLen);
            }
            
            freqSW[s.charAt(i)]++;
            freqSW[s.charAt(i-pLen)]--; 
        }
        if (compareFreq(freqP,freqSW)){
            returnList.add(sLen-pLen);
        }
        
        return returnList;
        
    }
    
    private boolean compareFreq(char arr1[], char arr2[]){
        for (int i=0;i<256;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
