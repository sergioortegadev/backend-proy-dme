import java.util.Scanner;

public class SuperficieCuadrado {
	public static void main(String [] ar) {
		Scanner teclado = new Scanner(System.in);
		
		int lado;
		int superficie;
		
		System.out.print("Ingresar el lado : ");
		lado = teclado.nextInt();
		superficie = lado * lado;
		
		System.out.print("La Superficie es : " + superficie);
	}

}
