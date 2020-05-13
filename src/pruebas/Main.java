package pruebas;

public class Main {
	public static void main(String[] args) {
		System.out.println(fact(4));
	}
	public static int fact(int n) {
		return (n <= 1) ? 1: n * fact (n-1) ;
	}

}


