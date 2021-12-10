package estructurasDeControl;

public class NuestroIfElseIf { //if anidado

	public static void main(String[] args) {
		
		int edad = 20;
		boolean estaVivo = true;
		
		if (edad >0 && edad<10 && estaVivo == true) {
			System.out.println("Eres un niño.");
		}else if(edad<=10 && edad <= 15 && estaVivo == true) {
			System.out.println("Eres un adolescente");
		}else if (edad>15 && edad <= 25 && estaVivo == true) {
			System.out.println("Eres un joven");
		}else if(edad >25 && edad <=60 && estaVivo == true) {
			System.out.println("Eres un adulto");
		}else  if (estaVivo == true) {
			System.out.println("Eres un adulto mayor");
		}
		
	}

}
