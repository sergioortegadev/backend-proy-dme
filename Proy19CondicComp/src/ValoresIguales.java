import java.util.Scanner;

public class ValoresIguales {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Ingrese primer valor: ");
		n1=teclado.nextInt();
		System.out.print("Segundo valor: ");
		n2=teclado.nextInt();
		System.out.print("Tercer valor: ");
		n3=teclado.nextInt();
		
		if (n1==n2 && n2==n3) {
			int resultado = n1+n2;
			System.out.println("SON Iguales, la suma es: "+resultado);
			resultado = resultado * n3;			
			System.out.println("el producto es: "+resultado);
		}
		System.out.println("- - - Programa Finalizado - - -");
	}

}
