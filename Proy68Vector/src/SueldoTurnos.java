import java.util.Scanner;

public class SueldoTurnos {
	private Scanner teclado;
	private float [] turnoMan;
	private float []turnoTar;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		turnoMan= new float[4];
		turnoTar=new float[4];
		
		System.out.println("Ingrese sueldos del turno mañana");
		for(int f=0; f<4; f++) {
			System.out.print("Sueldo: ");
			turnoMan[f]=teclado.nextFloat();
		}
		System.out.println("Ingrese sueldos del turno tarde");
		for(int f=0; f<4; f++) {
			System.out.print("Sueldo: ");
			turnoTar[f]=teclado.nextFloat();
		}
		teclado.close();
	}
	public void calcularGastos() {
		float man=0, tar=0;
		for (int f=0; f<4; f++) {
			man+=turnoMan[f];
			tar+=turnoTar[f];
		}
		System.out.println("Total de gastos en sueldos turno mañana: $"+man);
		System.out.println("Total de gastos en sueldos turno tarde: $"+tar);
	}

	public static void main(String[] args) {
		System.out.println(" ===  Inicio Programa  === ");
		SueldoTurnos tur = new SueldoTurnos();
		tur.cargar();
		tur.calcularGastos();
		System.out.println(" === Programa Finalizado === ");
	}
}
