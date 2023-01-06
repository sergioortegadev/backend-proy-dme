import java.util.Scanner;

public class DiezValores {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int suma=0;
		for(int f=1; f<=10; f++) {
			System.out.print(f+" - Ingrese valores: ");
			suma=suma+teclado.nextInt();
		}
		float promedio=(float)suma/10;
		System.out.println(suma+" Es la suma de los 10 valores.");
		System.out.println(promedio+" Es el promedio de los 10 valores.");
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
