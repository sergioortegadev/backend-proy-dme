import java.util.Scanner;

public class Empleados {
	private Scanner teclado;
	private String nombre;
	private int sueldo;
	
	public void inicializar() {
		System.out.println(" === Inicio Programa === ");
		teclado = new Scanner(System.in);
		System.out.print("Ingresar Nombre y Apellido: ");
		nombre = teclado.nextLine();
		System.out.print("Ingresar sueldo: ");
		sueldo = teclado.nextInt(); 
		teclado.close();
	}
	public void imprimirDatos() {
		System.out.println(" - - - DATOS - - - ");
		System.out.println("Nombre y Apellido: "+nombre);
		System.out.println("Sueldo: "+sueldo);
	}
	public void pagaImpuesto() {
		System.out.println(" - - - Impuesto - - - ");
		if (sueldo>3000) System.out.println("Paga impuesto");
		else System.out.println("No paga impuesto");
	}
	public static void main(String[] args) {
		Empleados empleados1 = new Empleados();
		empleados1.inicializar();
		empleados1.imprimirDatos();
		empleados1.pagaImpuesto();		
		System.out.println(" === Programa Finalizado === "); 
	}
}
