import java.util.Scanner;

public class SumaPromedio {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		
		int x, suma, valor;
		float promedio;
		x=1;
		suma=0;
		
		while(x<=10) {
			System.out.print(x+" - Ingrese el valor: ");
			valor=teclado.nextInt();
			suma+=valor;
			x++;
		}
		promedio=(float)suma/10;
		System.out.println("La suma de los 10 valores es: "+suma);
		System.out.println("El promedio de los 10 valores es: "+promedio);
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
