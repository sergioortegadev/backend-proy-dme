import java.util.Scanner;

public class SueldosAltosBajos {
	public static void main(String[]ar) {
	Scanner teclado=new Scanner(System.in);
	
	int n, x=1, a=0, b=0, g=0, s;
	
	System.out.print("Cuantos empleados va a ingresar?: ");
	n=teclado.nextInt();
	while (x<=n) {
		System.out.print("Ingrese sueldo del empleado n"+x+" : ");
		s=teclado.nextInt();
		if(s<=300) {
			b++;
		} else {
			a++;
		}
		g= g+s;
		x++;
	}
	System.out.println(b+" Cobran entre $100 y $300");
	System.out.println(a+" Cobran mas de $300");
	System.out.println("El gasto total en sueldos es de: $"+g);
		
	System.out.println("- - - - Programa Finalizado - - - -");
	}
}
