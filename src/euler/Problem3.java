package euler;

import java.util.ArrayList;

public class Problem3 {
	/* The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 * problem 3 */

	public static void main(String[] args) {
		long n = Long.parseLong("600851475143");
		//long n = 13195;
		int minD = 2;
		while(n % minD != 0) {
			minD++;
		}
			
		ArrayList<Long> divisors = new ArrayList<Long>();
		for (long i = minD; i <= n/minD; i++) {
			if(n % i == 0)
				divisors.add(i);
		}
		
		for (int i = divisors.size() - 1; i >= 0; i--) {
			boolean primo = true;
			for (int j = 2; j < Math.sqrt(divisors.get(i)); j++) {
				if(divisors.get(i) % j == 0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				System.out.println(divisors.get(i));
				System.exit(0);
			}
		}

	}

}
