import java.util.Scanner;

public class MatrizDentadaCinco {
	private Scanner teclado;
	private int[][] matrix;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		matrix=new int[5][];
		for(int f=0;f<matrix.length;f++) {
			int columnas=1+f;
			matrix[f]=new int[columnas];
			for(int c=0;c<matrix[f].length; c++) {
				System.out.print("Ingrese valor fila nº"+f+" columna nº"+c+": ");
				matrix[f][c]=teclado.nextInt();
			}
		}
		teclado.close();
		System.out.println();
	}
	public void imprimir() {
		System.out.println("- - Imprimiendo Matriz - -");
		for(int f=0; f<matrix.length;f++) {
			for(int c=0; c<matrix[f].length;c++) {
				System.out.print(matrix[f][c]);
				if(c!=matrix[f].length-1) {
					System.out.print(" - ");
				} else {
					System.out.println("");
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("-- Inicio Programa MatrizDentadaCinco --");
		MatrizDentadaCinco mdc = new MatrizDentadaCinco();
		mdc.cargar();
		mdc.imprimir();		
		System.out.println("=== Programa Finalizado ===");
	}

}
