package PracticaU1;

public class NumerosPrimos {

	public static void main(String[] args) {
		//Mostrar los números primos del al 1000
		boolean sw;
		int contador = 0;
		
		System.out.println("Los numeros primos del 1 al 1000 son: ");
		for(int i=1; i<1001; i++) {
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
		System.out.println("");
		System.out.println("Hay: " + contador + " numeros primos entre el 1 y el 1000.");
		
		//Mostrar los años bisiestos del 2000 al 3000
		contador= 0;
		
		System.out.println("Los años bisisestos del 2000 al 3000 son: ");
		for(int i = 2000; i < 3001; i++) {
			if((i%4 == 0 && i%100 !=0)|| i%400 == 0) {
				System.out.print(i+",");
				contador ++;	
			}
		}
		System.out.println("");
		System.out.println("Hay: " + contador + "años bisiestos entre el 2000 y el 3000.");
	}

}
