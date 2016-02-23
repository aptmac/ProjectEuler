/**
 * Project Euler Problem #6: Sum square difference
 * Date: February 22nd, 2016
 * Description: The sum of the squares of the first ten natural numbers is 385. 1^2 + 2^2 + ...
 * 			    The square of the sum of the first ten natural numbers is 3025. (1 + 2 + ... )^2
 *              The sum of squared differnce would be 3025 - 385 = 2640
 *              Find the difference between the sum of squares and the square of the sum for the first 100 numbers
 */

public class Problem6 {

	private final static int NUM = 100;
	
	public static void main(String[] args) {
		System.out.println(SSD(NUM));
	}
	
	// Function to find the Sum square difference
	public static long SSD(int num) {
		long SumOfSquares = 0;
		long SquareOfSum = 0;
		
		// For the first hundred numbers ..
		for (int i = 1; i <= num; i++) {
			// Add the i^2 number to SumOfSquares
			SumOfSquares += Math.pow(i, 2);
			// Add the ith number ..
			SquareOfSum += i;
		}
		// and Square to get the Square of the Sum
		SquareOfSum = (int) Math.pow(SquareOfSum, 2);

		// Return the SSD
		return (SquareOfSum- SumOfSquares);
	}

}
