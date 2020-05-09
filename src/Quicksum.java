import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quicksum {

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src/quicksum.in"));
			String line;
			String er = "^([A-Z][A-Z\\s]{1,253}[A-Z])$";
			Pattern pt = Pattern.compile(er);
			Matcher mt;
			while((line = re.readLine()) != null) {
				if(line.equals("#"))
					return;
				mt = pt.matcher(line);
				if(mt.matches()) {
					int sum = 0;
					for(int i = 0; i < line.length(); i++) {
						sum += (line.charAt(i) != ' ')?(i + 1) * ((int) (line.charAt(i)) - 64):0;
					}
					System.out.println(sum);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
