import java.util.Scanner;

public class Empleados {
	private String nombre;
	private int sueldo;
	private Scanner teclado;
	
	public Empleados() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese nombre del empleado: ");
		nombre=teclado.next();
		System.out.print("Ingrese sueldo: ");
		sueldo=teclado.nextInt();
		teclado.close();
		System.out.println();
	}
	public void imprimirDatos() {
		System.out.println(nombre+" tiene sueldo de: $"+sueldo);
	}
	public void imprimirImpuesto() {
		if(sueldo>3000) System.out.println("Paga impuesto");
		else System.out.println("No paga impuesto");
	}

	public static void main(String[] args) {
		System.out.println("-- Inicio Programa Empleados --");
		Empleados e=new Empleados();
		e.imprimirDatos();
		e.imprimirImpuesto();
		System.out.println("=== Programa Finalizado ===");

	}

}
