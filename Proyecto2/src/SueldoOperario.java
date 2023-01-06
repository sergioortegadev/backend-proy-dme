import java.util.Scanner;

public class SueldoOperario {
	
	public static void main(String[] ar) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombreOperario;
		int horasTrabajadas;
		float costoHora;
		float sueldo;
		
		System.out.print("Ingresar nombre del operario => : ");
		nombreOperario = teclado.next();
		
		System.out.print("Ingresar las horas trabajadas => : ");
		horasTrabajadas=teclado.nextInt();
		System.out.print("Ingresar costo por horas => : ");
		costoHora=teclado.nextFloat();
		
		sueldo = horasTrabajadas * costoHora;
		System.out.println("El sueldo del operario " + nombreOperario + " es : $" + sueldo);
		// println imprime en pantalla y deja el cursor en la línea siguiente
		System.out.print(" - - FIN del programa - - "	);
	}

}
