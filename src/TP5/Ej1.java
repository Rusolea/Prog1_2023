//Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
//de valores entre 1 y 12. Luego mostrar cómo quedó cargado.


//Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
//de valores entre 1 y 12. Luego mostrar cómo quedó cargado.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1_1 {

    public static final int MAX = 15;
    public static final int VALORMIN = 0;
    public static final int VALORMAX = 15;


    public static void main(String[] args) {

        int[] arr = new int[MAX];
        ingresarValores(arr);
        imprimirArreglo(arr);
    }

    public static void ingresarValores(int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int i = 0; i < MAX; i++) {
                System.out.println("Ingrese un valor del 1 al 12 para la posicion " + (i) + ": ");
                int numero = Integer.parseInt(entrada.readLine());

                while (numero < VALORMIN || numero > VALORMAX) {
                    System.out.println("Valor incorrecto. Ingrese un valor del 1 al 12 para la posicion " + (i + 1) + ": ");
                    numero = Integer.parseInt(entrada.readLine());

                }
                arr[i] = numero;

            }

        } catch (Exception e) {
            System.out.print(e);
        }

    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}
