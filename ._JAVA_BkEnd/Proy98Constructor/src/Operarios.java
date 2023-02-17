import java.util.Scanner;

public class Operarios {
	private Scanner teclado;
	private int[] sueldos;
	
	public Operarios() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for(int f=0; f<sueldos.length;f++) {
			System.out.print(" Ingrese sueldo de op: ");
			sueldos[f]=teclado.nextInt();
		}
		System.out.println();
	}
	public void imprimir() {
		System.out.println("- - Listado de sueldos - -");
		for(int f=0;f<sueldos.length;f++) {
			System.out.println(sueldos[f]);
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		System.out.println("-- Inicio Programa Operarios --");
		Operarios o = new Operarios();
		o.imprimir();
		System.out.println("=== Programa Finalizado ===");
	}

}
