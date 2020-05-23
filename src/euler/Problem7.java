package euler;

public class Problem7 {
	/*
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
	 * we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 * 
	 * Problem 7
	 */

	public static void main(String[] args) {
		int [] prime = new int [10001];
		int i = 3;
		int c = 0;
		prime[c] = 2;
		boolean primo = true;
		while(c != 10000) {
			primo = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				c++;
				prime[c] = i;
			}
			i++;
			
		}
		System.out.println(prime[10000]);
		

	}

}
