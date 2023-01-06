import java.util.Scanner;

public class PosNulNeg {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Ingrese numero entero: ");
		num = teclado.nextInt();
		
		if (num>0) {
			System.out.println("El numero es POSITIVO");
		} else {
			if (num==0) {
				System.out.println("El numero es NULO");
			} else {
				System.out.println("El numero es NEGATIVO");
			}
		}
	}
}
