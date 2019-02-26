package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.Anagram;

public class AnagramTest {
	
	Anagram anagram = new Anagram();
	
	@Test
	public void testFindAnagrams1() {
		assertEquals(anagram.findAnagrams("BACDGABCDA", "ABCD"), Arrays.asList(0,5,6));
	}
	
	@Test
	public void testFindAnagrams2() {
		assertEquals(anagram.findAnagrams("BACDGABCDA", ""), Arrays.asList());
	}
	
	@Test
	public void testFindAnagrams3() {
		assertEquals(anagram.findAnagrams("AAAAAA", "A"), Arrays.asList(0,1,2,3,4,5));
	}

}
