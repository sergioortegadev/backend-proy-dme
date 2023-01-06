import java.util.Scanner;

public class Hasta3Cifras {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Ingrese numero entero de hasta 3 cifras: ");
		num = teclado.nextInt();
		
		if (num>9) {
			if (num>99) {
				if (num>999) {
					System.out.println("ERROR!: Debe ingresar un numero de hasta 3 cifras.");
				} else {
					System.out.println("Numero de TRES cifras.");
				}
			} else {
				System.out.println("Numero de DOS cifras.");
			}
		} else {
			System.out.println("Numero de UNA cifra.");
		}
		System.out.print(" - - Programa FINALIZADO - - ");
	}

}
