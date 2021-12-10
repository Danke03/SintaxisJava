package PracticaU1;

public class Almacen {

	public static void main(String[] args) {
		//Mi practica
		String nombre ="Damian";
		String telefono = "55-74-97-82-74";
		String domicilio= "Demina 7 Mz 12";
		int cantidad = 15;
		int precioU = 30;
		double subtotal1 = 0;
		double precioF = 0;
		double descuento = 0;
		
		if (cantidad>0 && cantidad <= 10) {
			subtotal1 = cantidad * precioU;
			descuento = subtotal1 * 0.10;
			precioF =(subtotal1 - descuento);
			System.out.println("Nombre del cliente: " + nombre);
			System.out.println("Numero de telefono del cliente: " + telefono);
			System.out.println("Domicilio " + domicilio);
			System.out.println("Subtotal " + subtotal1);
			System.out.println("Descuento por su compra: " + descuento);
			System.out.println("El precio final de su compra es " + precioF);
		}else if (cantidad >10 && cantidad<=20) {
			subtotal1 = cantidad * precioU;
			descuento = subtotal1 * 0.20;
			precioF =(subtotal1 - descuento);
			System.out.println("Nombre del cliente: " + nombre);
			System.out.println("Numero de telefono del cliente: " + telefono);
			System.out.println("Domicilio " + domicilio);
			System.out.println("Subtotal " + subtotal1);
			System.out.println("Descuento por su compra: " + descuento);
			System.out.println("El precio final de su compra es " + precioF);
		}else if (cantidad >20 && cantidad<=30) {
			subtotal1 = cantidad * precioU;
			descuento = subtotal1 * 0.30;
			precioF = (subtotal1 - descuento);
			System.out.println("Nombre del cliente: " + nombre);
			System.out.println("Numero de telefono del cliente: " + telefono);
			System.out.println("Domicilio " + domicilio);
			System.out.println("Subtotal " + subtotal1);
			System.out.println("Descuento por su compra: " + descuento);
			System.out.println("El precio final de su compra es " + precioF);

			}
		}
}