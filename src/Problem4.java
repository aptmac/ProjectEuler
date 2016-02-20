/**
 * Project Euler Problem #4: Largest Palindrome Product
 * Date: February 19th, 2016
 * Description: A palindromic number reads the same both ways.
 * 				The largest palindrome made from the product of two 2-digit numbers is 9009 = 91x99.
 * 				Find the largest palindrome made from the product of two 3-digit numbers
 * Idea: Take a greedy-type choice. Assume that the largest palindrome can be found by starting at 999
 *       and working backwards.
 *       Compare all product values of 999-2^n, where n is initially zero but increases every iteration
 *       of the loop where a palindrome isn't found.
 *       This way can exponentially increase the sample space to find the largest palindrome.
 *       For every product, convert to string and compare against it's reverse.
 */

public class Problem4 {

	private static final int MAX_NUMBER = 999;

	public static void main(String[] args) {
		System.out.println(LargestPalindromeProduct(MAX_NUMBER));
	}

	public static int LargestPalindromeProduct(int num) {
		
		int largestPalindrome = 0;
		int n = 0;
		int product;
		
		// Define String variables to check if the number is palindrome
		String upperString;
		String upperReverse;
		
		// Continue to loop if a palindrome isn't found ..
		while (largestPalindrome == 0) {
			for (int i = 0; i < Math.pow(2, n); i++) {
				for (int j = 0; j < Math.pow(2, n); j++) {
					product = (num-i) * (num-j);
					
					upperString = Integer.toString(product);
					upperReverse = new StringBuffer(upperString).reverse().toString();
					
					if (upperString.equals(upperReverse)) {
						if (largestPalindrome < product) {
							largestPalindrome = product;
						}
					}
				}
			}
			n++;
		}
		return largestPalindrome;
	}
}
