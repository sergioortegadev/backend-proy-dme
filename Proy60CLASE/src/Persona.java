import java.util.Scanner;

public class Persona {
	
	private String nombre;
	private int edad;
	private Scanner teclado;

	public void inicializar() {
		teclado = new Scanner(System.in);
		
		System.out.print("Ingresar el nombre de la persona: ");
		nombre=teclado.next();
		System.out.print("Ingresar edad de la persona: ");
		edad=teclado.nextInt();
		teclado.close();		
	}
	
	public void imprimir() {
		System.out.println("Nombre ingresado: "+nombre+". Edad: "+edad);
	}
	
	public void esMayor() {		
		if (edad>=21) {
			System.out.println("Es mayor de edad.");
		}	else System.out.println("Es menor de edad.");
	}
	
	
	
	
	public static void main(String[]ar) {
		Persona persona1 = new Persona();
		persona1.inicializar();
		persona1.imprimir();
		persona1.esMayor();
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
