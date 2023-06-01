//24. Se tiene un arreglo de enteros de tamaño 20 de secuencias de
//números entre 1 y 9, separadas por 0. El arreglo está precargado,
//y además empieza y termina con uno o más separadores 0. Hacer
//un programa que permita obtener a través de métodos la posición
//de inicio y la posición de fin de la secuencia ubicada a partir de
//una posición entera ingresada por el usuario. Finalmente, si
//existen imprima por pantalla ambas posiciones obtenidas.

package TP5;

import java.util.Random;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej24 {
    public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr);
        imprimir_arreglo_secuencias_int(arr);
        int numero = obtenerNumeroUsuario();
        obtenerSecuenciaAPartirDePos(arr,  numero);
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

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int obtenerNumeroUsuario() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una posición entre 0 y 19.");
            numero = Integer.valueOf(entrada.readLine());
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static int obtenerIni(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void obtenerSecuenciaAPartirDePos(int[] arr,  int numero) {
        int ini = 0;
        int fin = -1;
        boolean secuenciaEncontrada = false;

        while (ini < MAX && !secuenciaEncontrada) {
            ini = obtenerIni(arr, fin + 1);
            fin = obtenerFin(arr, ini);
            if (numero >= ini && numero <= fin) {
                secuenciaEncontrada = true;
            }
        }

        if (secuenciaEncontrada) {
            System.out.println("La posición ingresada: (" + numero + ") se encuentra en la secuencia con INICIO: "
                    + ini + " y con FIN: " + fin);
        } else {
            System.out.println("La posición ingresada: (" + numero + ") no se encuentra en ninguna secuencia.");
        }
    }


    }

