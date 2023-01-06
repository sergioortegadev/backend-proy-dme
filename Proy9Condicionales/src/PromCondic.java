import java.util.Scanner;

public class PromCondic {

	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int nota1, nota2, nota3;
		
		System.out.print("Ingrese nombre estudiante: ");
		nombre=teclado.next();
		System.out.print("Ingrese primer nota: ");
		nota1=teclado.nextInt();
		System.out.print("Ingrese segunda nota: ");
		nota2=teclado.nextInt();
		System.out.print("Ingrese tercer nota: ");
		nota3=teclado.nextInt();
		
		float promedio=(float)(nota1+nota2+nota3)/3;
		
		if (promedio>=7) {
			System.out.println(nombre+" PROMOCIONADO");
			System.out.println("El promedio es de: "+promedio);
		} else {
			if(promedio>=4) {
				System.out.println(nombre+" REGULAR");
				System.out.println("El promedio es de: "+promedio);				
			} else {
				System.out.println(nombre+" REPROBADO");
				System.out.println("El promedio es de: "+promedio);
			}			
		}
		System.out.print(" - - Programa FINALIZADO! - - ");
	}

}
