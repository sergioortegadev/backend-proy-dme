import java.util.Scanner;

public class SueldosEmpleados {
	private Scanner teclado;
	private int[] sueldos;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		sueldos=new int[5];
		for(int f=0; f<5; f++) {
			System.out.print("Ingrese sueldo: ");
			sueldos[f] = teclado.nextInt();
		}
	}
	public void imprimir() {
		System.out.print("[");
		for(int f=0; f<5; f++) {
			System.out.print(sueldos[f]+", ");
		}
		System.out.println("]");
	}
	

	public static void main(String[] args) {
		SueldosEmpleados sueldos1 = new SueldosEmpleados();
		sueldos1.cargar();
		sueldos1.imprimir();
		
		System.out.println(" === Programa Finalizado === ");
	}
}
