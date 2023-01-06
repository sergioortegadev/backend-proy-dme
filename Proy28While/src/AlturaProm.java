import java.util.Scanner;
public class AlturaProm {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		
		int n, x=1;
		float a=0;
				
		System.out.print("Cuanta gente va a ingresar?: ");
		n=teclado.nextInt();
		
		while(x<=n) {
			System.out.print("Ingresar altura del sujeto n"+x+" : ");
			a=a+teclado.nextFloat();
			x++;
		}
		float p=(float)a/n;
		System.out.println("El promedio de las alturas de los "+n+" ingresados es de: "+p);
		
		
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
