package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=sa-TUpSx1JA
		String re = "\\d{1,2}[!]";
		String txt = "23!";
		
		Pattern pt = Pattern.compile(re);
		Matcher mt = pt.matcher(txt);
		
		boolean result = mt.matches();
		System.out.println(result);

	}

}
