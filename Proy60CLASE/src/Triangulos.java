import java.util.Scanner;

public class Triangulos {
	private int lado1, lado2, lado3;
	Scanner teclado;

	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese lado 1: ");
		lado1=teclado.nextInt();
		System.out.print("Ingrese lado 2: ");
		lado2=teclado.nextInt();
		System.out.print("Ingrese lado 3: ");
		lado3=teclado.nextInt();
		teclado.close();
	}

	public void ladoMayor() {
		System.out.print("Lado mayor del triangulo: ");
		if (lado1>lado2 && lado1>lado3) {
			System.out.print(lado1);
		}	else {
			if (lado2>lado3) {
				System.out.print(lado2);
			}	else {
				System.out.print(lado3);
			}
		}
		System.out.println();
	}
	
	public void esEquilatero() {
		if (lado1==lado2 && lado2==lado3) {
			System.out.println("Es un triangulo EQUILATERO");			
		} 	else System.out.print("No es EQUILATERO");
	}
	
	
	
	public static void main(String[] args) {
		Triangulos triangulo1 = new Triangulos();
		triangulo1.inicializar();
		triangulo1.ladoMayor();
		triangulo1.esEquilatero();
	
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
