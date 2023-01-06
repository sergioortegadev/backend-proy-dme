import java.util.Scanner;

public class Digitos {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Ingrese numero POSITIVO, de uno o dos digitos: ");
		num=teclado.nextInt();
		
		if(num>0) {
			if(num>9) {
				if(num>99) {
					System.out.println("ERROR: Debio ingresar numero de hasta dos digitos"); 
				} else {
					System.out.println("El numero tiene DOS digitos");
				}
			} else {
				System.out.println("El numero tiene UN digito");
			}
			
		} else {
			System.out.println("ERROR: Debio ingresar numero POSITIVO");
		}
		System.out.println(" - - Programa FINALIZADO - - ");		
	}

}
