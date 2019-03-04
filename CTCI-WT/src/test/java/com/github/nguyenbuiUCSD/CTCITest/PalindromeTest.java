package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.github.nguyenbuiUCSD.CTCI.Palindrome;

@RunWith(Parameterized.class)
public class PalindromeTest {
	Palindrome palindrome = new Palindrome();

	private String input;
	private String expectedOutput;
 	
	public PalindromeTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions(){
		String expectedOutputs[][] = 
			{
					{"AA","AA"},
					{"abcHelloolleHcdg", "cHelloolleHc" },
					{"",""},
					{" "," "}
			};
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void findPalindromeTest1() {
		assertEquals(expectedOutput,  palindrome.findPalindrome(input));
	}

}
