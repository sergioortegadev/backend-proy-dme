import java.util.Scanner;

public class TablaMultiplicar {
	
	public void cargarValor() {
		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.print("Ingrese valor: ");
			valor=teclado.nextInt();
			if (valor!=-1) {
				calcular(valor);
			}
		}	while (valor!=-1);
		teclado.close();
	}
	public void calcular(int v) {
		for(int f=v; f<=v*10; f=f+v) {
			System.out.print(f+" - ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		TablaMultiplicar tabla = new TablaMultiplicar();
		tabla.cargarValor();
		System.out.println(" === Programa Finalizado === ");
	}
}
