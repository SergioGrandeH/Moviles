package ej2;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Elige una opcion: \n"
					+ "1 para convertir de metros a centimetros\n"
					+ "2 para convertir de kilogramos a gramos\n"
					+ "3 para pasar de euros a dolares\n"
					+ "y 4 para salir");
			int opcion=sc.nextInt();
			
			while(opcion<1||opcion>4) {
			System.out.println("Introduce un valor valido");
			opcion=sc.nextInt();
			}
			switch(opcion) {
			case 1:
				System.out.println("Metros a centimetros");
				conversorMetrosCent();
				break;
			case 2:
				System.out.println("Kilogramos a Gramos");
				conversoKilosAGramos();
				break;
			case 3:
				System.out.println("Euros a Dolares");
				conversorEurosADolares();
				break;
			case 4:
				System.out.println("Salir");
				System.out.println("Adios");
				break;
			
			}
		}
		}
		
public static void conversorMetrosCent() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Introduce los metros");
	double metros =sc.nextDouble();
	sc.close();
	System.out.println( metros*100+" cm");
	
}
public static void conversoKilosAGramos() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Introduce los kilos");
	double kilos =sc.nextDouble();
	sc.close();
	System.out.println(kilos*1000+" gramos");
	}
public static void conversorEurosADolares() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Introduce los leros");
	double euros =sc.nextDouble();
	sc.close();
	System.out.println(euros*1.08+" dolares");
	
}
}
