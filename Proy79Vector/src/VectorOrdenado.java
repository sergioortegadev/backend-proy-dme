import java.util.Scanner;

public class VectorOrdenado {
	private Scanner teclado;
	private int [] sueldos;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		int n;
		System.out.print("Cuantos sueldos desea cargar?: ");
		n=teclado.nextInt();
		sueldos=new int [n];
		for(int f=0; f<sueldos.length; f++) {
			System.out.print("Ingrese sueldo #"+(f+1)+": ");
			sueldos[f]=teclado.nextInt();
		}
		teclado.close();
	}
	public void ordenar() {
		for (int k=0; k<(sueldos.length-1);k++) {
			for(int f=0;f<(sueldos.length-1);f++) {
				if (sueldos[f]>sueldos[f+1]) {
					int aux = sueldos[f];
					sueldos[f]=sueldos[f+1];
					sueldos[f+1]=aux;
				}
			}
		}
	}
	public void imprimir () {
		System.out.println("-Sueldos ordenados de menor a mayor-");
		System.out.print("[ ");
		for(int f=0;f<sueldos.length;f++) {
			System.out.print(sueldos[f]+", ");
		}
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		System.out.println(" - - - Inicio Programa - - - ");
		VectorOrdenado vo = new VectorOrdenado();
		vo.cargar();
		vo.ordenar();
		vo.imprimir();
		System.out.println(" === Programa Finalizado === ");

	}

}
