import java.util.Scanner;

public class SumaProducto {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		
		int num1, num2, suma, producto;
		
		System.out.print("Ingrese primer valor : ");
		num1=teclado.nextInt();
		System.out.print("Ingrese segundo valor : ");
		num2=teclado.nextInt();
		
		suma=num1+num2;
		producto=num1*num2;
		
		System.out.println("La SUMA es : " + suma);
		System.out.println("El PRODUCTO es : " + producto);
	}

}
