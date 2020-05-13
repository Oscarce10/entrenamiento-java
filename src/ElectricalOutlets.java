import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ElectricalOutlets {
	// Entrenamiento 2

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src/electricalOutlets.in"));
			int contLinea = 0;
			String line;
			String ex1 = "^(20|1[0-9]|[1-9])$";
			String ex2 = "^(10|[1-9])\\s.*";
			String er3 = "";
			Pattern pt1 = Pattern.compile(ex1);
			Pattern pt2 = Pattern.compile(ex2);
			Pattern pt3;
			Matcher mt;
			if ((line = re.readLine()) != null) {
				contLinea++;
				mt = pt1.matcher(line);
				if (mt.matches()) {
					int testCases = Integer.parseInt(line);

					for (int i = 0; i < testCases; i++) {
						if ((line = re.readLine()) != null) {
							contLinea++;
							mt = pt2.matcher(line);
							if (mt.matches()) {
								er3 = "^(?:((10)|([1-9])))\\s(?:((10)|([2-9]))\\s){"
										+ (Integer.parseInt(mt.group(1)) - 1) + "}(10|[2-9])$";
								pt3 = Pattern.compile(er3);
								mt = pt3.matcher(line);
								if (mt.matches()) {
									String[] snum = line.split(" ");
									int sum = 1;
									for (int j = 0; j < snum.length - 1; j++) {
										sum += Integer.parseInt(snum[j + 1]) - 1;
									}
									System.out.println(sum);

								} else {
									throw new Exception("Error en linea " + contLinea + ".");
								}
							} else {
								throw new Exception("Error en linea " + contLinea + ".");
							}
						} else {
							throw new Exception("Null pointer en linea " + contLinea + ".");
						}
					}

				} else {
					throw new Exception("Error en linea " + contLinea + ".");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
