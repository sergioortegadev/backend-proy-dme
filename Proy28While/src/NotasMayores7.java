import java.util.Scanner;

public class NotasMayores7 {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		
		int a = 0, r = 0, n, x = 1;
		
		while (x<=10) {
			System.out.print("Ingrese nota del estudiante n"+x+" : ");
			n=teclado.nextInt();
			if (n>=7) {
				a++;
			} else {
				r++;
			}
				
			x++;
		}
		System.out.println(a+" estudiantes tienen notas mayores o iguales a 7");
		System.out.println(r+" estudiantes tienen notas menores 7");
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
