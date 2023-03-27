import java.util.Scanner;

public class Operaciones {
	private int valor1, valor2;
	private Scanner teclado;
	
	private Operaciones() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese valor 1: ");
		valor1=teclado.nextInt();
		System.out.print("Ingrese valor 2: ");
		valor2=teclado.nextInt();
		teclado.close();
		System.out.println();
	}
	public void suma() {
		System.out.println("- - SUMA - -");
		System.out.println("La suma es: "+(valor1+valor2));
		System.out.println();
	}
	public void resta() {
		System.out.println("- - RESTA - -");
		System.out.println("La resta es: "+(valor1-valor2));
		System.out.println();
	}
	public void multiplicacion() {
		System.out.println("- - MULTIPLICACION - -");
		System.out.println("El producto es: "+valor1*valor2);
		System.out.println();
	}
	public void division() {
		System.out.println("- - DIVISION - -");
		System.out.println("El cociente es: "+valor1/valor2);
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("-- Inicio Programa Operaciones --");
		Operaciones o = new Operaciones();
		o.suma();
		o.resta();
		o.multiplicacion();
		o.division();
		System.out.println("=== Programa Finalizado ===");

	}

}
