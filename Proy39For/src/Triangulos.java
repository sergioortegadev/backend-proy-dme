import java.util.Scanner;

public class Triangulos {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int n, b, h, tg=0;
		
		System.out.print("Cuantos pares de datos ingresa? ");
		n=teclado.nextInt();
		
		for(int f=1; f<=n; f++) {
			System.out.print("Par "+f+" - Ingrese la base: ");
			b=teclado.nextInt();
			System.out.print("Ingrese la altura: ");
			h=teclado.nextInt();
			
			float s=(float)(b*h)/2;
			System.out.print("La base es: "+b+" - ");
			System.out.print("La altura es: "+h+" - ");
			System.out.println("Y la superficie es: "+s);
			
			if(s>12) {
				tg++;
			}
			
		}
		System.out.println(tg+" Triangulos tienen superficie mayor a 12");
		
		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
