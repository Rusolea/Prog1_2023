
//Con el mismo arreglo del ejercicio anterior informe por pantalla
//cuantos elementos del mismo están por encima del promedio
//calculado.

import java.util.Random;

public class Ej3_1 {
    public static final int MAX = 10, MAXVALOR = 10, MINVALOR = 1;

    public static void main(String[] args) {
        int[] arr = new int[MAX];

        cargar_arreglo_aleatorio_int(arr);
        numerosSobrePromedio(arr);
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

    public static void numerosSobrePromedio(int[] arr) {
        int suma = 0;
        double resultado = 0;

        for (int i = 0; i < MAX; i++) {
            suma += arr[i];
        }
        resultado = suma / MAX;

        System.out.println("El promedio es: " + resultado);
        buscarSisobrePromedio(arr, resultado);
    }

    public static void buscarSisobrePromedio(int[] arr, double resultado) {
        int contador = 0;

        for (int i = 0; i < MAX; i++) {
            if (arr[i] > resultado) {
                contador++;
            }
        }
        System.out.println("La cantidad de elementos por encima del promedio es: " + contador);
    }
    
}
