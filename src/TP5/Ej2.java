//Hacer un programa que dado un arreglo ya cargado con 10
//enteros, calcule el promedio y lo muestre por la consola.

import java.util.Random;

public class Ej2_1 {

    public static final int MAX = 10, MAXVALOR = 10, MINVALOR = 1;

    public static void main(String[] args) {
        int[] arr = new int[MAX];

        cargar_arreglo_aleatorio_int(arr);
        calcularPromedio(arr);
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
    public static void calcularPromedio(int[] arr) {
        int suma = 0;
        int resultado = 0;

        for (int i = 0; i < MAX; i++) {
            suma += arr[i];
        }
        resultado = suma / MAX;
        System.out.print("El promedio es: " + resultado);
    }

}
