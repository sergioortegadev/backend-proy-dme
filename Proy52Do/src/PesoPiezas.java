import java.util.Scanner;

public class PesoPiezas {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		int cant1=0, cant2=0, cant3=0;
		float peso;
		
		do {
			System.out.print("Ingrese el peso de la pieza (Exit con 0): ");
			peso = teclado.nextFloat();
			
			if (peso >10.2) {
					cant1++;
			} 	else {
					if(peso>=9.8) {
						cant2++;
					}	else {
							if(peso>0) cant3++;
					}
			}
		} while (peso!=0);
		
		int suma=cant1+cant2+cant3;
		System.out.println("Cantidad total de piezas procesadas: " + suma);
		System.out.println("Cantidad de piezas con peso mayor a 10,2: "+ cant1);
		System.out.println("Cantidad de piezas con peso entre a 9,8 y 10,2: "+ cant2);
		System.out.println("Cantidad de piezas con peso menor a 9,8: "+ cant3);

		
		

		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
