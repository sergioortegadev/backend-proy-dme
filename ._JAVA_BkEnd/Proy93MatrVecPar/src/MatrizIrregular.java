import java.util.Scanner;

public class MatrizIrregular {
	private Scanner teclado;
	private int[][] matrix;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		System.out.print("Cuántas filas quiere que tenga la matriz?: ");
		int filas=teclado.nextInt();
		matrix=new int[filas][ ];
		for(int f=0; f<matrix.length; f++) {
			System.out.print("Indicar elementos de la fila nº"+f+": ");
			int columnas=teclado.nextInt();
			matrix[f]=new int[columnas];
			for(int c=0; c<matrix[f].length;c++) {
				System.out.print("Ingrese elemento nº"+(c+1)+": ");
				matrix[f][c]=teclado.nextInt();
			}
		}
		teclado.close();
		System.out.println();
	}
	
	public void imprimir() {
		System.out.println("- - Imprimiendo Matriz - -");
		for(int f=0;f<matrix.length;f++) {
			for(int c=0;c<matrix[f].length;c++) {
				System.out.print(matrix[f][c]);
				if(c!=matrix[f].length-1) {
					System.out.print(" - ");
				} else {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		System.out.println("-- Inicio Programa MatrizIrregular --");
		MatrizIrregular mi = new MatrizIrregular();
		mi.cargar();
		mi.imprimir();
				
		System.out.println("=== Programa Finalizado ===");

	}

}
