import java.util.Scanner;

public class PaisesTemp {
	private Scanner teclado;
	private String[] paises;
	private float[][] tempMedia;
	private float[] tempTri;
	
	public void carga() {
		teclado=new Scanner(System.in);
		paises=new String[4];
		tempMedia=new float[4][3];
		System.out.println("- Cargar Paises y temp. mensuales -");
		for(int f=0;f<paises.length;f++) {
			System.out.print("Ingrese País: ");
			paises[f]=teclado.nextLine();
			for(int c=0;c<tempMedia[0].length;c++) {
				System.out.print("Temp. media mes "+(c+1)+" :");
				tempMedia[f][c]=teclado.nextFloat();
			}
			if(f!=paises.length-1) {
				teclado.nextLine();
				System.out.println(" - Pais completo - ");
			}
		}
		teclado.close();
		System.out.println("= Carga completa =");
		System.out.println();
	}

	public void imprimir() {
		System.out.println("- - Paises y Medias Mensuales - -");
		for(int f=0;f<paises.length;f++) {
			System.out.print(" "+paises[f]+":  ");
			for( int c=0;c<tempMedia[0].length;c++) {
				System.out.print(tempMedia[f][c]+"º ");
				if(c!=tempMedia[0].length-1) {
					System.out.print(" - ");
				} else {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	
	public void calcTri() {
		tempTri=new float[4];
		for(int f=0;f<tempMedia.length;f++) {
			float suma=0;
			for(int c=0;c<tempMedia[0].length;c++) {
				suma+=tempMedia[f][c];
			}
			tempTri[f]=suma/3;
		}
	}

	public void imprimirTri() {
		System.out.println("- - Paises y Medias Trimestrales - -");
		for(int f=0;f<paises.length;f++) {
			System.out.println(" "+paises[f]+" - "+tempTri[f]);
		}
		System.out.println();
	}
	
	public void imprimirMay() {
		float may=tempTri[0];
		int pais=0;
		for(int f=0;f<tempTri.length;f++) {
			if (tempTri[f]>may) {
				may=tempTri[f];
				pais=f;
			}
		}
		System.out.println("- - País con mayor media trimestral- -");
		System.out.println(" "+paises[pais]+" con "+may+"º de temp media trimestral.");
	}
	
	public static void main(String[] args) {
		System.out.println("-- Inicio Programa Paises temp media --");
		PaisesTemp pt = new PaisesTemp();
		pt.carga();
		pt.imprimir();
		pt.calcTri();
		pt.imprimirTri();
		pt.imprimirMay();		
		System.out.println("=== Programa Finalizado ===");

	}

}
