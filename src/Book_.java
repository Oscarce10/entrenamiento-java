import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Book_ {

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src/book.in"));
			String line;

			int cases = 0;
			while (!(line = re.readLine()).equals("0")) {
				int[] nums = new int[10];
				String[] x = line.split(" ");
				int inicio = (Integer.parseInt(x[0]) < Integer.parseInt(x[1])) ? Integer.parseInt(x[0])
						: Integer.parseInt(x[1]);
				int end = (Integer.parseInt(x[0]) > Integer.parseInt(x[1])) ? Integer.parseInt(x[0])
						: Integer.parseInt(x[1]);
				for (int i = inicio; i <= end; i++) {
					String n = Integer.toString(i);
					for (int j = 0; j < n.length(); j++) {
						nums[((int) (n.charAt(j)) - 48)]++;
					}
				}
				System.out.print("Case " + ++cases + ": ");
				for (int i = 0; i < nums.length; i++) {
					System.out.print(i + ":" + nums[i] + " ");
				}
				System.out.println();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
