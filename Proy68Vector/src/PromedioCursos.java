import java.util.Scanner;

public class PromedioCursos {
	private Scanner teclado;
	private float [] curso1, curso2;

	public void carga() {
		teclado = new Scanner(System.in);
		curso1 = new float [5];
		curso2 = new float [5];
		System.out.println("- - Ingresar Notas Curso 1 - - ");
		for(int f=0; f<5; f++) {
			System.out.print("Nota estudiante #"+(f+1)+": ");
			curso1[f] = teclado.nextFloat();
		}
		System.out.println("- - Ingresar Notas Curso 2 - -");
		for(int f=0; f<5; f++) {
			System.out.print("Nota estudiante #"+(f+1)+": ");
			curso2[f] = teclado.nextFloat();
		}
		teclado.close();
	}

	public String prom() {
		float prom1, prom2;
		float suma1=0, suma2=0;
		for (int f=0; f<5; f++) {
			suma1+=curso1[f];
			suma2+=curso2[f];
		}
		prom1=suma1/5;
		prom2=suma2/5;
		if (prom1>prom2) {
			return "Con "+prom1+" El curso 1 obtuvo el mayor promedio general."; 
		}	else {
			if (prom2>prom1) {
				return "Con "+prom2+" El curso 2 obtuvo el mayor promedio general.";
			}	else return "Con "+prom1+" Ambos cursos tienen el mismo promedio";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(" ===  Inicio Programa  === ");
		PromedioCursos pc = new PromedioCursos();
		pc.carga();
		System.out.println(pc.prom());

		System.out.println(" === Programa Finalizado === ");
	}
}
