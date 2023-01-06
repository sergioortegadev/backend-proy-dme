import java.util.Scanner;

public class Sueldos {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int s,a;
		
		System.out.print("Ingrese Sueldo del operario: ");
		s=teclado.nextInt();
		System.out.print("Ingrese Antiguedad: ");
		a=teclado.nextInt();
		
		if(s<500 && a>=10) {
			float nuevoSueldo = s * 1.2f;
			System.out.println("Recibio un Aumento del 20%. Su nuevo sueldo es de: "+nuevoSueldo);
		} else {
			if(s<500 && a<10) {
				float nuevoSueldo = (float)(s * 1.05);
				System.out.println("Recibio un Aumento del 5%. Su nuevo sueldo es de: "+nuevoSueldo);
			} else {
				System.out.println("NO Recibio Aumento. Su sueldo sigue siendo : "+s);
			}
		}
		
		
		System.out.println("- - - Programa Finalizado - - -");
	}
}
