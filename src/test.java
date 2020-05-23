
public class test {

	public static void main(String[] args) {
		int sqsum = 0;
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			sqsum += i*i;
			sum += i;
		}
		System.out.println(sqsum - (sum*sum));
	}

}
