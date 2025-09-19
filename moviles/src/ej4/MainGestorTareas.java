package ej4;

import java.util.Scanner;

public class MainGestorTareas {

	public static void main(String[] args) {
		GestorTareas gt1 = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una opcion");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("introduce la tarea");
			String descTarea = sc.next();
			int prioridadTarea = sc.nextInt();
			// Lo logico es que empiece en false, pero bueno
			boolean completadaTarea = sc.nextBoolean();
			Tarea t1 = new Tarea(descTarea, prioridadTarea, completadaTarea);
			gt1.agregarTarea(t1);
			break;
		case 2:
			System.out.println("Indica el numero de la tarea a eliminar");
			int numTarea = sc.nextInt();
			gt1.eliminarTarea(numTarea);
			break;
		case 3:
			System.out.println("Introduce la prioridad de la tarea a buscar");
			prioridadTarea = sc.nextInt();
			gt1.buscarPorPrioridad(prioridadTarea);

			break;
		case 4:
			System.out.println("Introduce la descripcion de la tarea a buscar");
			descTarea = sc.next();
			gt1.buscarPorDescripcion(descTarea);

			break;

		case 5:
			System.out.println("Introduce si quieres buscar por las que estan completadas o las que no");
			completadaTarea = sc.nextBoolean();
			break;
		}
	}

}
