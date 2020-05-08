import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpeedLimit {
	// Entrenamiento 2

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/speedLimit.in"));
			String line;
			String ex1 = "\\d";
			String ex2 = "([0-8][0-9]|[0-9]) (1[0-2]|[0-9])";
			Pattern pt1 = Pattern.compile(ex1);
			Pattern pt2 = Pattern.compile(ex2);
			ArrayList<Integer> horas;
			ArrayList<Integer> mph;
			Matcher mt;
			while(!(line = reader.readLine()).equals("-1")) {				
				if(line.isBlank())
					line = reader.readLine();
				mt = pt1.matcher(line);
				horas = new ArrayList<Integer>();
				mph = new ArrayList<Integer>();
				if(mt.matches()) {
					int inputs = Integer.parseInt(mt.group());
					for(int i = 0; i < inputs; i++) {						
						line = reader.readLine();
						if(line.isBlank())
							line = reader.readLine();
						mt = pt2.matcher(line);
						if(mt.matches()) {
							mph.add(Integer.parseInt(mt.group(1)));
							horas.add(Integer.parseInt(mt.group(2)));
						}else {
							return;
						}
					}
					int res = 0;
					for (int i = 0; i < mph.size(); i++) {
						if(i == 0)
							res += mph.get(i) * horas.get(i);
						else
							res += mph.get(i) * (horas.get(i) - horas.get(i - 1));
					}
					System.out.println(res + " miles");
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
