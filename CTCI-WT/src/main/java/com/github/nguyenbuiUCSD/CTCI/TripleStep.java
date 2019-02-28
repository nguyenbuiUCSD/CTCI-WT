package com.github.nguyenbuiUCSD.CTCI;

public class TripleStep {
	
	
	/*
	 * Function name: findTripleStep
	 * param:
	 * 		return: The number of possible ways to run up stairs
	 * Promt: A child is running up a staircase with n steps and can hop either 1 step, 2 steps,
	 * or 3 steps at a time. Implement a method to count how many possible ways the child can run
	 * up the stairs.
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
		if (n < 0) {
			return 0;
		}
		
		if (n==0) {
			return 1;
		}

		return findTripleStepRecursive(n-1)+findTripleStepRecursive(n-2)+findTripleStepRecursive(n-3);
	}
}
