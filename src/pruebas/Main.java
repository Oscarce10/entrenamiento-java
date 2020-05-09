package pruebas;

public class Main {
	public static void main(String[] args) {
		String x = "A BCDEFGHIJKLMNOPQRS";
		for (int i = 0; i < x.length(); i++) {
			System.out.println((int) x.charAt(i) - 64);
		}
	}

}
