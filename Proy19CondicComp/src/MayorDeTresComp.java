import java.util.Scanner;

public class MayorDeTresComp {

	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3;

		System.out.print("Ingrese primer numero: ");
		n1=teclado.nextInt();
		System.out.print("Ingrese segundo numero: ");
		n2=teclado.nextInt();
		System.out.print("Ingrese tercer numero: ");
		n3=teclado.nextInt();
		
		if (n1>n2 && n1>n3) {
				System.out.println(n1+" Es el MAYOR");
		} else {
			if (n2>n3) {
				System.out.println(n2+" Es el MAYOR");
			} else {
				System.out.println(n3+" Es el MAYOR");
			}
		} 
		System.out.print(" - - Programa FINALIZADO! - - ");
	}

}