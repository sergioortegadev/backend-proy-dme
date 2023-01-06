import java.util.Scanner;

public class AcumulaValores {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int valor, acum=0;
		
		do {
			System.out.print("Ingrese valor (Exit con 9999): ");
			valor = teclado.nextInt();
			if (valor!=9999) {
				acum += valor;
			}
		}	while (valor!=9999);
		
		System.out.println("El valor acumulado es: " + acum);
		
		if (acum > 0) {
			System.out.println("El valor acumulado es mayor a cero");
		}	else { 
			if (acum < 0) {
				System.out.println("El valor acumulado es menor a cero");
			}	else System.out.println("El valor acumulado es cero");
		}		

		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
