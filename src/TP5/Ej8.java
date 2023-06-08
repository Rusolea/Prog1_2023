//Implementar un método que realice un corrimiento a izquierda en
//un arreglo ordenado de tamaño MAX=10 a partir de una posición.
import java.util.Random;
public class Ej8_v1 {
    public static final int MAX = 10, MAXVALOR = 10, MINVALOR = 1, POSICION = 5;
    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargar_arreglo_aleatorio_int(arr);
        corrimientoIzquierda(arr);
    }
        public static void corrimientoIzquierda(int[] arr){
            for(int i = POSICION; i < MAX-1; i++){
                arr[i] = arr[i+1];

            }
            imprimirArreglo(arr);
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


