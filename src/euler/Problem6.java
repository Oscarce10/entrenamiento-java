package euler;

public class Problem6 {
	
	/*The sum of the squares of the first ten natural numbers is,
	 * 1^2+2^2+...+10^2=385
	 * The square of the sum of the first ten natural numbers is,
	 * (1+2+...+10)^2=55^2=3025
	 * Hence the difference between the sum of the squares of the first ten natural 
	 * numbers and the square of the sum is 3025−385=2640.
	 * 
	 * Find the difference between the sum of the squares of the first one hundred 
	 * natural numbers and the square of the sum.
	 * Problem 6
	 */
	
	/* Source: https://www.youtube.com/watch?v=OpA7oNmHobM */

	public static void main(String[] args) {
		int n = 100;
		int sumSq = (n * (n + 1) * (2 * n + 1 ))/6;
		int sqSum = (int) Math.pow((n * (n + 1)/ 2), 2);
		System.out.println(sqSum - sumSq);

	}

}
