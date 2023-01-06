import java.util.Scanner;

public class MayoresA1000 {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int n, cantidad = 0;
		
		System.out.print("Cuantos valores va a ingresar?: ");
		n=teclado.nextInt();
		
		for(int f=1; f<=n; f++ ) {
			System.out.print(f+" Ingrese valor: ");
			int valor=teclado.nextInt();
			if(valor>=1000) {
				cantidad++;
			}
		}
		System.out.println(cantidad+" Son mayores a 1000");
		
		
		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
