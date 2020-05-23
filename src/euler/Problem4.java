package euler;

import java.util.ArrayList;

public class Problem4 {
	/* A palindromic number reads the same both ways. The largest palindrome made 
	 * from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * problem 4*/
	
	static class Palindrome{
		public int i;
		public int j;
		public int num;
		public Palindrome(int i, int j, int num) {
			super();
			this.i = i;
			this.j = j;
			this.num = num;
		}
		@Override
		public String toString() {
			return "Palindrome [i=" + i + ", j=" + j + ", num=" + num + "]";
		}
		
		
				
	}

	public static void main(String[] args) {
		int mult = 0;
		ArrayList<Palindrome> pal = new ArrayList<Palindrome>();
		
		for (int i = 999; i >=100; i--) {
			for (int j = 999; j >= 100; j--) {
				mult = i * j;
				String multS = mult + "";
				String revS = "";
				for (int k = multS.length() - 1; k >= 0; k--) {
					revS += multS.charAt(k);
				}
				int revMult = Integer.parseInt(revS);
				if(mult - revMult == 0) {
					Palindrome obP = new Palindrome(i, j, mult);
					pal.add(obP);
				}
			}
		}
		int max = 0;
		int index = 0; 
		for (int i = 0; i < pal.size(); i++) {
			if(pal.get(i).num > max) {
				max = pal.get(i).num;
				index = i;
			}
				
		}
		System.out.println(pal.get(index).toString());

	}

}
