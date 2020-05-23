import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rafting {
	// Entrenamiento 3

	public static void main(String[] args) {
		try {			
			//BufferedReader re = new BufferedReader(new FileReader("src\\rafting.in"));
			BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
			String line;
			String er1 = "^[1-9]*$";
			String er2 = "^([1-9]\\d*)\\s(1000|[1-9]\\d\\d|[1-9]\\d\\d|[1-9]\\d|[1-9])$";
			String er3;
			Pattern pt1 = Pattern.compile(er1);
			Pattern pt2 = Pattern.compile(er2);
			Pattern pt3;
			Matcher mt;
			while((line = re.readLine()) != null) {
				mt = pt1.matcher(line);
				if(mt.matches()) {
					int numCases = Integer.parseInt(line);
					a: for (int i = 0; i < numCases; i++) {
						line = re.readLine();
						mt = pt2.matcher(line);
						if(mt.matches()) {
							int numCli = Integer.parseInt(mt.group(1).replace(" ", ""));
							int pesoMax = Integer.parseInt(mt.group(2).replace(" ", ""));
							line = re.readLine();
							er3 = "^(?:(?:(?:1000|[1-9][0-9][0-9]|[1-9][0-9]|[1-9]) ){" + (numCli - 1) + "})(?:1000|[1-9][0-9][0-9]|[1-9][0-9]|[1-9])$";
							pt3 = Pattern.compile(er3);
							mt = pt3.matcher(line);
							if(mt.matches()) {
								String[] weigth = new String[numCli];
								weigth = line.split(" ");
								int sumPesos = 0;
								for (int j = 0; j < weigth.length; j++) {
									if (Integer.parseInt(weigth[j]) > pesoMax) {
										System.out.println("IMPOSSIBLE");
										continue a;
									}
									sumPesos += Integer.parseInt(weigth[j]);
									
								}
								if(numCli > 2) {
									for (int j = 2; j > 0 ; j++) {
										if(sumPesos / j < pesoMax) {
											System.out.println(j);
											break;
										}
											
									}
								}else {
									for (int j = 1; j > 0 ; j++) {
										if(sumPesos / j <= pesoMax) {
											System.out.println(j);
											break;
										}
											
									}
								}
								
								
							}
						}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
