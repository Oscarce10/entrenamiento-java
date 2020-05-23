import java.math.BigInteger;

public class Fibonacci {
	// Project euler
	public static void main(String[] args) {
		BigInteger n1, n2, n3, sum;
		n1 = new BigInteger("0");
		n2 = new BigInteger("0");
		n3 = new BigInteger("0");
		sum = new BigInteger("0");
		for (int i = 1; i < 400; i++) {
			
			if(i == 1)
				n1 = n1.add(BigInteger.valueOf(1));
			else if(i == 2) {
				n2 = n2.add(BigInteger.valueOf(2));
				sum = sum.add(n2);
			}
			else {				
				
				if(n3.longValue() % 2 == 0)
					sum = sum.add(n3);
				n1 = new BigInteger(n2.toString());
				n2 = new BigInteger(n3.toString());
			}
			n3 = new BigInteger(n1.toString()).add(n2);
			System.out.println(sum);
		}
		System.out.println(sum);
		
		
	}
	

}
