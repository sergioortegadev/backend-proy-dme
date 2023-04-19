import java.util.Scanner;

public class PruebaString {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void main(String[] args) {
		System.out.println();
		System.out.println(ANSI_YELLOW_BACKGROUND+"-- Inicio Prueba String --"+ANSI_RESET);
		Scanner teclado=new Scanner(System.in);
		String cad1, cad2;
		System.out.print(ANSI_RESET+"Ingrese primer cadena : "+ANSI_YELLOW);
		cad1=teclado.nextLine();
		System.out.print(ANSI_RESET+"Ingrese segunda cadena : "+ANSI_YELLOW);
		cad2=teclado.nextLine();
		System.out.println(ANSI_RESET);
		if (cad1.equals(cad2)) {
			System.out.println(ANSI_GREEN_BACKGROUND + "<< Ambas cadenas son iguales>>" + ANSI_RESET);
			System.out.println("  usando metodo "+ANSI_CYAN+" equals()"+ANSI_RESET);
		} else {
			System.out.println(ANSI_RED_BACKGROUND+">> Las cadenas difieren <<"+ANSI_RESET);
			System.out.println("  `"+ANSI_YELLOW+cad1+ANSI_RESET+"` es distinto de: `"+ANSI_YELLOW+cad2+ANSI_RESET+"`");
			System.out.println("  usando metodo "+ANSI_CYAN+" equals()"+ANSI_RESET);
		}
		System.out.println();
		if (cad1.equalsIgnoreCase(cad2)) {
			System.out.println("Si ignoramos mayus. y minus. "+ANSI_GREEN+" <<Cadenas Iguales>> "+ANSI_RESET);
			System.out.println("  usando metodo "+ANSI_CYAN+" equalsIgnoreCase()"+ANSI_RESET);
		}
		System.out.println();
		if (cad1.compareTo(cad2)==0) {
			System.out.println(ANSI_GREEN+"Y tambien son iguales,"+ANSI_RESET);
			System.out.println("  usando metodo "+ANSI_CYAN+"compareTo()"+ANSI_RESET);
		} else {
			if (cad1.compareTo(cad2)>0) {
				System.out.println("`"+ANSI_YELLOW+cad1+ANSI_RESET+"` es mayor alfabeticamente que: `"+ANSI_YELLOW+cad2+ANSI_RESET+"`");
				System.out.println("  usando metodo "+ANSI_CYAN+" comparteTo()"+ANSI_RESET);
			} else {
				System.out.println("`"+ANSI_YELLOW+cad1+ANSI_RESET+"` es menor alfabeticamente que: `"+ANSI_YELLOW+cad2+ANSI_RESET+"`");
				System.out.println("  usando metodo "+ANSI_CYAN+" comparteTo()"+ANSI_RESET);
			}
		}
		System.out.println();
		System.out.println("El tercer caracter de la cadena `"+cad1+"` es: `"+ANSI_YELLOW+cad1.charAt(2)+ANSI_RESET+"`");
		System.out.println("  y el ultimo es: `"+ANSI_YELLOW+ cad1.charAt(cad1.length()-1) +ANSI_RESET+"`");
		System.out.println("  usando metodo "+ANSI_CYAN+" charAt(2) y length()"+ANSI_RESET);
		System.out.println();
		System.out.println("El largo de la primer cadena es de: "+ANSI_GREEN+cad1.length()+" caracteres."+ANSI_RESET);
		System.out.println();
		System.out.println("Los primeros "+ANSI_RED+"tres"+ANSI_RESET+" caracteres de `"+ANSI_YELLOW+cad1+ANSI_RESET+"` son : `"+ANSI_YELLOW+cad1.substring(0, 3)+ANSI_RESET+"`");
		System.out.println("  usando metodo "+ANSI_CYAN+" substring()"+ANSI_RESET);
		System.out.println();
		if (cad1.indexOf(cad2)==-1) {
			System.out.println("`"+ANSI_YELLOW+cad2+ANSI_RESET+"` NO esta contenido en `"+ANSI_YELLOW+cad1+ANSI_RESET+"`");
		} else {
			System.out.println("`"+ANSI_YELLOW+cad2+ANSI_RESET+"` SI esta contenido en `"+ANSI_YELLOW+cad1+ANSI_RESET+"`");
		}
		System.out.println("  usando metodo "+ANSI_CYAN+" indexOf()"+ANSI_RESET);
		System.out.println();
		System.out.println("`"+ANSI_YELLOW+cad1+ANSI_RESET+"` Lo llevo a MAYUSCULAS => `"+ANSI_YELLOW+cad1.toUpperCase()+ANSI_RESET+"`");
		System.out.println("  usando metodo "+ANSI_CYAN+" toUpperCase()"+ANSI_RESET);
		System.out.println();
		System.out.println("`"+ANSI_YELLOW+cad2+ANSI_RESET+"` Lo llevo a MINUSCULAS => `"+ANSI_YELLOW+cad2.toLowerCase()+ANSI_RESET+"`");
		System.out.println("  usando metodo "+ANSI_CYAN+" toLowerCase()"+ANSI_RESET);
		System.out.println();
		teclado.close();
		System.out.println(ANSI_YELLOW_BACKGROUND+ANSI_BLACK+"=== Programa Finalizado ==="+ANSI_RESET);
		System.out.println();
	}

}
