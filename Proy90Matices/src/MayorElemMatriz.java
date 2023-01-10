import java.util.Scanner;

public class MayorElemMatriz {
	private Scanner teclado;
	private int[][] matrix;
	
	public void cargar() {
		teclado =new Scanner(System.in);
		System.out.print("Indicar cant filas: ");
		int fil=teclado.nextInt();
		System.out.print("Indicar cant columnas: ");
		int col=teclado.nextInt();
		System.out.println("Se ingresara matriz de "+fil+" por "+col);
		matrix=new int[fil][col];
		for(int f=0;f<matrix.length;f++) {
			for(int c=0;c<matrix[f].length;c++) {
				System.out.print("ingrese valor para F "+f+" C "+c+" : ");
				matrix[f][c]=teclado.nextInt();
			}
			System.out.println(" - Fila Completa - ");
		}
		System.out.println(" - Matriz Completa - ");
		teclado.close();
	}

	public void ordenarMayor() {
		int may=matrix[0][0];
		int filmay=0;
		int colmay=0;
		for(int f=0;f<matrix.length;f++) {
			for(int c=0;c<matrix[f].length;c++) {
				if(matrix[f][c]>may) {
					may=matrix[f][c];
					filmay=f;
					colmay=c;
				}
			}
		}
		System.out.println("Elem mayor es: "+may);
		System.out.println("Se encuentra en F "+filmay+" C "+colmay);
	}

	public static void main(String[] args) {
		System.out.println(" - - Inicio Programa - - ");
		MayorElemMatriz mem = new MayorElemMatriz();
		mem.cargar();
		mem.ordenarMayor();
		
		System.out.println("=== Programa Finalizado ===");
	}

}
