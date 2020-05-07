import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rounders {

	public static void main(String[] args) {
		BufferedReader read;
		try {
			read = new BufferedReader(new FileReader("src\\rounders.in"));
			String line;
			String er = "^\\d{1,8}$";
			Pattern pt1 = Pattern.compile("\\d");
			Pattern pt2 = Pattern.compile(er);
			Matcher mt;
			while((line = read.readLine()) != null) {
				mt = pt1.matcher(line);
				if(mt.matches()) {
					int nums = Integer.parseInt(mt.group());
					for(int i = 0; i < nums; i++) {
						line = read.readLine();
						mt = pt2.matcher(line);
						if(mt.matches()) {
							
							if(line.length() == 1)
								System.out.println(line);
							else {
								String newLine = "";
								boolean ch = false;								
								for(int j = line.length() - 1; j > 0; j--) {
									int aux = 0;
									if(ch) {
										aux = Character.getNumericValue(line.charAt(j)) + 1;
									}
									if(line.charAt(j) >= 5 || aux >= 5) {
										newLine += "" + 0;
										ch = true;
									}else {
										newLine += "" + 0;
										ch = false;
									}
								}
								System.out.print(line + " -> ");
								for(int j = newLine.length() - 1; j >= 0; j--) {
									System.out.println(newLine.charAt(j));
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
