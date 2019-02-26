package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.Anagram;

public class AnagramTest {
	
	Anagram anagram = new Anagram();
	
	@Test
	public void testFindAnagrams1() {
		assertEquals(Arrays.asList(0,5,6), anagram.findAnagrams("BACDGABCDA", "ABCD"));
	}
	
	@Test
	public void testFindAnagrams2() {
		assertEquals(Arrays.asList(), anagram.findAnagrams("BACDGABCDA", ""));
	}
	
	@Test
	public void testFindAnagrams3() {
		assertEquals(Arrays.asList(0,1,2,3,4,5), anagram.findAnagrams("AAAAAA", "A"));
	}

}
