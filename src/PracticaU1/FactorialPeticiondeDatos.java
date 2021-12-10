package PracticaU1;

import javax.swing.JOptionPane;

public class FactorialPeticiondeDatos {
	//programa "Factorial" con peticion de datos.
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál quieres que sea el numero inicial?: "));
		//mostar el factorial de num
				int factorial = 1;
				for (int i=1; i<num1+1; i++)
					factorial *=i;
				
				JOptionPane.showMessageDialog(null,"El factorial de " + num1 + " es: " + factorial);
				

			}

	}

