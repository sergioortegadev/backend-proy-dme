import java.util.Scanner;

public class Vector8 {
	private Scanner teclado;
	private int [] vector;
	
	public void carga() {
		teclado = new Scanner(System.in);
		vector = new int [8];
		for(int f=0; f<8; f++) {
			System.out.print("Ingresar valor: ");
			vector[f]=teclado.nextInt();
		}
	}
	public int todosEl() {
		int suma=0;
		for(int f=0; f<8; f++) {
			suma+=vector[f];
		}
		return suma;
	}
	public int elemM36() {
		int suma=0;
		for(int f=0; f<8; f++) {
			if(vector[f]>36) {
				suma+=vector[f];
			}
		}
		return suma;
	}
	public int contEl50() {
		int cont=0;
		for(int f=0; f<8; f++) {
			if (vector[f]>50) {
				cont++;
			}
		}
		return cont;
	}	
	public static void main(String[] args) {
		System.out.println(" ===  Inicio Programa  === ");
		Vector8 v8 = new Vector8();
		v8.carga();
		System.out.println("Valor todos los elementos: "+v8.todosEl());
		System.out.println("Valor acum elementos mayores a 36: "+v8.elemM36());
		System.out.println(v8.contEl50()+" elementos son mayores a 50");
		System.out.println(" === Programa Finalizado === ");

	}

}
