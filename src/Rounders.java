import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rounders {

	public static void main(String[] args) {
		BufferedReader read;
		try {
			read = new BufferedReader(new FileReader("src/rounders.in"));
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
								int[] num = new int [line.length()];
								for (int j = 0; j < line.length(); j++) {
									num[j] = Character.getNumericValue(line.charAt(j));
								}
								for(int j = num.length - 1; j > 0; j--) {
									if(num[j] >= 5) {
										num[j] = 0;
										num[j - 1] =  num[j - 1] + 1;
									}else {
										num[j] = 0;
									}
								}
								
								for(int n: num)
									System.out.print(n);
								System.out.println();
								
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
