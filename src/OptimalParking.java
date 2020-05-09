import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptimalParking {
	// Entrenamiento 2

	public static void main(String[] args) {
		BufferedReader re = null;
		try {
			int contLineas = 0;
			re = new BufferedReader(new FileReader("src/optimalParking.in"));
			String line = re.readLine();
			contLineas++;
			String ex1 = "^100$|^[1-9]\\d$|^[1-9]$";
			String ex2 = "^20$|^1[0-9]$|^[1-9]$";
			Pattern pt1 = Pattern.compile(ex1);
			Pattern pt2 = Pattern.compile(ex2);
			Pattern pt3;
			Matcher mt;
			mt = pt1.matcher(line);
			if (mt.matches()) {
				int cases = Integer.parseInt(line);				
				for (int i = 0; i < cases; i++) {
					line = re.readLine();
					contLineas++;
					mt = pt2.matcher(line);
					if (mt.matches()) {
						String ex3 = "^(?:\\d\\d?\\s[^\\n]){" + (Integer.parseInt(line) - 1) + "}\\d\\d?$";
						pt3 = Pattern.compile(ex3);						
						line = re.readLine();
						contLineas++;
						mt = pt3.matcher(line);
						if(mt.matches()) {
							String[] pos = line.split(" ");
							int[] posicion = new int[pos.length];
							for (int k = 0; k < pos.length; k++) {
								posicion[k] = Integer.parseInt(pos[k]);
							}
							Arrays.sort(posicion);
							int min = posicion[0];
							int max = posicion[posicion.length - 1];
							System.out.println((max - min) * 2);
						}else {
							throw new Exception("Error al leer linea " + contLineas++ + ".");
						}				

					}else {
						throw new Exception("Error al leer linea " + contLineas++ + ".");
					}					
				}
			}else {
				throw new Exception("Error al leer linea " + contLineas++ + ".");
			}
			
		} catch (IOException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
