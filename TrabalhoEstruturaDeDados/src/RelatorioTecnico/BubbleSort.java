package RelatorioTecnico;

public class BubbleSort {

	static int[] bubbleSort(int arr[], int n) {
	        int i, j, temp;
	        boolean swapped;
	        int comparisons = 0;
	        int swaps = 0;
	        for (i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (j = 0; j < n - i - 1; j++) {
	                comparisons++;    // Contador de comparação
	                if (arr[j] > arr[j + 1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                    swaps++;    // Contador de Trocas
	                }
	            }
	            if (swapped == false)
	                break;
	        }
	        return new int[]{comparisons, swaps};  
	    }
	}
