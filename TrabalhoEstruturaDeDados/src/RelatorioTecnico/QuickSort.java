package RelatorioTecnico;

public class QuickSort {
	
	
	    private static int[] array;
	    private static int comparisons;
	    private static int swaps;

	    public static int[] quickSort(int[] arr, int length) {
	        array = arr;
	        comparisons = 0;
	        swaps = 0;
	        quickSortHelper(0, length - 1);
	        return new int[] { comparisons, swaps };
	    }

	    private static void quickSortHelper(int low, int high) {
	        while (low < high) {
	            int pivotIndex = partition(low, high);

	            if (pivotIndex - low < high - pivotIndex) {
	                quickSortHelper(low, pivotIndex - 1);
	                low = pivotIndex + 1;
	            } else {
	                quickSortHelper(pivotIndex + 1, high);
	                high = pivotIndex - 1;
	            }
	        }
	    }

	    private static int partition(int low, int high) {
	        int pivot = array[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            comparisons++;            // Contador de Comparações
	            if (array[j] < pivot) {
	                i++;
	                swap(i, j);
	            }
	        }

	        swap(i + 1, high);
	        return i + 1;
	    }

	    private static void swap(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        swaps++;             // Contador de Trocas
	    }


}
