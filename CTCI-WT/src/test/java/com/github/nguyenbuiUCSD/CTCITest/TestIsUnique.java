package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.StringUtil;

public class TestIsUnique {

	@Test
	public void isUniqueTest1() {
		String unique = "ABCDE";
		assertEquals(true, StringUtil.isUnique(unique));
		
	}
	
	@Test
	public void isUniqueTest2() {
		String notunique = "ABCDEDCBA";
		assertEquals(false, StringUtil.isUnique(notunique));
		
	}
	
	@Test
	public void isUniqueTest3() {
		String empty = "";
		assertEquals(true, StringUtil.isUnique(empty));
		
	}

}
