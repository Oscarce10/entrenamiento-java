import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Ace {

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src//ace.in"));
			String line;
			while((line = re.readLine())!= null) {
				int cases = Integer.parseInt(line);
				for (int i = 0; i < cases; i++) {
					line = re.readLine();
					int [] table = new int [3];
					
					table[1] = 1;
					for (int j = 0; j < line.length(); j++) {
						int aux;
						switch (line.charAt(j)) {
						case 'L':
							aux = table[0];
							table[0] = table[1];
							table[1] = aux;
							break;
						case 'R':
							aux = table[2];
							table[2] = table[1];
							table[1] = aux;
							break;
						case 'E':
							aux = table[0];
							table[0] = table[2];
							table[2] = aux;
							break;

						default:
							break;
						}			
						
					}
					Hashtable<Integer, Character> fin = new Hashtable<Integer, Character>();
					fin.put(0, 'L');
					fin.put(1, 'M');
					fin.put(2, 'R');
					for (int j = 0; j < table.length; j++) {
						
						if(table[j] == 1)
							System.out.println(fin.get(j));
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
