import java.util.Scanner;
public class Listas {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int l1=0, l2=0, x=1;
		
		while (x<=15 ) {
			System.out.print(x+" - Ingrese valores para lista 1: ");
			l1+=teclado.nextInt();
			x++;
		}
		x=1;
		while (x<=15 ) {
			System.out.print(x+" - Ingrese valores para lista 2: ");
			l2+=teclado.nextInt();
			x++;
		}
		if (l1>l2) {
			System.out.println("Lista 1 mayor");
		} else {
			if(l1==l2) {
				System.out.println("Listas iguales");
			} else {
				System.out.println("Lista 2 mayor");
			}
		}
	
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
