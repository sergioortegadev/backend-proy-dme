import java.util.Scanner;

public class RangoVariacion {

	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3;

		System.out.print("Ingrese primer numero: ");
		n1=teclado.nextInt();
		System.out.print("Ingrese segundo numero: ");
		n2=teclado.nextInt();
		System.out.print("Ingrese tercer numero: ");
		n3=teclado.nextInt();
		
		if(n1==n2 || n2==n3 || n1==n3) {
			System.out.print("ERROR! Deben ser numeros distintos");
		} else {
			if(n2<n1 && n3<n1) {
				if (n2<n3) {
					System.out.println("El Mayor es: "+n1+" | El Menor es: "+n2);
				} else {
					System.out.println("El Mayor es: "+n1+" | El Menor es: "+n3);
				}
			} else {
				if(n1<n2 && n3<n2) {
					if(n1<n3) {
						System.out.println("El Mayor es: "+n2+" | El Menor es: "+n1);
					} else {
						System.out.println("El Mayor es: "+n2+" | El Menor es: "+n3);
					}
				} else {
					if(n1<n2) {
						System.out.println("El Mayor es: "+n3+" | El Menor es: "+n1);
					} else {
						System.out.println("El Mayor es: "+n3+" | El Menor es: "+n2);
					}
				}
			}
		}
		
		
		System.out.print(" - - Programa FINALIZADO! - - ");
	}

}