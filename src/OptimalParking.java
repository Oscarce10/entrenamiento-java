import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptimalParking {

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src/optimalParking.in"));
			String line = re.readLine();
			String ex1 = "^100$|^[1-9]\\d$|^[1-9]$";
			String ex2 = "^20$|^1[0-9]$|^[1-9]$";
			Pattern pt1 = Pattern.compile(ex1);
			Pattern pt2 = Pattern.compile(ex2);
			Matcher mt;

			mt = pt1.matcher(line);
			if (mt.matches()) {
				int cases = Integer.parseInt(line);
				for (int i = 0; i < cases; i++) {
					line = re.readLine();
					mt = pt2.matcher(line);
					if (mt.matches()) {
						line = re.readLine();
						String[] pos = line.split(" ");
						int[] posicion = new int[pos.length];
						for (int k = 0; k < pos.length; k++) {
							posicion[k] = Integer.parseInt(pos[k]);
						}
						Arrays.sort(posicion);
						int min = posicion[0];
						int max = posicion[posicion.length - 1];
						System.out.println((max - min) * 2);

					}

				}
			}
		} catch (IOException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
