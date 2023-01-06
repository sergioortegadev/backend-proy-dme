import java.util.Scanner;

public class MayorMenor {
	
	public void cargarValores () {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el primer valor: ");
		int valor1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		int valor2=teclado.nextInt();
		System.out.print("Ingrese el tercer valor: ");
		int valor3=teclado.nextInt();
		teclado.close();
		int mayor = calcularMayor(valor1, valor2, valor3);
		System.out.println("El mayor de los 3 valores es: "+mayor);
		System.out.println("El menor valor es: "+calcularMenor(valor1, valor2, valor3));
	}
	public int calcularMayor(int v1, int v2, int v3) {
		if (v1>v2 && v1>v3) {
			return v1;
		}	else {
			if (v2>v3 ) {
				return v2;
			} else {
				return v3;
			}
		}
	}
	public int calcularMenor (int v1, int v2, int v3) {
		int m;
		if (v1<v2 && v1<v3) {
			m=v1;
		} else {
			if (v2<v1) {
				m=v2;
			} else m=v3;
		}
		return m;
	}
	
	
	public static void main(String[] args) {
		MayorMenor mayor1 = new MayorMenor();
		mayor1.cargarValores();
		
		System.out.println(" === Programa Finalizado === ");
	}
}
