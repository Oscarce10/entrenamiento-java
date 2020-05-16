import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tree {
	// Entrenamiento 3

	public static void main(String[] args) {
		try {
			BufferedReader re = new BufferedReader(new FileReader("src//tree.in"));
			String line;
			while(!(line = re.readLine()).equals("0 0")) {
				String[] nums = line.split(" ");
				int t1 = Integer.parseInt(nums[0]);
				int max = t1;
				int t2 = Integer.parseInt(nums[1]);
				if(t2 > t1)
					max = t2;
				int heigth1 = 2*t1;
				int width1 = 4*t1 - 1;
				int heigth2 = 2*t2;
				int width2 = 4*t2 - 1;
				int maxH = 2 * max + 2;
				int maxW = width1 + width2 + 1;
				char [][] matrix = new char[maxH][maxW];
				int a = 0; // Fila
				int m = 1; //Num '*'
				// bt# -> branch height tree #}
				// st# -> stem tree #
				for(int bt1 = 0, bt2 = 0, st1 = 0, st2 = 0; a < maxH;) {
					bt1 = (2 * t1 - 1 - a);
					bt2 = (4 * t1 + 2 * t2 - 1 - a);
					boolean boot1 = true; // * Evita que se incrementen las variables st1 y st2 mas de una vez
					boolean boot2 = true; // * Dentro del ciclo de d
					for (int d = 0; d < m; d++) {
						if(a < heigth1) {
							matrix[a][bt1++] = '*';
						} else if (st1 < t1 && boot1) {
							matrix[a][2 * t1 - 1] = '*';
							st1++;
							boot1 = false;
						}
						
						if(a < heigth2) {
							matrix[a][bt2++] = '*';
						}else if(st2 < t2 && boot2) {
							matrix[a][4 * t1 + 2 * t2 - 1] = '*';
							st2++;
							boot2 = false;
						}
						
						
					}
					System.out.println(matrix[a]);
					a++;
					m += 2;
					
				}
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
