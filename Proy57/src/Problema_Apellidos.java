import java.util.Scanner;

public class Problema_Apellidos {
	public static void main(String[]ar) {
		
		Scanner teclado = new Scanner(System.in);
		String apellido1, apellido2;
		
		System.out.print("Ingrese el primer apellido: ");
		apellido1=teclado.nextLine();
		System.out.print("Ingrese el segundo apellido: ");
		apellido2=teclado.nextLine();
		
		if (apellido1.equalsIgnoreCase(apellido2)) {
			System.out.println("Los apellidos son iguales");
		}	else {
			System.out.println("Los apellidos son distintos");
		}
		
		
		
		
		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
