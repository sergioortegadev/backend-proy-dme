import java.util.Scanner;

public class Cuadrado {
	private float lado;
	private Scanner teclado;
	public void inicializar() {
		System.out.println(" === Inicio Programa === "); 
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el valor del lado: ");
		lado = teclado.nextFloat();
		teclado.close();
	}
	public void imprimirPerimetro() {
		float perimetro = lado * 4;
		System.out.println("El perímetro del cuadrado es: "+perimetro);
	}
	public void imprimirSuperficie() {
		float superficie = lado * lado;
		System.out.println("La superficie del cuadrado es: "+superficie);
	}	
	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.inicializar();
		cuadrado1.imprimirPerimetro();
		cuadrado1.imprimirSuperficie();
		System.out.println(" === Programa Finalizado === "); 
	}
}
