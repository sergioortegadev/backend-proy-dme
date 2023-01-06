import java.util.Scanner;

public class Operaciones {
	private Scanner teclado;
	private float valor1, valor2;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el primer valor: ");
		valor1 = teclado.nextFloat();
		System.out.print("Ingrese el segundo valor: ");
		valor2 = teclado.nextFloat();
		teclado.close();
	}
	public float sumar() {
		return valor1 + valor2;
	}
	public float restar() {
		return valor1 - valor2;
	}
	public void multiplicar() {
		float multiplicacion = valor1 * valor2;
		System.out.println("La multiplicación es: " + multiplicacion);
	}
	public void dividir() {
		float division = valor1 / valor2;
		System.out.println("La division es: " + division);
	}
	public static void main(String[] args) {
		System.out.println(" === Inicio Programa === ");
		Operaciones operaciones1 = new Operaciones();
		operaciones1.inicializar();
		System.out.println("La suma es: "+ operaciones1.sumar() );
		System.out.println("La resta es: "+ operaciones1.restar() );
		operaciones1.multiplicar();
		operaciones1.dividir();
		System.out.println(" === Programa Finalizado === ");
	}
}
