import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Factorial {
	public static void main(String[] args) {
		// By default, this will use a buffer of 8 KB.
		//  if we want to buffer smaller or larger blocks, we can use the BufferedReader(Reader, int) constructor:
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src\\txt\\factorial.txt"));			
			String line;
			// El numero debe ser maximo de dos digitos y debe contener minimo un signo !
			String re = "(\\d{1,2}) (!+)";
			Pattern pt = Pattern.compile(re);
			Matcher mt;
			
			while((line = reader.readLine()) != null) {	
				if(!line.isBlank()) {
					mt = pt.matcher(line);
					if(mt.matches()) {
						// Obtiene el numero a evaluar
						int n = Integer.parseInt(mt.group(1));
						// Obtiene cuantos signos ! hay						
						int k = mt.group(2).length();
						System.out.println(Factorial.fac(n, k));
					}
				}
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int fac(int n, int k) {
		int res = 1;
		for(int i = n; i > 0; i-=k) {
			res *= i;
		}
		return res;
}

}