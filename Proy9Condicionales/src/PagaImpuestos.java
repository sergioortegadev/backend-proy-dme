import java.util.Scanner;

public class PagaImpuestos {
	public static void main(String []ar) {
		Scanner teclado=new Scanner(System.in);
		
		float sueldo;
		System.out.print("Ingrese sueldo : ");
		sueldo=teclado.nextFloat();
		if (sueldo > 3000) {
			System.out.println("Esta persona debe abonar impuesto");
		}
		System.out.print(" - - - FIN del programa - - - ");
	}
}
