import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Project Euler Problem #8: Largest product in a series
 * Date: February 22nd, 2016
 * Description: The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * 				Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. 
 * 				What is the value of this product?
 * Idea: Read in the number through a text file as a string. Use substring to scan every thirteen digits. Convert the
 * 		 substring to an integer and use charAt() to create a running product for the number.
 */

public class Problem8 {

	private static Long largestProduct = 0L;
	
	public static void main(String[] args) throws FileNotFoundException {
		// Open the 1000-digit number through a textfile & store in num
		Scanner sc = new Scanner(new FileReader("src/Problem8Number.txt"));
		String num = "";
		while(sc.hasNext()) {
			num += sc.next();
		}
		sc.close();
		
		// Use a length() just incase user wants to use a different sized number
		int numLength = num.length();
		
		for (int i = 0; i < numLength - 12; i++) {
			// Take the 13 digit substring
			String tempString = num.substring(i, i+13);
			
			// runningProduct holds the product of the 13-digit temp
			Long runningProduct = 1L;
			for (int j = 0; j < 13; j++) {
				int x = Character.digit(tempString.charAt(j), 10);
				runningProduct *= x;
				
				// If a zero is found, the product will be zero - so break to save time
				if (x == 0)
				{
					break;
				}
			}
			
			// If the new product is larger than the current largest, pass it the value
			if (runningProduct > largestProduct) {
				largestProduct = runningProduct;
			}
		}
		System.out.println("Largest product: " + largestProduct);
	}
}
