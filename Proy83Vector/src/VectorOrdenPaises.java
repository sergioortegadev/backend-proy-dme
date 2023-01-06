import java.util.Scanner;

public class VectorOrdenPaises {
	private Scanner teclado;
	private String[]pais;
	private int[]pob;
	
	public void carga() {
		teclado=new Scanner(System.in);
		pais=new String[5];
		pob=new int[5];
		for(int f=0;f<pais.length;f++) {
			System.out.print("Nombre del pais #"+(f+1)+": ");
			pais[f]=teclado.nextLine();
			System.out.print("Población del pais #"+(f+1)+": ");
			pob[f]=teclado.nextInt();
			teclado.nextLine();
		}
		teclado.close();
	}
	public void ordenNombre() {
		for(int k=0; k<(pais.length-1);k++) {
			for(int f=0; f<((pais.length-1)-k);f++) {
				if(pais[f].compareTo(pais[f+1])>0) {
					String auxPais = pais[f];
					pais[f] = pais[f+1];
					pais[f+1] = auxPais;
					int auxPob = pob[f];
					pob[f] = pob[f+1];
					pob[f+1] = auxPob;
				}
			}
		}
	}
	public void ordenPoblacion() {
		for(int k=0; k<(pais.length-1);k++) {
			for(int f=0;f<((pais.length-1)-k); f++) {
				if(pob[f] < pob[f+1]) {
					int auxPob = pob[f];
					pob[f] = pob[f+1];
					pob[f+1] = auxPob;
					String auxPais = pais[f];
					pais[f] = pais[f+1];
					pais[f+1] = auxPais;
				}
			}
		}
	}
	public void imprimir() {
		for(int f=0;f<pais.length;f++) {
			System.out.print(pais[f]);
			System.out.print(" - ");
			System.out.println(pob[f]);
		}
		System.out.println("----------------------------");
	}

	
	
	
	public static void main(String[] args) {		
		System.out.println(" - - - Inicio Programa - - - ");
		VectorOrdenPaises vop = new VectorOrdenPaises();
		vop.carga();
		vop.ordenNombre();
		System.out.println();
		System.out.println("Listado ordenado por Nombres");
		vop.imprimir();
		vop.ordenPoblacion();
		System.out.println();
		System.out.println("Listado ordenado por Poblacion");
		vop.imprimir();
		System.out.println(" === Programa Finalizado === ");
	}
}
