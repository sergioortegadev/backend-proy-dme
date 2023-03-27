import java.util.Scanner;

public class Alumnos {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public Alumnos() {
		teclado=new Scanner(System.in);
		System.out.print("Ingresar nombre: ");
		nombre=teclado.next();
		System.out.print("Ingresar edad: ");
		edad=teclado.nextInt();
		teclado.close();
	}
	
	public void imprimir() {
		System.out.println("- - Imprimir Datos - -");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad+" años.");
		System.out.println();
	}
	public void esMayorEdad() {
		System.out.println("- - Imprimir es mayor - -");
		if(edad>=18) System.out.println(nombre+" Es mayor de 18 años.");
		else System.out.println(nombre+" No es mayor de 18.");
	}

	public static void main(String[] args) {
		System.out.println("-- Inicio Programa Alumnos --");
		Alumnos a = new Alumnos();
		a.imprimir();
		a.esMayorEdad();		
		System.out.println("=== Programa Finalizado ===");

	}

}
