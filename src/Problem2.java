import java.util.ArrayList;

/**
 * Project Euler Problem #2: Even Fibonacci numbers
 * Date: February 16th, 2016
 * Description: By considering the terms in the Fibonacci sequence whose values do not
 * 				exceed four million, find the usm of the even-valued terms
 * Idea: Use an ArrayList to hold the generated Fibonacci numbers for a better runtime
 * 		than a recursive method ... use a variable to hold the sum of even terms
 */

public class Problem2 {
	
	public static void main (String[] args) {
		// Declare an ArrayList to hold the fibonacci numbers
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		
		// Cover the base cases of the Fibonacci Sequence
		fibonacci.add(0);
		fibonacci.add(1);
		
		// Declare variables to check the status of the while loop
		boolean keepgoing = true;
		int i = 0;
		int j = 1;
		int evensum = 0;
		
		//Generate the Fibonacci Numbers & Calculate the Sum of even #s
		while (keepgoing) {
			
			// Calculate the Fibonacci number
			int fib = fibonacci.get(i) + fibonacci.get(j);
			
			// As long as the number preceeds 4 million ..
			if (fib < 4000000) {
				
				// Add the number to the ArrayList
				fibonacci.add(fib);
				
				// If the Fibonacci number is even, add to sum
				if (fib % 2 == 0) {
					evensum = evensum + fib;
				}
				
				// Increment the Fib counters
				i++;
				j++;
				
			} else { // If the number has exceeded 4 million, exit
				keepgoing = false;
			}
		}
		System.out.println("The sum of even fibonacci terms less than 4,000,000 is: " + evensum);
	}
}
