import java.util.Scanner;

public class TablaMultiplicar {
	private static  Scanner teclado=new Scanner(System.in);
	private int tabla;
	private int terminos;
	
	public TablaMultiplicar(int ta) {
		tabla=ta;
		terminos=10;
	}
	public TablaMultiplicar(int ta, int ter) {
		tabla=ta;
		terminos=ter;
	}
	
	public void imprimir() {
		System.out.println("- - Tabla de multiplicar del: "+tabla+" - -");
		for(int f=1;f<=terminos;f++) {
			int resultado=f*tabla;
			System.out.println(tabla+" x "+f+" = "+resultado);
		}
	}
	
	
	// Version tuneada por Sergio Ortega dev
	
	public static void main(String[] args) {
		System.out.println("-- Inicio Programa Tabla Multiplicar --");
		System.out.print("¿Llamamos al contructor con 1 o 2 parámetros?");
		int opcion = teclado.nextInt();
		if (opcion == 1) {
			System.out.print("indique tabla a mostrar");
			TablaMultiplicar ta = new TablaMultiplicar(teclado.nextInt());
			ta.imprimir();
		} else if (opcion == 2) {
			System.out.print("indique tabla a mostrar:");
			int tabla=teclado.nextInt();
			System.out.print("indique cantidad de terminos:");
			TablaMultiplicar ta = new TablaMultiplicar(tabla, teclado.nextInt());
			ta.imprimir();
		} else System.out.println("Debe indicar 1 o 2");
		System.out.println("=== Programa Finalizado ===");
	}

}
