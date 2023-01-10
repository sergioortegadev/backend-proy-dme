import java.util.Scanner;

public class MatrixVertices {
	private Scanner teclado;
	private int[][] matrix;
	
	public void carga() {
		teclado=new Scanner(System.in);
		System.out.print("Indique cant filas :");
		int fil=teclado.nextInt();
		System.out.print("Indique cant columnas :");
		int col=teclado.nextInt();
		matrix=new int[fil][col];
		System.out.println("Matriz de "+fil+" por "+col);
		for(int f=0; f<matrix.length;f++) {
			for(int c=0;c<matrix[f].length;c++) {
				System.out.print("Ingrese valor para F"+f+" C"+c+": ");
				matrix[f][c]=teclado.nextInt();
			}
			if(f<matrix.length-1) {				
				System.out.println(" - Fila completa -");
			}
		}
		System.out.println(" / / Matriz completa / / ");
		teclado.close();
		System.out.println();
	}

	public void imprimir4() {
		System.out.println("["+matrix[0][0]+" - "+matrix[0][matrix[0].length-1]+" ]");
		System.out.println("["+matrix[matrix.length-1][0]+" - "+matrix[matrix.length-1][matrix[matrix.length-1].length-1]+" ]");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println(" - - Inicio Programa MatrixVertices - - ");
		MatrixVertices mv = new MatrixVertices();
		mv.carga();
		mv.imprimir4();
		System.out.println("=== Programa Finalizado ===");

	}

}
