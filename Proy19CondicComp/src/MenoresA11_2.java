import java.util.Scanner;

public class MenoresA11_2 {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Ingrese primer valor: ");
		n1=teclado.nextInt();
		System.out.print("Segundo valor: ");
		n2=teclado.nextInt();
		System.out.print("Tercer valor: ");
		n3=teclado.nextInt();
		
		if (n1<10 || n2<10 || n3<10) {
			System.out.println("Alguno de los numeros es menor a diez");
		}
		System.out.println("- - - Programa Finalizado - - -");
	}

}
