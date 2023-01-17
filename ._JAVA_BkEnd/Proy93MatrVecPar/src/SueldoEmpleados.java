import java.util.Scanner;

public class SueldoEmpleados {
	private Scanner teclado;
	private String[] empleados;
	private int[][] sueldos;
	private int[] sueldosTot;
	
	public void carga() {
		teclado=new Scanner(System.in);
		//System.out.print("Cuantos Empleados se cargarán?: ");
		//int cant=teclado.nextInt();
		empleados=new String[4];
		sueldos=new int[4][3];
		
		// En for anidados se cargan datos del vector y matriz paralejos
		for(int f=0;f<empleados.length;f++) {
			System.out.print("Ingrese nombre empleado #"+f+": ");
			empleados[f]=teclado.nextLine();
			for(int c=0;c<sueldos[f].length;c++) {
				System.out.print("Ingrese sueldo "+(c+1)+": $");
				sueldos[f][c]=teclado.nextInt();
			}
			teclado.nextLine();
			if(f!=empleados.length-1)
			System.out.println("- Empleado completo -");
		}
		System.out.println();
		System.out.println("+ Carga datos completa +");
		System.out.println();
		teclado.close();
	}
	
	public void calcularSumaSueldos() {
		sueldosTot=new int[4];
		for(int f=0;f<sueldos.length;f++) {
			int sumaSueldos=0;
			for(int c=0;c<sueldos[0].length;c++) {
				sumaSueldos+=sueldos[f][c];
			}
			sueldosTot[f]=sumaSueldos;
		}
	}
	
	public void imprimir() {
		System.out.println("- Sueldos X trimestre -");
		for(int f=0;f<empleados.length;f++) {
			System.out.println(empleados[f]+" - "+sueldosTot[f]);
		}
		System.out.println();
	}

	public void empleadoMayorSueldo() {
		int maySuel=sueldosTot[0];
		String nomSuel=empleados[0];
		for(int f=1;f<sueldosTot.length;f++) {
			if(sueldosTot[f]>maySuel) {
				maySuel=sueldosTot[f];
				nomSuel=empleados[f];
			}
		}
		System.out.println("El mayor sueldo acumulado mayor es de: $"+maySuel+" y corresponde a: "+nomSuel);
	}

	public static void main(String[] args) {
		System.out.println("-- Inicio Programa SueldoEmpleados --");
		SueldoEmpleados se=new SueldoEmpleados();
		se.carga();
		se.calcularSumaSueldos();
		se.imprimir();
		se.empleadoMayorSueldo();
		System.out.println("=== Programa Finalizado ===");
	}
}
