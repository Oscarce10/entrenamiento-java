package euler;

public class Divisores {

	public static void main(String[] args) {
		int n = 13195;
		for (int i = 2; i < n; i++) {
			if(n % i == 0)
				System.out.println(i);
		}

	}

}
