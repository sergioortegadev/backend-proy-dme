import java.util.Scanner;

public class SumaPromedio {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		float num1, num2, num3, num4, suma, promedio;
		
		System.out.print("Ingresar primer valor: ");
		num1=teclado.nextFloat();
		System.out.print("Ingresar segundo valor: ");
		num2=teclado.nextFloat();
		System.out.print("Ingresar tercer valor: ");
		num3=teclado.nextFloat();
		System.out.print("Ingresar cuarto valor: ");
		num4=teclado.nextFloat();
		
		suma=num1+num2+num3+num4;
		promedio=(num1+num2+num3+num4)/4;
		
		System.out.println("La SUMA es : " + suma);
		System.out.println("El PROMEDIO es : " + promedio);
		System.out.print(" - - - - FIN del programa - - - - ");
	}
}
