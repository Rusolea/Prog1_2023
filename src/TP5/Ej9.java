//9. Hacer un programa que dado un arreglo de enteros de tamaño 10
//que se encuentra cargado, solicite al usuario un número entero y
//lo agregue al principio del arreglo (posición 0). Para ello tendrá
//que realizar un corrimiento a derecha (se pierde el último valor del
//arreglo) y colocar el número en el arreglo en la posición indicada.

import java.util.Random;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ej9_v1 {
    public static final int MAX = 10, MAXVALOR = 10, MINVALOR = 1, POSICION = 0;

    public static void main(String[] args) {
        int[] arr = new int[MAX];

        cargar_arreglo_aleatorio_int(arr);
        corrimientoColocarNumero(arr);

    }

    public static void corrimientoColocarNumero(int[] arr) {
        int numero = solicitarNumero();
        corrimientoDerecha(arr, numero);

    }

    public static void corrimientoDerecha(int[] arr, int pos) {
        int j = MAX - 1;
        for (int i = j; i > POSICION; i--) {
            arr[i] = arr[i - 1];
        }
        arr[POSICION] = pos;
        imprimirArreglo(arr);
    }

    public static int solicitarNumero() {
        int numero = -1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
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
