package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.StringUtil;

public class IsPermutationTest {

	@Test
	public void IsPermutationTest1() {
		assertEquals(true, StringUtil.isPermutation("", ""));
	}
	
	@Test
	public void IsPermutationTest2() {
		assertEquals(true, StringUtil.isPermutation("ABCD", "DBCA"));
	}
	
	@Test
	public void teIsPermutationTest3st() {
		assertEquals(true, StringUtil.isPermutation("ASDFGHJKL", "JHGFALKSD"));
	}
	
	@Test
	public void IsPermutationTest4() {
		assertEquals(false, StringUtil.isPermutation("", "ABC"));
	}
	
	@Test
	public void IsPermutationTest5() {
		assertEquals(false, StringUtil.isPermutation("ABC", ""));
	}
	
	

}
