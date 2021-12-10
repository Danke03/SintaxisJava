package operadores;

public class OpDeslazamiento {   //desplazamiento de bit
	public static void main (String[]args) {
		int a =1;
		int b = 128;
		
		a = a << 1;
		b = b >> 5;
		
		System.out.println("a vale: " + a);
		System.out.println("b vale: " + b);
	}

}
