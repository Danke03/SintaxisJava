package PracticaU1;

import javax.swing.JOptionPane;

public class NumerosPrimPeticiondeDatos {
	//programa "NumerosPrimos" modificado para establecer el rango de la operacion
	public static void main(String[] args) {
		boolean sw;
		int contador = 0;
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál quieres que sea el numero inicial?: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál quieres que sea el numero final?: "));
		System.out.println("Los numeros primos del 1 al 1000 son: ");
		for(int i=num1; i<=num2; i++) {
			sw=true;
			for(int j=i; j>0; j--) {
				if (i%j == 00 &&  j !=i &&  j != 1) {
					sw=false;
					break;
				}
			}
			if(sw) {
			System.out.print(i + ",");
			contador++;
			}
		}
		JOptionPane.showMessageDialog(null,"");
		JOptionPane.showMessageDialog(null,"Hay: " + contador + " numeros primos entre el " + num1 + " y el " + num2);
		
		//Año bisiesto
		contador= 0;
		int anio1 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál quieres que sea el año inicial?: "));
		int anio2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál quieres que sea el año final?: "));
		
		System.out.println("\nLos años bisisestos del " + anio1 + " al " + anio2 + " son: ");
		for(int i = anio1; i <=anio2; i++) {
			if((i%4 == 0 && i%100 !=0)|| i%400 == 0) {
				System.out.print(i+",");
				contador ++;	
			}
		}
		System.out.println("");
		JOptionPane.showMessageDialog(null,"Hay: " + contador + " años bisiestos entre el " + anio1 + " y el " + anio2);
	}

}
