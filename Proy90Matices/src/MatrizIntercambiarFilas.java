import java.util.Scanner;

public class MatrizIntercambiarFilas {
	private Scanner teclado;
	private int[][] matrix;
	
	public void carga() {
		teclado=new Scanner(System.in);
		System.out.print("Indique cant filas: ");
		int fil=teclado.nextInt();
		System.out.print("Indique cant columnas: ");
		int col=teclado.nextInt();
		matrix=new int[fil][col];
		System.out.println("Matriz de "+fil+" por "+col);
		for(int f=0;f<matrix.length;f++) {
			for(int c=0;c<matrix[f].length;c++) {
				System.out.print("Ingrese valor para F"+f+" C"+c+" :");
				matrix[f][c]=teclado.nextInt();
			}
			System.out.println("- Fila completa -");
		}
		System.out.println("= Matriz completa =");
		System.out.println();
		teclado.close();
	}
	
	public void intercambiar() {
		int aux=0;
		for(int c=0;c<matrix[0].length;c++) { 
				aux=matrix[0][c];
				matrix[0][c]=matrix[1][c];
				matrix[1][c]=aux;
		}
	}
	
	public void imprimir() {
		System.out.println(" - - Imprimir MATRIZ - - ");
		for(int f=0;f<matrix.length;f++) {
			System.out.print("[ ");
			for(int c=0;c<matrix[f].length;c++) {
				System.out.print(matrix[f][c]+" - ");
			}
			System.out.println(" ]");
		}
		System.out.println();
	}
	
	public void imprimirMejorado() {
		System.out.println(" - - Imprimir MATRIZ - - ");
		for(int f=0;f<matrix.length;f++) {
			System.out.print(" [ ");
			int c=0;
			do {
				System.out.print(matrix[f][c]);	
				c++;
				if(c<matrix[f].length) {
					System.out.print(", ");
				}
			} while(c<matrix[f].length);
			System.out.println(" ]");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println(" - - Inicio Programa - - ");
		MatrizIntercambiarFilas mif = new MatrizIntercambiarFilas();
		mif.carga();
		mif.imprimirMejorado();
		mif.intercambiar();
		mif.imprimirMejorado();
		System.out.println("=== Programa Finalizado ===");

	}

}
