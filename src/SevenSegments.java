import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SevenSegments {

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src/segments.in"));
			String linea;
			String er = "^(\\d)\\s([1-5])$";
			Pattern pt = Pattern.compile(er);
			Matcher mt;
			
			while((linea = re.readLine()) != null) {
				mt = pt.matcher(linea);
				if(mt.matches()) {
					String blank = "";
					String horiz = "";
					String vert = "|";
					int num = Integer.parseInt(mt.group(1));
					int lines = Integer.parseInt(mt.group(2));
					for(int i = 0; i < lines; i++) {
						blank += " ";
						horiz += "-";
					}
					String uno = " " + horiz + "\n";
					String dos = "";
					for (int i = 0; i < lines; i++) {
						dos += vert + "\n";
					}
					String dosTres = "";
					for (int i = 0; i < lines; i++) {
						dosTres += vert + blank + vert + "\n";
					}
					String tres = "";
					for (int i = 0; i < lines; i++) {
						tres += blank + " " + vert + "\n";
					}					
					
					switch (num) {
					case 0:
						System.out.println(uno + dosTres + "\n" + dosTres + uno);						
						break;
					
					case 1:
						System.out.println(tres + "\n" + tres);						
						break;
						
					case 2:
						System.out.println(uno + tres + uno + dos + uno);						
						break;
						
					case 3:
						System.out.println(uno + tres + uno + tres + uno);
						break;

					case 4:
						System.out.println(dosTres + uno + tres);
						break;
						
					case 5:
						System.out.println(uno + dos + uno + tres + uno);
						break;
						
					case 6:
						System.out.println(dos + uno + dosTres + uno);
						break;
						
					case 7:
						System.out.println(uno + tres + "\n" + tres);
						break;
						
					case 8:
						System.out.println(uno + dosTres + uno +dosTres + uno);
						break;
						
					case 9:
						System.out.println(uno + dosTres + uno +tres);
						break;

					default:
						break;
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
