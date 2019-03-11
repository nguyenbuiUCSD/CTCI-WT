package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.github.nguyenbuiUCSD.CTCI.StringUtil;


@RunWith(Parameterized.class)
public class URLifyTest {

	private String input,expectedOutput;
	
	@Parameters
	public static Collection<String[]> testConditions(){
		String expectedOutput[][] = {
				{"Nguyen Bui", "Nguyen%20Bui"},
				{"Hello world, I'm here to conquer","Hello%20world,%20I'm%20here%20to%20conquer"},
				{" ","%20"},
				{"",""}
		};
		return Arrays.asList(expectedOutput);
		
	}
	
	public URLifyTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Test
	public void test() {
		assertEquals(expectedOutput, StringUtil.urlify(input));;
	}

}
