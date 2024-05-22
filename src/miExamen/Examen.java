package miExamen;

import java.util.Scanner;

public class Examen {
	
	public static void main(String[] arg) {
		
		int numero = 0;
		Scanner ent = new Scanner(System.in);
		System.out.println("Buenos días Ceinmark, soy Marta Gómez");
		
		System.out.println("Introduce un número para averiguar si es primo o no: ");
		
		numero = Integer.parseInt(ent.nextLine());
	}

}
