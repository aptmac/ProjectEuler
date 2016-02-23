import java.util.ArrayList;

/**
 * Project Euler Problem #5: Smallest Multiple
 * Date: February 19th, 2016
 * Description: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 				What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * Idea: Find the prime numbers from 1 - upper [20 in this case], and find increment a counter to find the smallest
 *       value divisible by all the primes.
 */

public class Problem5 {

	public static void main(String[] args) {
		System.out.println(SmallestMultiple(20));
	}

	public static int SmallestMultiple(int upper) {
		int solution = 0;
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		 		
 		for (int i = 2; i < upper; i++) {
 			Boolean isPrime = true;
 			
 			for (Integer p : primeNumbers) {
 				if (i % p == 0) {
 					isPrime = false;
 					break;
 				}
 			}
 			
 			if (isPrime == true) {
 				primeNumbers.add(i);
 			}
 		}
 		
 		int i = 0;
 		
 		while (solution <= upper) {
 			int j = 0;
 			for (Integer p: primeNumbers) {
 				System.out.println("is " + (i+upper) + " % " + p + " = " + ((i+upper)%p));
 				if ((i+upper) % p != 0) {
 					j++;
 					break;
 				}
 			}
 			if (j == 0) {
 				solution = i+upper;
 			}
 			i++;
 		}
		return solution;
	}
}
