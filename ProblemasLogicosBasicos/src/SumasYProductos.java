import java.util.Scanner;

public class SumasYProductos {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		
		int num1, num2, num3, num4, suma, producto;
		
		System.out.print("Ingrese primer valor: ");
		num1=teclado.nextInt();
		System.out.print("Ingrese segundo valor: ");
		num2=teclado.nextInt();
		System.out.print("Ingrese segundo tercer: ");
		num3=teclado.nextInt();
		System.out.print("Ingrese segundo cuarto: ");
		num4=teclado.nextInt();
		
		suma=num1+num2;
		producto=num3*num4;
		
		System.out.println("La SUMA del primero y el segundo es: " + suma);
		System.out.println("El PRODUCTO del tercero por el cuarto es: " + producto);
		System.out.print("- - - FIN del programa - - - ");
	}
}
