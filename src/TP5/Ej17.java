//Hacer un programa que devuelva la posición de inicio y fin de la
//anteúltima secuencia de números distintos de ceros.

import java.util.Random;

public class Ej17_1 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static final int MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr);
        imprimirSecuencia(arr);
        posicionSecuencia(arr);
    }
    public static void posicionSecuencia(int[] arr) {

        int fin = 0;
        int ini = MAX;
        int contador = 0;

        while (ini > 0) {
            fin = buscarFin(arr, ini - 1);
            if (fin > 0) {
                ini = buscarIni(arr, fin);
                contador++;
                if (contador == 2) {
                    imprimirPosiciones(arr, ini, fin);
                }
            }
        }
    }

    public static void cargar_arreglo_aleatorio_secuencias_int(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > probabilidad_numero) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos > 0 && arr[pos] != SEPARADOR) {
            pos--;
        }
        return pos + 1;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos > 0 && arr[pos] == SEPARADOR) {
            pos--;
        }
        return pos;
    }

    public static void imprimirSecuencia(int[] arr) {
        System.out.println("La secuancia es: ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void imprimirPosiciones(int[] arr, int ini, int fin) {
        System.out.println("La posicion de inicio  es: " + ini + " y la posicion de fin es: " + fin);

    }
}
