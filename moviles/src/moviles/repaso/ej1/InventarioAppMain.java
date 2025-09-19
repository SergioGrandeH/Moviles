package moviles.repaso.ej1;

import java.util.ArrayList;

public class InventarioAppMain {

	public static void main(String[] args) {

		Producto p1 = new Producto ("Raton", 14, 7);
		Producto p2 = new Producto ("Monitor", 12, 4);
		Producto p3 = new Producto ("Teclado", 14, 7);
		Producto p4 = new Producto ("Repetidor router", 14, 7);
		Producto p5 = new Producto ("Altavoces", 14, 7);
	
		ArrayList <Producto> arrayProductos = new ArrayList<>();

		arrayProductos.add(p1);
		arrayProductos.add(p2);
		arrayProductos.add(p3);
		arrayProductos.add(p4);
		arrayProductos.add(p5);
		
		System.out.print(arrayProductos);
	
		double valorFinal=0;
		
		for(int i=0; i<arrayProductos.size(); i++) {
			valorFinal = valorFinal +arrayProductos.get(i).getPrecio()*arrayProductos.get(i).getStock();
		}
		System.out.println();
		System.out.println("El valor final total del inventario es "+valorFinal);
	
	}

		
	

}
