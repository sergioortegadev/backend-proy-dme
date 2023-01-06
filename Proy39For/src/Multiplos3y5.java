import java.util.Scanner;

public class Multiplos3y5 {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int m3=0, m5=0;
		
		for(int f=1; f<=10; f++) {
			System.out.print(f+" Ingrese el valor: ");
			int valor=teclado.nextInt();
			if (valor%3==0) {
				m3++;
			}
			if (valor%5==0) {
				m5++;
			}
		}
		System.out.println("Cantidad de múltiplos de 3: "+m3);
		System.out.println("Cantidad de múltiplos de 5: "+m5);
		
		
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
