import java.util.Scanner;

public class VectorOrdenEst {
	private Scanner teclado;
	private String[]nombre;
	private float[]nota;
	
	public void carga() {
		teclado = new Scanner(System.in);
		nombre=new String[5];
		nota=new float[5];
		System.out.println(" _ Ingresar Nombres y Notas _");
		for(int f=0; f<nombre.length;f++) {
			System.out.print("  nombre #"+(f+1)+": ");
			nombre[f]=teclado.nextLine();
			System.out.print("  nota #"+(f+1)+": ");
			nota[f]=teclado.nextFloat();
			teclado.nextLine();
		}
		teclado.close();
	}
	public void ordenar() {
		for(int k=0; k<(nota.length-1); k++) {
			for(int f=0; f<((nota.length-1)-k); f++) {
				if(nota[f]<nota[f+1]) {
					float auxNota=nota[f];
					nota[f]=nota[f+1];
					nota[f+1]=auxNota;
					String auxNombre=nombre[f];
					nombre[f]=nombre[f+1];
					nombre[f+1]=auxNombre;
				}
			}
		}
	}
	public void imprimir() {
		System.out.println(" - Listado de notas ordenadas mayor a menor - ");
		System.out.println("   Nombre        -        Nota ");
		for(int f=0; f<nota.length; f++) {
			System.out.print(nota[f]);
			System.out.print("  -  ");
			System.out.println(nombre[f]);
		}
	}

	public static void main(String[] args) {
		System.out.println(" - - - Inicio Programa - - - ");
		VectorOrdenEst voe = new VectorOrdenEst();
		voe.carga();
		voe.ordenar();
		voe.imprimir();		
		System.out.println(" === Programa Finalizado === ");
	}
}
