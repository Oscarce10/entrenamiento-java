

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OddEven {

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src\\txt\\oddEven.txt"));
			String line1, line2, line3;
			String re1 = "[1-100]";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			

	}

}
