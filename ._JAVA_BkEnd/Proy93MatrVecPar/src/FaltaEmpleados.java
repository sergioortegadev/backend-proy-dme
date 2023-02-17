import java.util.Scanner;

public class FaltaEmpleados {
	private Scanner teclado;
	private String[] empleados;
	private int[][] faltas;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		empleados=new String[3];
		faltas=new int[3][];
	// Ingreso nombres en vector de string paralelo a la matriz de faltas
		for(int f=0;f<empleados.length;f++) {
			System.out.print("Nombre empleado nº"+(f+1)+": ");
			empleados[f]=teclado.nextLine();
	// Consulto cantidad de faltas para definir la cantidad de columnas de la matriz paralela irregular que guardará las fechas de las inasistencias.		
			System.out.print("Cuantas faltas tuvo "+empleados[f]+"?: ");
			int col=teclado.nextInt();
			faltas[f]=new int[col];
				for(int c=0;c<faltas[f].length;c++) {
				System.out.print("ingrese fecha de la falta: ");
				faltas[f][c]=teclado.nextInt();
			}
			teclado.nextLine();
			if(f!=empleados.length-1)
				System.out.println("- Empleado completo -");
		}
		System.out.println();
		System.out.println("+ Carga datos completa +");
		teclado.close();
		System.out.println();
	}
	public void imprimir() {
		System.out.println("- - Empleados y Faltas - -");
		for(int f=0;f<empleados.length;f++) {
			if (faltas[f].length==0) {
				System.out.println(" "+empleados[f]+" No falto.");
			} else {				
				System.out.print(" "+empleados[f]+" falto el/los dias:  ");
			}
			for(int c=0;c<faltas[f].length;c++) {
				System.out.print(faltas[f][c]);
				if(c!=faltas[f].length-1) {
					System.out.print(" - ");
				} else {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	public void emplMenosFaltas() {
		int cantFaltas=faltas[0].length;	
		String emp=empleados[0];
		for(int f=0;f<faltas.length;f++) {
			if(faltas[f].length<cantFaltas) {
					cantFaltas=faltas[f].length;
					emp=empleados[f];
			}
		}
		System.out.println(emp+" falto menos.");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("-- Inicio Programa FaltaEmpleados --");
		FaltaEmpleados fe = new FaltaEmpleados();
		fe.cargar();
		fe.imprimir();
		fe.emplMenosFaltas();
		System.out.println("=== Programa Finalizado ===");
	}

}
