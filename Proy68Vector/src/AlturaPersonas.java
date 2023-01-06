import java.util.Scanner;

public class AlturaPersonas {
	private Scanner teclado;
	private float [] alturas;
	private float promedio;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		alturas = new float[5];
		for (int f=0; f<5; f++) {
			System.out.print("Ingrese altura: ");
			alturas[f]=teclado.nextFloat();
		}
	}
	public void calcularPromedio() {
		float suma=0;
		for (int f=0; f<5; f++) {
			suma += alturas[f];
		}
		promedio =  suma / 5;
		System.out.println("Promedio de alturas: "+promedio);
	}
	public void mayoreMenores () {
		int may=0, men=0;
		for (int f=0; f<5; f++) {
			if (alturas[f]>promedio) {
				may++;
			} else {
				if (alturas[f]<promedio) {					
					men++;
				}
			}
		}
		System.out.println("La cantidad de personas más altas es: "+may);
		System.out.println("La cantidad de personas más bajas es: "+men);
	}
	
	
	public static void main(String[] args) {
		AlturaPersonas alt = new AlturaPersonas();
		alt.cargar();
		alt.calcularPromedio();
		alt.mayoreMenores();
	
		System.out.println(" === Programa Finalizado === ");
	}
}
