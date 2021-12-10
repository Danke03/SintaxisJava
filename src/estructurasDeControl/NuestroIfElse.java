package estructurasDeControl;

public class NuestroIfElse {

	public static void main(String[] args) {
		
		int promedio = 9;
		boolean esRegular = true;
		float ingresoMensual = 4500.00F;
		
		if (promedio > 8 || esRegular || ingresoMensual <= 3000.00) {
			System.out.println("Tienes una beca.");
		}else {
			System.out.println("No tienes el promedio para las becas");
		}

	}

}
