package PracticaU1;

public class Factorial {

	public static void main(String[] args) {
		int num = 6;
		
		//mostar el factorial de num
		int factorial = 1;
		for (int i=1; i<num+1; i++)
			factorial *=i;
		
		System.out.println("El factorial de " + num + " es: " + factorial);
		

	}

}
