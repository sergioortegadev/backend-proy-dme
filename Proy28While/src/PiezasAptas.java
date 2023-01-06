import java.util.Scanner;

public class PiezasAptas {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int x, cantidad, n;
		float largo;
		
		x=1;
		cantidad=0;
		
		System.out.print("Ingrese cantidad de piezas a procesar: ");
		n=teclado.nextInt();
		
		while (x<=n) {
			System.out.print(x+" - Ingrese largo de la pieza: ");
			largo=teclado.nextFloat();
			
			if(largo>=1.2 && largo<=1.3) {
				cantidad++;
			}
			x++;
		}
		System.out.println(cantidad+" son las piezas APTAS!");
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
