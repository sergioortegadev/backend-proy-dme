import java.util.Scanner;

public class Coordenadas {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("Ingrese X: ");
		x=teclado.nextInt();
		System.out.print("Ingrese Y: ");
		y=teclado.nextInt();
				
		if(x==0 || y==0) {
			System.out.println("EROOR!: ningun valor puede ser cero");
		} else {
			if(x>0 && y>0) {
				System.out.println("1er Cuadrante");
			} else {
				if(x<0 && y>0) {
					System.out.println("2do Cuadrante");
				} else {
					if(x>0 && y<0) {
						System.out.println("3er Cuadrante");
					} else {
						System.out.println("4to Cuadrante");
					}
				}
			}	
		}		
		System.out.println("- - - Programa Finalizado - - -");
	}
}
