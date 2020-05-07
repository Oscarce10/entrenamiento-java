

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseComparator {

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src\\txt\\baseComparator.txt"));
			String line;
			/*  Each test case has four
				numerical strings, each two of them separated by a blank character, say s b t c.
			 */
			String er = "(\\d+) (\\d) (\\d+) (\\d)";
			Pattern pt = Pattern.compile(er);
			Matcher mt;
			
			while((line = reader.readLine()) != null) {
				if(!line.isBlank()) {
					mt = pt.matcher(line);
					if(mt.matches()) {
						// Obtener primer numero
						String s = mt.group(1);
						// Obtener primer base
						int b = Integer.parseInt(mt.group(2));
						// Obtener segundo numero
						String t = mt.group(3);
						// Obtener segunda base
						int c = Integer.parseInt(mt.group(4));
						//System.out.println("s: " + s + "\rb: " + b + "\rt: " + t + "\rc: " + c);
						int dec_s = 0;
						int dec_t = 0;
						for(int i = s.length() - 1, j = 0; i>=0 ; i--, j++) {
							//System.out.println(Character.getNumericValue(s.charAt(i)) + " * " + b + "^" +j + " = " + Character.getNumericValue(s.charAt(i)) * Math.pow(b, j));
							dec_s +=  Character.getNumericValue(s.charAt(i)) * Math.pow(b, j);
							
						}
						for(int i = t.length() - 1, j = 0; i>=0 ; i--, j++) {
							//System.out.println(Character.getNumericValue(t.charAt(i)) + " * " + c + "^" + j + " = " + Character.getNumericValue(t.charAt(i)) * Math.pow(c, j));
							dec_t +=  Character.getNumericValue(t.charAt(i)) * Math.pow(c, j);
							
						}
						//System.out.println("dec_s: " + dec_s + "\ndec_t: " + dec_t);
						char res = ' ';
						if(dec_s < dec_t)
							res = '<';
						else if(dec_s > dec_t)
							res = '>';
						else
							res = '=';
						System.out.println(s + " " + b + " " + res + " " + t + " " + c);
						System.out.println("  " + dec_s + " " + res + " " + dec_t + "  ");
					}
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
