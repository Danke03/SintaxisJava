package PracticaU1;

public class SumaDeNumerosConsecutivos {

	public static void main(String[] args) {
		int acum=0;
		for (int i=1; i<101; i++)
			acum += i;
		
		System.out.println("La suma de los numeros del 1 al 100 es: " + acum);
	}

}
