package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.TripleStep;

public class findTripleStepTest {

	@Test
	public void findTripleStepTest1() {
		assertEquals(1,(new TripleStep()).findTripleStep(0));
	}
	
	@Test
	public void findTripleStepTest2() {
		assertEquals(1,(new TripleStep()).findTripleStep(1));
	}
	
	@Test
	public void findTripleStepTest3() {
		assertEquals(2,(new TripleStep()).findTripleStep(2));
	}
	
	@Test
	public void findTripleStepTest4() {
		assertEquals(4,(new TripleStep()).findTripleStep(3));
	}
	
	@Test
	public void findTripleStepTest5() {
		assertEquals(1,(new TripleStep()).findTripleStep(0));
	}

}
