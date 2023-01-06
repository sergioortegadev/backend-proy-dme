import java.util.Scanner;

public class CuadradoNoVoidMethods {
	private float lado;
	private Scanner teclado;
	public void inicializar() {
		System.out.println(" === Inicio Programa === "); 
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el valor del lado: ");
		lado = teclado.nextFloat();
		teclado.close();
	}
	public float imprimirPerimetro() {
		return   lado * 4;
	}
	public float imprimirSuperficie() {
		return lado * lado;
	}	
	public static void main(String[] args) {
		CuadradoNoVoidMethods cuadrado1 = new CuadradoNoVoidMethods();
		cuadrado1.inicializar();
		System.out.println("El perímetro del cuadrado es: "+ cuadrado1.imprimirPerimetro() );
		System.out.println("La superficie del cuadrado es: "+ cuadrado1.imprimirSuperficie() );
		System.out.println(" === Programa Finalizado === "); 
	}
}
