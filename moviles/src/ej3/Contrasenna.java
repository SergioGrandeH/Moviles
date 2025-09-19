package ej3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Contrasenna {

	public static void main(String[] args) {

		/*
		 * Crea un programa que genere una contraseña aleatoria de una longitud
		 * determinada por el usuario. Pide al usuario que introduzca la longitud
		 * deseada de la contraseña, con un rango válido entre 8 y 16 caracteres. Valida
		 * la entrada del usuario. Si la longitud está fuera del rango, muestra un
		 * mensaje de error y pide una nueva entrada. Define un String o un array de
		 * caracteres y crea un método para introducir en esta estructura todos los
		 * posibles caracteres que puede incluir la contraseña:  Letras minúsculas
		 * (a-z)  Letras mayúsculas (A-Z)  Números (0-9)  Símbolos especiales (por
		 * ejemplo: !@#$%^&*()-_+=) Recorre la estructura y usa la clase
		 * java.util.Random para seleccionar aleatoriamente un carácter de esta
		 * estructura y concatena los caracteres hasta alcanzar la longitud deseada.
		 * Muestra la contraseña generada en la consola.
		 * 
		 */

		// Me he venido muy arriba
		char[] arrayCaracteres = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5',
				'6', '7', '8', '9', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=' };
		
		ArrayList<Character> arrayContrasenna = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce la longitud");
			int longitud = sc.nextInt();
			while (longitud < 8 || longitud > 16) {
				System.out.println("Introduce una longitud valida");
				longitud = sc.nextInt();
			}
			Random ran = new Random();
			for (int i = 0; i < longitud; i++) {
				int numAleatorio = ran.nextInt(arrayCaracteres.length);
				arrayContrasenna.add((char) numAleatorio);

			}

		} catch (InputMismatchException ime) {
			System.out.println("Mete un numero");
		}
		System.out.println(arrayContrasenna);
	}

}
