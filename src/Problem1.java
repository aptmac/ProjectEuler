/**
 * Project Euler Problem #1: Multiples of 3 and 5
 * Date: February 16th, 2016
 * Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9
 * 				The sum of these multiples is 23.
 * 				Find the sum of all the multiples of 3 or 5 below 1000
 * Idea: Recursively add the multiples of 3 and 5 to an int variable
 */

public class Problem1 {
	
	// Global variable to hold the recursively added sum
	public static int return_sum = 0;
	
	private static final int ONE_THOUSAND = 1000;
	
	public static void main(String[] args) {
		System.out.println(RecursiveSum(0, ONE_THOUSAND));
	}
	
	public static int RecursiveSum(int current, int end){
		// As long as the upper bound hasn't been passed ..
		if (current < end)
		{
			// Base Cases [0 - 2]
			if (current < 2)
			{
				//do nothing
			}
			// If the current number is a multiple of 3
			else if (current % 3 == 0)
			{
				return_sum = return_sum + current;
			}
			// If the current number is multiple of 5
			else if (current % 5 == 0)
			{
				return_sum = return_sum + current;
			}
			//Recurse, incresing the counter of the current number
			RecursiveSum(current+1, end);
		}
		return return_sum;
	}
}
