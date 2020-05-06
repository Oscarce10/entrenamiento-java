package entrenamiento;

public class DFActoru {
	
	public static void main(String[] args) {
		System.out.println(fa(2));
	}
	
	public static int fa(int n) {
		return (n==1)?1: n * fa(n-1);
	}

}
