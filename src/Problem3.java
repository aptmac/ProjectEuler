/** 
 * Project Euler Problem #3: Largest prime factor
 * Date: February 17th, 2016
 * Description: The prime factors of 13195 are 5, 7, 13, and 29
 * 				What is the largest prime factor of 600851475143?
 * Idea: Continuously divide the number by incrementing values until
 * 		 we arrive at the largest prime factor
 */

public class Problem3 {

	public static void main(String[] args) {
		
		// Define variable to hold the number of interest
		long num = 600851475143L;
		
		// Print the result to console
		System.out.println(getLargestFactor(num));
	}
	
	public static long getLargestFactor(long num) {
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
			{
				num = num/i;
			}
		}
		return num;
	}
}
