package estructurasDeControl;

public class NuestroIF {

	public static void main(String[] args) {
		
		int edad = 10;
		String nombre="Juan";
		boolean activo = true;
		
		if( edad > 18 && nombre != null && activo == true) { //&& operador "Y", || operador "OR/Ó
			System.out.println("Eres mayor de edad");
			System.out.println("Tu nombre es: " +  nombre);
			System.out.println("Fin del programa.");
		}
		
		System.out.println("Se acabo...");

	}

}
