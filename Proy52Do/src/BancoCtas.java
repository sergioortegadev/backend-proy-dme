import java.util.Scanner;

public class BancoCtas {
	public static void main(String[]ar) {
	
		Scanner teclado = new Scanner(System.in);
		
		int cta, saldo, suma=0;
		
		do {
			System.out.print("Ingrese numero de cuenta (EXIT con negativo): ");
			cta=teclado.nextInt();
			if (cta>=0) {
				System.out.print("Ingrese saldo de la cuenta: ");
				saldo=teclado.nextInt();
				if (saldo>0) {
					System.out.println("La cuenta #"+ cta +" tiene saldo Acreedor");
					suma+=saldo;
				}	else {
					if (saldo==0) {
						System.out.println("La cuenta #"+ cta +" tiene saldo Nulo");
					} 	else System.out.println("La cuenta #"+ cta +" tiene saldo Deudor");
				}				
			}			
		} while(cta>=0);
		
		System.out.print("La suma de los saldos acreedores es de: "+suma);
		
		teclado.close();
		System.out.println("- - - - Programa Finalizado - - - -");
	}
}
