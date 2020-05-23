package euler;

public class Problem5 {
	/* 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of 
	 * the numbers from 1 to 20?
	 * problem 5*/

	public static void main(String[] args) {
		int num = 2;
		boolean check = false;
		
		while (!check) {
			check = true;
			for (int i = 2; i <= 20 ; i++) {
				if(num % i != 0) {
					check = false;
					break;
				}
					
			}
			if(check) {
				System.out.println(num);
				System.exit(0);
			}
			num++;			
		}

	}

}
