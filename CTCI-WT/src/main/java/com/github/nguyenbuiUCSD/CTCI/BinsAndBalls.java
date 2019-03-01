package com.github.nguyenbuiUCSD.CTCI;

import java.util.Arrays;

public class BinsAndBalls {
	
	/*
	 * Function name: findWays
	 * Param:
	 * 		n:	number of balls
	 * 		m:	number of bins
	 * 		return: number of ways to put balls to bins
	 * Promt: 	Count the number of way to put n balls to m bins, ball are the same, bins are the same
	 * 			This can be understood as find the number of ways to find m number so that sum equal n
	 * 			ex: n = 5, m = 3 => (0,0,5), (0,1,4),... Note that (0,0,5) is the same as (0,5,0) and (5,0,0)
	 */
	public int findWays(int nBalls, int mBins) {
		return findWaysDP(nBalls, mBins);
	}
	
	/*
	 * Function name: findWays
	 * Param:
	 * 		n:	number of balls
	 * 		m:	number of bins
	 * 		return: number of ways to put balls to bins
	 * Promt: 	Count the number of way to put n balls to m bins, ball are the same, bins are the same
	 * 			This can be understood as find the number of ways to find m number so that sum equal n
	 * 			ex: n = 5, m = 3 => (0,0,5), (0,1,4),... Note that (0,0,5) is the same as (0,5,0) and (5,0,0)
	 */
	public int findWaysRecurSive(int nBalls, int mBins) {
		//Base cases
		if (nBalls <= 1) {
			return 1;
		}
		if (mBins < 1) {
			return 0;
		}
		if (mBins == 1) {
			return 1;
		}
		//If bins are more than balls, we can ignore  the empty bins
		if (nBalls<mBins) {
			return findWays(nBalls, nBalls);
		}
		//The number of ways is the total of number of ways when one bin is empty + the number
		//of ways when there is no empty bin (But one ball to each bin, (nBalls - mBins), then
		//randomly distribute the rest) 
		return findWays(nBalls, mBins-1) + findWays(nBalls-mBins, mBins);
	}
	
	/*
	 * Function name: findWays
	 * Param:
	 * 		n:	number of balls
	 * 		m:	number of bins
	 * 		return: number of ways to put balls to bins
	 * Promt: 	Count the number of way to put n balls to m bins, ball are the same, bins are the same
	 * 			This can be understood as find the number of ways to find m number so that sum equal n
	 * 			ex: n = 5, m = 3 => (0,0,5), (0,1,4),... Note that (0,0,5) is the same as (0,5,0) and (5,0,0)
	 */
	public int findWaysDP(int nBalls, int mBins) {
		//Base cases
		if (nBalls <= 1) {
			return 1;
		}
		if (mBins < 1) {
			return 0;
		}
		if (mBins == 1) {
			return 1;
		}
		//If bins are more than balls, we can ignore  the empty bins
		if (nBalls<mBins) {
			return findWays(nBalls, nBalls);
		}
		//The number of ways is the total of number of ways when one bin is empty + the number
		//of ways when there is no empty bin (But one ball to each bin, (nBalls - mBins), then
		//randomly distribute the rest)
		int memo[][] = new int[nBalls][nBalls];
		for (int[] row:memo) {
		 Arrays.fill(row, -1);		
		}

		return findWaysDP( nBalls,  mBins,  memo);
	}
	
	/*
	 * Function name: findWays
	 * Param:
	 * 		n:	number of balls
	 * 		m:	number of bins
	 * 		return: number of ways to put balls to bins
	 * Promt: 	Count the number of way to put n balls to m bins, ball are the same, bins are the same
	 * 			This can be understood as find the number of ways to find m number so that sum equal n
	 * 			ex: n = 5, m = 3 => (0,0,5), (0,1,4),... Note that (0,0,5) is the same as (0,5,0) and (5,0,0)
	 */
	public int findWaysDP(int nBalls, int mBins, int memo[][]) {
		//Base cases
		if (nBalls <= 1) {
			return 1;
		}
		if (mBins < 1) {
			return 0;
		}
		if (mBins == 1) {
			return 1;
		}
		
		//If bins are more than balls, we can ignore  the empty bins
		if (nBalls<mBins) {
			return findWays(nBalls, nBalls);
		}
		
		if (memo[nBalls-1][mBins-1]==-1) {
			memo[nBalls-1][mBins-1] = findWaysDP(nBalls, mBins-1,memo) + findWaysDP(nBalls-mBins, mBins,memo);
		}
		//The number of ways is the total of number of ways when one bin is empty + the number
		//of ways when there is no empty bin (But one ball to each bin, (nBalls - mBins), then
		//randomly distribute the rest) 
		return memo[nBalls-1][mBins-1];
	}
}
