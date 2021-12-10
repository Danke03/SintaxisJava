package PracticaU1;

import javax.swing.JOptionPane;

public class SumaDeNumConsecPeticionDeDatos {
 //programa "SumaDeNumerosConsecutivos" modificado para establecer el rango de la operacion
	public static void main(String[] args) {
		int acum=0;
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál quieres que sea el numero inicial?: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál quieres que sea el numero final?: "));
		for (int i=num1; i<=num2; i++)
			acum += i;
		
		JOptionPane.showMessageDialog(null,"La suma de los numeros del " + num1 + " al" + num2 + " es: " + acum);

	}

}
