package com.github.nguyenbuiUCSD.CTCI;

public class TripleStep {
	
	
	/*
	 * Function name: findTripleStep
	 * param:
	 * 		return: The number of possible ways to run up stairs
	 * Promt: A child is running up a staircase with n steps and can hop either 1 step, 2 steps,
	 * or 3 steps at a time. Implement a method to count how many possible ways the child can run
	 * up the stairs.
	 * Note: Assume findTripleStep(0) = 1. It's a lot easier if we define findTripleStep(0) = 0, this case
	 * 		we need 2 base cases:
	 * 				if (n < 0) return 0;
	 * 				if (n==0) return 1;
	 */
	public int findTripleStep(int n) {
		return findTripleStepRecursive(n);
	}
	
	/*
	 * Function name: findTripleStep
	 * param:
	 * 		return: The number of possible ways to run up stairs
	 * Promt: A child is running up a staircase with n steps and can hop either 1 step, 2 steps,
	 * or 3 steps at a time. Implement a method to count how many possible ways the child can run
	 * up the stairs.
	 */
	public int findTripleStepRecursive(int n) {
		if (n < 1) {
			return 0;
		}
		
		if (n==1) {
			return 1;
		}
		
		if (n==2) {
			return 2;
		}

		if (n==3) {
			return 4;
		}
		
		return findTripleStepRecursive(n-1)+findTripleStepRecursive(n-2)+findTripleStepRecursive(n-3);
	}
}
