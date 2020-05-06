package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Capturar cadena a evaluar
		String eval = "Hola mundo! estoy en Colombia";
		// Proxima linea en la cadena de texto
		String regex;
		while (true) {
			regex = in.next();
			if(regex.equals("exit"))
				break;
			
			Pattern patron = Pattern.compile(regex); // Exp regular
			Matcher m = patron.matcher(eval);
			
			boolean coincide = m.find();
			System.out.println("Hay alguna coincidencia? " + coincide);
		}
	}

}
