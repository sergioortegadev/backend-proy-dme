import java.util.Scanner;

public class Promedio {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		float suma=0;
		int cant=0;
		float valor;
		
		do {
			System.out.print("Ingrese un valor, o cero para finalizar: ");
			valor = teclado.nextFloat();
			if(valor!=0) {
				suma += valor;
				cant ++ ;
			}
		} while (valor!=0);
		
		if (cant!=0) {
			float promedio = suma / cant;
			System.out.println("El promedio de los valores ingresados es: " + promedio);
		}	else System.out.println("No se ingresaros valores");
		
		
		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
