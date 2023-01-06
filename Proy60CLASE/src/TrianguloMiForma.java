import java.util.Scanner;

public class TrianguloMiForma {
	private int lado1,lado2,lado3;
	Scanner teclado;
	
	public void inicializar() {
		System.out.println("=== Comienzo ===");
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
		if (lado1 >= lado2) {
			if (lado1!=lado2){
				if (lado1>=lado3) {
					if (lado1!=lado3) {
						System.out.println("Lado 1 es el mayor");
					}	else {
						System.out.println("Lado 1 y lado 3 son los mayores");
					}
				}	else {
					System.out.println("Lado 3 es el mayor");
				}
			}	else {
				if (lado1>=lado3) {
					if (lado1!=lado3) {
						System.out.println("Lado 1 y lado 2 son los mayores");
					}	else {
						System.out.println("Lado 1 lado 2 y lado 3 miden igual");
					}
				}	else {
					System.out.println("Lado 3 es el mayor");
				}
			}
		}	else {
			if (lado2>=lado3) {
				if (lado2!=lado3) {
					System.out.println("Lado 2 es el mayor");
				}	else {
					System.out.println("Lado 2 y lado 3 son los mayores");					
				}
			}	else {
				System.out.println("Lado 3 es el mayor");
			}
		}
	}
	
	public void esEquilatero() {
		if (lado1==lado2 && lado2==lado3) System.out.println("Triangulo EQUILATERO");
		else {
			if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
				System.out.println("Triangulo ISOSCELES");
			}	else {
				System.out.println("Triangulo Escaleno");				
			}
		}
	}
	
	public static void main(String[] args) {
		TrianguloMiForma trianguloMi = new TrianguloMiForma();
		trianguloMi.inicializar();
		trianguloMi.ladoMayor();
		trianguloMi.esEquilatero();
		
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
