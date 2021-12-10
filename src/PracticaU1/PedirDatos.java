package PracticaU1;

import javax.swing.*;

public class PedirDatos {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?: ");
		String telefono = JOptionPane.showInputDialog(null, "Cual es tu telefono?: ");
		String direccion = JOptionPane.showInputDialog(null, "Cual es tu domicilio?: ");
		JOptionPane.showMessageDialog(null,  "Bienvenido " + nombre + "\n Telefono: " +  telefono + "\n Direccion: " +  direccion);
	}

}
