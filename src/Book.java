import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
	// Entrenamiento 2

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src/book.in"));
			String line;
			String er = "^([1-9]\\d?\\d?)\\s([1-9]\\d?\\d?)$";
			Pattern pt = Pattern.compile(er);
			Matcher mt;
			int cases = 1;
			while((line = re.readLine()) != null) {
				if(line.equals("0"))
					return;
				mt = pt.matcher(line);
				if(mt.matches()) {
					int start = (Integer.parseInt(mt.group(1)) < Integer.parseInt(mt.group(2))) ? Integer.parseInt(mt.group(1))
							: Integer.parseInt(mt.group(2));
					int end = (Integer.parseInt(mt.group(1)) > Integer.parseInt(mt.group(2))) ? Integer.parseInt(mt.group(1))
							: Integer.parseInt(mt.group(2));
					if (start <= end) {
						String [] numbers = new String[end - start + 1];
						int [] keys = new int[10];
						for (int i = start, j = 0; i < end + 1; i++, j++) {
							numbers[j] = i+"";
							for (int k = 0; k < numbers[j].length(); k++) {
								keys[(numbers[j].charAt(k)) - 48]++;
							}
						}
						System.out.print("Case " + cases +": ");
						cases++;
						for(int i = 0; i < keys.length; i++) {
							System.out.print(i + ":" + keys[i] + " ");
						}
						System.out.println();
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
