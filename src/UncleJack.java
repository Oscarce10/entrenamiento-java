

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UncleJack {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src\\txt\\uncleJack.txt"));
			String line;
			String er = "(1[0-9]|[0-9])\\s(2[0-5]|1[0-9]|[0-9])";
			Pattern pt = Pattern.compile(er);
			Matcher mt;
			boolean res;
			
			while(!(line = reader.readLine()).equals("0 0")) {
				mt = pt.matcher(line);
				res = mt.matches();
				if(res) {
					int d = Integer.parseInt(mt.group(2));
					
					BigInteger resultado = new BigInteger(mt.group(1));
					resultado = resultado.pow(d);

					System.out.println(resultado);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
