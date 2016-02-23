import java.util.ArrayList;

/**
 * Project Euler Problem #7: 10001st Prime
 * Date: February 22nd, 2016
 * Description: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see the 6th prime is 13.
 * 				What is the 10,001st prime number?
 * Idea: Generate prime numbers and toss them into an ArrayList. Generate up to the Xth number, and then return
 * 		 the Xth index of the ArrayList.
 */

public class Problem7 {

	// Set the Xth Prime Number to find
	private final static int num = 10001;
	
	public static void main(String[] args) {

		System.out.println("Prime number #" + num + ": " + FindPrime(num));
	}
	
	// Function that finds the Xth Prime Number
	public static int FindPrime(int num) {
		// Define and intialize ArrayList, with the base case
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		
		// isFound will control the loop
		boolean isFound = false;
		
		// i increase from 2 until the Xth Prime Number
		int i = 2;
		
		// j keeps track of the number of primes already found
		int j = 0;
 		
		// While the Xth Prime isn't found ..
		while(isFound == false) {
 			System.out.print("Is " + i + " a prime number?: ");
 			Boolean isPrime = true;
 			
 			// Break if the number is not a prime
 			for (Integer p : primeNumbers) {
 				if (i % p == 0) {
 					System.out.println("No, it is not.");
 					isPrime = false;
 					break;
 				}
 			}
 			
 			// If the number survives the above loop, it's a prime
 			if (isPrime == true) {
 				primeNumbers.add(i);
 				j++;
 				if (j == num) {
 					System.out.println("Yes, it is.");
 					isFound = true;
 				}
 			}
 			i++;
 		}
 		return primeNumbers.get(num-1);
	}
}
