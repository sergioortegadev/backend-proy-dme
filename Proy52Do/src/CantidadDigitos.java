import java.util.Scanner;

public class CantidadDigitos {
	public static void main(String[]ar) {
		Scanner teclado =new Scanner(System.in);
		int valor;
		
		do {
			System.out.print("Ingrese un valor entre 0 y 999: ");
			valor = teclado.nextInt();
			
			if (valor >= 100) {
				System.out.println("Tiene 3 digitos");
			} else {
				if (valor >= 10) {
					System.out.println("Tiene 2 digitos");
				} else System.out.println("Tiene 1 digito");
			}
			
			
		} while (valor != 0);
		
		
		
		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
