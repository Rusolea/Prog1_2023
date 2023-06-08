//Hacer un programa que dado un arreglo de caracteres de tamaño
//10 que se encuentra cargado, invierta el orden del contenido. Este
//intercambio no se debe realizar de manera explícita, hay que
//hacer un método que incluya una iteración de intercambio.
import java.util.Random;
public class Main{
    public static final int MAX = 10, MAXVALOR = 10, MINVALOR = 1;
	public static void main(String[] args) {
	    int[] arr = new int[MAX];
	    cargar_arreglo_aleatorio_int(arr);
	    invertirContenido(arr);
		
	}
	public static void invertirContenido(int[] arr){
	    int j = MAX-1;
	    for(int i = 0; i < MAX/2; i++){
	        int aux = arr[i];
	        arr[i] = arr[j];
	        arr[j] = aux;
	 
	        j--;
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
