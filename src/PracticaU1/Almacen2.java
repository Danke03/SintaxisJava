package PracticaU1;

import javax.swing.JOptionPane;

public class Almacen2 {

	public static void main(String[] args) {
		
		double precioEscoba = 30;
		double total;
		
		String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?: ");
		String telefono = JOptionPane.showInputDialog(null, "Cual es tu telefono?: ");
		String direccion = JOptionPane.showInputDialog(null, "Cual es tu domicilio?: ");
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas ecobas compraras?: "));
		
	
		if (cantidad >1 && cantidad <= 10) {
		total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.10);
		JOptionPane.showMessageDialog(null,  "Bienvenido " + nombre + "\n Telefono: " +  telefono + 
				"\n Direccion: " +  direccion + "\nCantidad: " + cantidad + "escobas" + "\n Total a pagar: $ " +  total);
		
		}else if (cantidad >10 && cantidad <= 20) {
		total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.20);
		JOptionPane.showMessageDialog(null,  "Bienvenido " + nombre + "\n Telefono: " +  telefono + 
				"\n Direccion: " +  direccion + "\nCantidad: " + cantidad + "escobas" + "\n Total a pagar: $ " +  total);
		
		}else if (cantidad >20 && cantidad <= 30) {
		total = (precioEscoba * cantidad) - ((precioEscoba * cantidad)*.30);
		JOptionPane.showMessageDialog(null,  "Bienvenido " + nombre + "\n Telefono: " +  telefono + 
				"\n Direccion: " +  direccion + "\nCantidad: " + cantidad + "escobas" + "\n Total a pagar: $ " +  total);
		}

	}
}

