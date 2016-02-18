import java.util.ArrayList;

/**
 * Project Euler Problem #3: Largest prime factor
 * Date: February 17th, 2016
 * Description: The prime factors of 13195 are 5, 7, 13, and 29
 * 				What is the largest prime factor of 600851475143?
 */

public class Problem3 {

	public static void main(String[] args) {
		
		long num = 600851475143L;
		long half = num/2;
		
		ArrayList<Long> primeNumbers = new ArrayList<Long>();
		primeNumbers.add(2L);
		
		for (long i = 2; i < half; i++)
		{
			Boolean isPrime = true;
			
			for (Long p : primeNumbers)
			{
				if (i % p == 0 && num % p == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime == true)
			{
				primeNumbers.add(i);
				System.out.println("Prime: " + i);
			}
		}
		System.out.print("The largest prime factor of " + num + " is: ");
		System.out.println(primeNumbers.get(primeNumbers.size()-1));
	}
}
