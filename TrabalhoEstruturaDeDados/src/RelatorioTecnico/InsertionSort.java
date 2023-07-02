package RelatorioTecnico;

public class InsertionSort {
	
	    static int[] insertionSort(int arr[], int n) {
	        int i, j, key;
	        int comparisons = 0;
	        int swaps = 0;
	        for (i = 1; i < n; i++) {
	            key = arr[i];
	            j = i - 1;
	            comparisons++;         // Contador de Comparações
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	                swaps++;
	                comparisons++;
	            }
	            arr[j + 1] = key;
	            swaps++;              // Contador de Trocas
	        }
	        return new int[]{comparisons, swaps};
	    }
}
