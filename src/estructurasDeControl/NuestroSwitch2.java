package estructurasDeControl;

public class NuestroSwitch2 {

	public static void main(String[] args) {
		
	char calificacion = 'f';
		
		switch(calificacion ) {
		case 'a':
			System.out.println("felicidades sacaste A+");
			break;
		case 'b':
			System.out.println("Enhorabuena B+");
			break;
		case 'c':
			System.out.println("Una C+ muy poco");
			break;
		case 'd':
			System.out.println("Echale mas ganas sacaste D+, no te sirve");
			break;
		case 'e':
			System.out.println("En verdad es muy mala la nota E... no sirve");
			break;
		default:
			System.out.println("Reprobaste");
		}

	}

}
