import java.util.Scanner;

public class Condic1 {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		float num1, num2;
		
		System.out.print("Ingrese primer numero : ");
		num1=teclado.nextFloat();
		System.out.print("Ingrese segundo numero : ");
		num2=teclado.nextFloat();
		
		if (num1>num2) {
			float suma, resta;
			suma=num1+num2;
			resta=num1-num2;
			System.out.println("La SUMA es: "+suma);
			System.out.println("La DIFERENCIA es: "+resta);
		} else {
			float producto, division;
			producto=num1*num2;
			division=num1/num2;
			System.out.println("El PRODUCTO es: "+producto);
			System.out.println("La DIVISION es: "+division);
		}
		System.out.print(" - - FIN del Programa - - ");
	}

}
