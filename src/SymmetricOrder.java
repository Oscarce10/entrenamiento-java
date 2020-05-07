import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymmetricOrder {
	// Entrenamiento 2

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src\\symmetricOrder.in"));
			String line;
			ArrayList<String> arr1;
			ArrayList<String> arr2;
			String er1 = "1[0-5]|[1-9]";
			String er2 = "[a-zA-Z]{1,25}";
			Pattern pt1 = Pattern.compile(er1);
			Pattern pt2 = Pattern.compile(er2);
			Matcher mt;
			int con = 1;
			while((line = re.readLine()) != null) {
				if(line.equals("0"))
					break;
				mt = pt1.matcher(line);
				if(mt.matches()) {
					 arr1 = new ArrayList<String>();
					 arr2 = new ArrayList<String>();
					 int set = Integer.parseInt(mt.group());
					 boolean arr = true;
					 for(int i = 0; i < set; i++) {
						 line = re.readLine();
						 mt = pt2.matcher(line);						 
						 if(mt.matches()) {
							 if(arr) {
								 arr1.add(line);
								 arr = false;
							 }else {
								 arr2.add(line);
								 arr = true;
							 }							 
						 }else {
							 break;
						 }
						 
					 }
					 if(arr1.size() > 0 || arr2.size() > 0) {
						 System.out.println("SET " + con);
						 con++;
						 for (String name : arr1) {
							 System.out.println(name);
						}
			
						 for(int i = arr2.size() - 1; i >= 0; i--) {
							 System.out.println(arr2.get(i));
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
