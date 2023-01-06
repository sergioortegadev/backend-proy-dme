import java.util.Scanner;

public class Problema2 {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre1, nombre2;
		int edad1, edad2;
		
		System.out.print("Ingrese el primer nombre y apellido: ");
		nombre1=teclado.nextLine();
		System.out.print("Ingrese la edad de "+nombre1+" : ");
		edad1=teclado.nextInt();
		
		// .nextLine() para que vacíe el buffer del teclado
		teclado.nextLine();
		
		System.out.print("Ingrese el segundo nombre y apellido: ");
		nombre2=teclado.nextLine();
		System.out.print("Ingrese la edad de "+nombre2+" : ");
		edad2=teclado.nextInt();
		
		if (edad1>edad2) {
			System.out.println(nombre1 + " con " + edad1 + " es mayor que " + nombre2);
		}	else {
			if(edad2>edad1) {
				System.out.println(nombre2 + " con " + edad2 + " es mayor que " + nombre1);				
			} 	else {
				System.out.println(nombre1 + " y " + nombre2 + " tienen la misma edad.");
			}
		}
		
		
		
		
		
		
		
		
		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}