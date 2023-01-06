import java.util.Scanner;

public class Ticket {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		float precio;
		int cantidad;
		float total;
		
		System.out.print("Ingrese el precio : ");
		precio=teclado.nextFloat();
		System.out.print("Ingresar cantidad : ");
		cantidad=teclado.nextInt();
		
		total = precio * cantidad;
		
		System.out.println("Debe abonar : " + total);
		System.out.print("- - - FIN del programa - - - ");
	}

}
