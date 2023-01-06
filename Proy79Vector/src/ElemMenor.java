import java.util.Scanner;

public class ElemMenor {
	private Scanner teclado;
	private int[]vec;
	
	public void carga() {
		teclado = new Scanner(System.in);
		int cant;
		System.out.print("Cuantos elementos desea cargar?: ");
		cant=teclado.nextInt();
		vec=new int[cant];
		for(int f=0;f<vec.length;f++) {			
		System.out.print("Ingrese elemento #"+(f+1)+": ");
		vec[f]=teclado.nextInt();
		}
		teclado.close();
	}
	public void imprimir() {
		int menor=vec[0];
		int repite=0;
		for(int f=1; f<vec.length; f++) {
			if(vec[f]<menor) {
				menor=vec[f];
			}	else {
				if(vec[f]==menor) {
					repite=1;
				}
			}
		}
		System.out.println("El menor es: "+menor);
		if(repite==0) System.out.println("No se repite elemento menor");
		else System.out.println("Si se repite elemento menor");
	}
	public static void main(String[] args) {
		System.out.println(" - - - Inicio Programa - - - ");
		ElemMenor em = new ElemMenor();
		em.carga();
		em.imprimir();
		
		System.out.println(" === Programa Finalizado === ");
	}
}
