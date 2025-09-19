package ej4;

import java.util.ArrayList;

public class GestorTareas {
ArrayList<Tarea> listaTareas= new ArrayList<>();


public void agregarTarea(Tarea t) {
	listaTareas.add(t);
	
}

public void eliminarTarea(int posicion) {
	if(0<posicion&&posicion<listaTareas.size()-1) {
		System.out.println("Introduce una posicion valida");
	}else {
	listaTareas.remove(posicion);
	}
}
public void buscarPorPrioridad(int prio) {
	for(int i=0; i<listaTareas.size();i++) {
		if(listaTareas.get(i).getPrioridad()==prio) {
			System.out.println(listaTareas.get(i));
		}
	}
}
public void buscarPorDescripcion(String des) {
	for(int i=0; i<listaTareas.size();i++) {
		if(listaTareas.get(i).getDescripcion().equals(des)) {
			System.out.println(listaTareas.get(i));
		}
	}
}
public void buscarPorEstado(boolean status) {
	for(int i=0; i<listaTareas.size();i++) {
		if(listaTareas.get(i).isCompletada()==status) {
			System.out.println(listaTareas.get(i));
		}
	}	
}
public void mostrarTareas() {
	System.out.println(listaTareas);
}
}
