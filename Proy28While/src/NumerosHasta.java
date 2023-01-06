import java.util.Scanner;

public class NumerosHasta {
	public static void main(String[]ar) {
	
		Scanner teclado = new Scanner(System.in);
		
		int n;
		int x=1;
		
		System.out.println("Ingrese un valor prositivo: ");
		n = teclado.nextInt();
		while(x<=n) {
			System.out.println("Conteo: "+x);
			x++;
		}
		
		System.out.print("- - - - Programa Finalizado - - - -");
	}
}
