import java.util.Scanner;

public class EsNavidad {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int d, m, a;
		
		System.out.print("Escriba la fecha, dia: ");
		d=teclado.nextInt();
		System.out.print("mes: ");
		m=teclado.nextInt();
		System.out.print("año: ");
		a=teclado.nextInt();
		
		if (d==25 && m==12) {
			System.out.println("Es Navidad");
		}
		System.out.println("- - - Programa Finalizado - - -");
	}

}
