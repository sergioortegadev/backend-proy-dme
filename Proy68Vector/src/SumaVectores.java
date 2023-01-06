import java.util.Scanner;

public class SumaVectores {
	private Scanner teclado;
	private int[] vector1;
	private int[] vector2;
	private int[] vector3;
	
	public void carga() {
		teclado = new Scanner(System.in);
		vector1 = new int [4];
		vector2 = new int [4];
		for (int f=0; f<4; f++) {
			System.out.print("Ingrese valores primer vector: ");
			vector1[f]=teclado.nextInt();
		}
		for (int f=0; f<4; f++) {
			System.out.print("Ingrese valores segundo vector: ");
			vector2[f]=teclado.nextInt();
		}
		teclado.close();
	}

	public void sumarVectores() {
		vector3 = new int [4];
		for (int f=0; f<4; f++) {
			vector3[f] = vector1[f] + vector2[f];
		}
	}
	
	public void imprimirSuma() {
		System.out.print("El vector sumado es: [");
		for (int f=0; f<4; f++) {
			System.out.print(vector3[f]+", ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		System.out.println(" ===  Inicio Programa  === ");
		SumaVectores sv = new SumaVectores();
		sv.carga();
		sv.sumarVectores();
		sv.imprimirSuma();

		System.out.println(" === Programa Finalizado === ");
	}
}
