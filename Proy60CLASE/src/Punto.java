import java.util.Scanner;

public class Punto {
	private int x,y;
	private Scanner teclado;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println(" === Comienzo === ");
		System.out.print("Ingrese coordenada X: ");
		x=teclado.nextInt();
		System.out.print("Ingrese coordenada Y: ");
		y=teclado.nextInt();
		teclado.close();
	}
	
	public void imprimirCuadrante() {
		if (x>0 && y>0) {
			System.out.println("Se encuentra en el primer cuadrante.");
		}	else {
			if (x<0 && y>0) {
				System.out.println("Se encuentra en el segundo cuadrante.");
			}	else {
				if (x<0 && y<0) {
					System.out.println("Se encuentra en el tercer cuadrante.");
				}	else {
					if (x>0 && y<0) {						
						System.out.println("Se encuentra en el cuarto cuadrante.");
					}	else {
						System.out.println("No esta en un cuadrante");
					}
				}
			}
		}
	}
	
	public static void main (String[] args) {
		Punto punto1 = new Punto();
		punto1.inicializar();
		punto1.imprimirCuadrante();

		System.out.println(" === Programa Finalizado === "); 		
	}
}
