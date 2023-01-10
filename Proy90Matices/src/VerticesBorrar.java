import java.util.Scanner;

public class VerticesBorrar {

    private Scanner tecleo;
    private int[][] matriz;
    private int dato = 1;

    public void pedirDatos() {
        tecleo = new Scanner(System.in);
        System.out.print("Número de filas:");
        int filas = tecleo.nextInt();
        System.out.print("Número de columnas:");
        int columnas = tecleo.nextInt();
        matriz = new int[filas][columnas];
    }

    public void llenarMatriz() {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = dato;
                dato++;
            }
        }
    }

    public void imprimirMatrizEntera() {
        System.out.println("Matriz entera: ");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print("[" + matriz[f][c] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void imprimirVertices() {
        System.out.println("Sólo vértices: ");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (f == 0 && c == 0
                        || f == 0 && c == matriz[f].length - 1
                        || f == matriz.length - 1 && c == 0
                        || f == matriz.length - 1 && c == matriz[f].length - 1) {
                    System.out.print("[" + matriz[f][c] + "]");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
    	System.out.println(" - - Inicio Programa VerticesBorrar - - ");
    	System.out.println(" - Esta matriz se llena sola - ");
    	VerticesBorrar mtrz = new VerticesBorrar();
        mtrz.pedirDatos();
        mtrz.llenarMatriz();
        mtrz.imprimirMatrizEntera();
        mtrz.imprimirVertices();
        System.out.println(" = = Programa Finalizado = = ");
    }
}