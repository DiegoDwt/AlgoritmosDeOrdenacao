package RelatorioTecnico;

public class SelectionSort {
	
	    static int[] selectionSort(int arr[], int n) {
	        int i, j, min_idx;
	        int comparisons = 0;
	        int swaps = 0;
	        for (i = 0; i < n - 1; i++) {
	            min_idx = i;
	            for (j = i + 1; j < n; j++) {
	                comparisons++;       // Contador de Comparações
	                if (arr[j] < arr[min_idx]) {
	                    min_idx = j;
	                }
	            }
	            if (min_idx != i) {
	                int temp = arr[min_idx];
	                arr[min_idx] = arr[i];
	                arr[i] = temp;
	                swaps++;          // Contador de Trocas
	            }
	        }
	        return new int[]{comparisons, swaps};
	    }
}
