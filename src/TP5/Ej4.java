
//Buscar un elemento en un arreglo de caracteres ya cargado de
//tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
//estar indicarlo también.

import java.util.Random;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ej4_1 {
    public static final int MAX = 10, MAXVALOR = 10, MINVALOR = 1;
    public static final char ELEMENTO = 'a';

    public static void main(String[] args) {
        char[] arr = new char[MAX];

        cargar_arreglo_aleatorio_char(arr);
        buscarElemento(arr);
    }

    public static void buscarElemento(char[] arr) {
        boolean encontrado = false;

        for (int i = 0; i < MAX; i++) {
            if (arr[i] == ELEMENTO) {
                System.out.println("El elemento " + "'" + ELEMENTO + "'" + " fue encontrado en la posicion " + i + ".");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El elemento " + "'" + ELEMENTO + "'" + " no existe en el arreglo.");
        }
    }

    public static void cargar_arreglo_aleatorio_char(char[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (char) (r.nextInt(26) + 'a');
        }
        imprimirArreglo(arr);
    }


    public static void imprimirArreglo(char[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}
