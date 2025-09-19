package moviles.repaso.ej1;

public class Producto {
	/*
	 * Crea una clase llamada Producto que represente un artículo en el inventario
	 * de una tienda de electrónica. Esta clase debe tener los siguientes atributos:
	 * nombre (String) precio (double). Debemos evitar que se puedan crear productos
	 * con precio negativo. stock (int). Debemos evitar que se puedan crear
	 * productos con stock negativo.
	 */
	private String nombre;
	private double precio;
	private int stock;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto: " + nombre + ",\n precio:" + precio + ", \n stock disponible:" + stock + " unidades\n";
	}

}
