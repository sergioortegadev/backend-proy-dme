import java.util.Scanner;

public class EmpleadosPlanta {
	private Scanner teclado;
	private String relacion;
	private String nombre;
	private int sueldo;
	
	public void inicializar(String x) {
		relacion = x;
		teclado = new Scanner(System.in);
		System.out.print("Ingresar Nombre y Apellido: ");
		nombre = teclado.nextLine();
		System.out.print("Ingresar sueldo: ");
		sueldo = teclado.nextInt(); 
		teclado.nextLine();
		teclado.close();
	}
	public void imprimirDatos() {
		System.out.println(" - - - DATOS - - - ");
		System.out.println("Nombre y Apellido: "+nombre);
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Relación con la empresa: "+relacion);
	}
	public void pagaImpuesto() {
		System.out.println(" - - - Impuesto - - - ");
		if (sueldo>3000) System.out.println("Paga impuesto");
		else System.out.println("No paga impuesto");
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sel;
		System.out.println(" === Inicio Programa === ");
		System.out.println("Bienvenido");
		
		do {
				System.out.println("Seleccione el tipo de empleado a cargar:");
				System.out.println("1 - Planta Permanente ");
				System.out.println("2 - Contratado");
				sel = teclado.nextInt(); 
				if (sel==1) {
					EmpleadosPlanta empleadosPlanta = new EmpleadosPlanta();
					empleadosPlanta.inicializar("Planta Permanente");
					empleadosPlanta.imprimirDatos();
					empleadosPlanta.pagaImpuesto();
				}	else {
					if (sel==2) {
						EmpleadosPlanta empleadosContrato = new EmpleadosPlanta();
						empleadosContrato.inicializar("Contratado");
						empleadosContrato.imprimirDatos();
						empleadosContrato.pagaImpuesto();
					}	else {
						System.out.println("Debe ingresar '1' o '2'");
					}
				}	
			}	while (sel !=1 ||sel !=2);



		teclado.close();
		System.out.println(" === Programa Finalizado === "); 
	}
}
