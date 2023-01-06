import java.util.Scanner;

public class PromocionDirecta {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		float nota1, nota2, nota3, promedio;
		
		System.out.print("Ingrese primer nota: ");
		nota1=teclado.nextFloat();
		System.out.print("Ingrese segunda nota: ");
		nota2=teclado.nextFloat();
		System.out.print("Ingrese tercer nota: ");
		nota3=teclado.nextFloat();
		
		promedio=(nota1+nota2+nota3)/3;
		
		if (promedio>=7) {
			System.out.println("PROMOCIONADO");
			System.out.println("El promedio es de: "+promedio);
		}
		System.out.print(" - - FIN del Programa - - ");
	}

}
