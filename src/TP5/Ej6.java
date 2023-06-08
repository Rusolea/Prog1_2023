/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//6. Hacer un programa que dado un arreglo de enteros de tamaño 10
//que se encuentra cargado, obtenga la cantidad de números pares
//que tiene y la imprima.

import java.util.Random;
public class Main{
    public static final int MAX = 10, MAXVALOR = 10, MINVALOR = 1;
	public static void main(String[] args) {
	    int[] arr = new int[MAX];
	    cargar_arreglo_aleatorio_int(arr);
	    obtenerNumerosPares(arr);
		
	}
	public static void obtenerNumerosPares(int[] arr){
	    int contador = 0;
	    for(int i = 0; i < MAX; i++){
	       if(arr[i] % 2 == 0){
	           contador++;
	           System.out.print(arr[i] + "|");
	       }
	       
	    }
	    System.out.println();
	    System.out.println("Cantidad de numero pares: " + contador);
	    
	}
	
	 public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
        imprimirArreglo(arr);
    }


    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}
