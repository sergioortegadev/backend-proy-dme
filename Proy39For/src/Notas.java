import java.util.Scanner;

public class Notas {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		
		int a=0, r=0;
		float sa=0, sr=0;
		for (int f=1; f<=10; f++) {
			System.out.print(f+" Ingrese nota: ");
			float nota=teclado.nextFloat();
			if(nota>=7) {
				sa+=nota;
				a++;
			} else {
				r++;
				sr+=nota;
			}
		}
		System.out.print("Los aprobados son: "+a);
		System.out.println(" - Promedio de los aprobados: "+sa/a);
		System.out.print("Los reprobados son: "+r);
		System.out.println(" - Promedio de los reprobados: "+sr/r);
		
		
		System.out.println("- - - - Programa Finalizado - - - -");
	}

}
