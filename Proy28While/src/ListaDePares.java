import java.util.Scanner;

public class ListaDePares {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int n, v, p=0, i=0, x=1;
		
		System.out.print("Ingrese cantidad de valores: ");
		n=teclado.nextInt();
		while(x<=n) {
			System.out.print(x+" - Ingrese valores: ");
			v=teclado.nextInt();
			
			if(v%2==0) {
				p++;
			} else {
				i++;
			}
			x++;
		}
		System.out.println(p+" Valores son pares, y "+i+" Valores son impares");
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
