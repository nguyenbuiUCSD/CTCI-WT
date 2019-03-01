package com.github.nguyenbuiUCSD.CTCITest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.github.nguyenbuiUCSD.CTCI.BinsAndBalls;

public class BinsAndBallsTest {

	BinsAndBalls bnb = new BinsAndBalls();
	
	@Test
	public void findWaysTest1() {
		assertEquals(1, bnb.findWays(0, 0));
	}
	
	@Test
	public void findWaysTest2() {
		assertEquals(1, bnb.findWays(0, 10));
	}
	
	@Test
	public void findWaysTest3() {
		assertEquals(1, bnb.findWays(1, 10));
	}
	
	@Test
	public void findWaysTest4() {
		assertEquals(2, bnb.findWays(2, 2));
	}
	
	@Test
	public void findWaysTest5() {
		// Run 100 times
		for (int times = 0;times<10;times++) {
			Random random = new Random();
			List<int[]> list = new ArrayList<int[]>();
	        int balls = random.nextInt(100);
			int arr[]= {0,0,0};
			int numOfWays=1;
        	for (int j=0;j<balls;j++)
        		for (int k=0;k<balls;k++)
        			for (int l=0;l<balls;l++){
        				if (j+k+l==balls) {
        					arr[0] = j;
        					arr[1] = k;
        					arr[2] = l;
        				
        					Arrays.sort(arr);
        					
        					boolean duplicate = false;
        					for (int[] it: list) {
        						if (Arrays.equals(it,arr)) {
        							duplicate = true;
        							break;
        						}
        					}
        				
        					if (duplicate==false) {
        						numOfWays++;
        						list.add(new int[]{arr[0],arr[1],arr[2]}); 
        					}
        		}
	        }
			
			assertEquals(numOfWays, bnb.findWays(balls, 3));
			System.out.println(numOfWays);
		}

	}
	
	@Test
	public void findWaysTest6() {
		// Run 100 times
		for (int times = 0;times<10;times++) {
			Random random = new Random();
			List<int[]> list = new ArrayList<int[]>();
	        int balls = random.nextInt(100);
			int arr[]= {0,0,0,0};
			int numOfWays=1;
	        
	        for (int i = 0; i<balls;i++)
	        	for (int j=0;j<balls;j++)
	        		for (int k=0;k<balls;k++)
	        			for (int l=0;l<balls;l++){
	        				if (i+j+k+l==balls) {
	        					arr[0] = i;
	        					arr[1] = j;
	        					arr[2] = k;
	        					arr[3] = l;
	        				
	        					Arrays.sort(arr);
	        					
	        					boolean duplicate = false;
	        					for (int[] it: list) {
	        						if (Arrays.equals(it,arr)) {
	        							duplicate = true;
	        							break;
	        						}
	        					}
	        				
	        					if (duplicate==false) {
	        						numOfWays++;
	        						list.add(new int[]{arr[0],arr[1],arr[2],arr[3]}); 
	        					}
	        				}
	        }
			
			assertEquals(numOfWays, bnb.findWays(balls, 4));
			System.out.println(numOfWays);
		}

	}
	
	

}
