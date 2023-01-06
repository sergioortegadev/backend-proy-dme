import java.util.Scanner;

public class Perimetro {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
			
		float lado, perimetro;
		
		System.out.print("Ingresar longitud del lado : ");
		lado=teclado.nextFloat();
				
		perimetro=lado*4;
				
		System.out.println("El prerimetro del cuadrado es de : " + perimetro);
		System.out.print("- - - FIN del programa - - - ");
	}

}
