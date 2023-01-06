import java.util.Scanner;

public class Respuestas {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		
		String candidato;
		int cant, respuestas;
		System.out.print("Nombre del candidato: ");
		candidato=teclado.next();
		System.out.print("Cuantas preguntas se realizaron?: ");
		cant=teclado.nextInt();
		System.out.print("Cuantas respuestas correctas hubo?: ");
		respuestas=teclado.nextInt();
		
		float porc=respuestas*100/cant;
		
		System.out.println(".....................................");
		
		if(porc>=90) {
			System.out.println("Candidato "+candidato+" => Nivel Maximo");
			System.out.println("Porcenaje obtenido: "+(int)(porc)+"%");
		} else {
			if (porc>=75) {
				System.out.println("Candidato "+candidato+" => Nivel Medio");
				System.out.println("Porcenaje obtenido: "+(int)(porc)+"%");
			} else {
				if (porc>=50) {
					System.out.println("Candidato "+candidato+" => Nivel Regular");
					System.out.println("Porcenaje obtenido: "+(int)(porc)+"%");
				} else {
					System.out.println("Candidato "+candidato+" => Fuera de Nivel");
					System.out.println("Porcenaje obtenido: "+(int)(porc)+"%");
				}
			}
		}	
		System.out.print(" - - - Programa FINALIZADO - - - ");	
	}
}
