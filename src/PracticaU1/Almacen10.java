package PracticaU1;

public class Almacen10 {

	public static void main(String[] args) {
		//Primera resolucion del profesor
		String nombre = "Jose";
		String telefono ="5589966523";
		String domicilio ="Zapata 22 NR";
		int cantidad = 15;
		double precioEscoba = 30;
		double total;
		
		if (cantidad >1 && cantidad <= 10) {
			total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.10);
			System.out.println("Cliente: " + nombre);
			System.out.println("Domicilio: " + domicilio);
			System.out.println("Telefono: " + telefono);
			System.out.println("total a pagar: $" + total);
		}else if (cantidad >10 && cantidad <= 20) {
			total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.20);
			System.out.println("Cliente: " + nombre);
			System.out.println("Domicilio: " + domicilio);
			System.out.println("Telefono: " + telefono);
			System.out.println("total a pagar: $" + total);
		}else if (cantidad >20 && cantidad <= 30) {
			total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.30);
			System.out.println("Cliente: " + nombre);
			System.out.println("Domicilio: " + domicilio);
			System.out.println("Telefono: " + telefono);
			System.out.println("total a pagar: $" + total);
			}
	 	}



	}

