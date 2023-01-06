import java.util.Scanner;

public class Mayor {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		
		int num1, num2;
		System.out.print("Ingrese el primer valor : ");
		num1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor : ");
		num2=teclado.nextInt();
		
		System.out.print("El valor mayor es: ");
		
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		System.out.println(" - - - FIN del programa - - - ");
	}

}
