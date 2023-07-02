package RelatorioTecnico;

public class MergeSort {

	    static int comparisons = 0;
	    static int swaps = 0;

	    static int[] mergeSort(int arr[], int n) {
	        comparisons = 0;
	        swaps = 0;
	        mergeSort(arr, 0, n - 1);
	        return new int[]{comparisons, swaps};
	    }

	    static void mergeSort(int arr[], int left, int right) {
	        if (left < right) {
	            int middle = (left + right) / 2;
	            mergeSort(arr, left, middle);
	            mergeSort(arr, middle + 1, right);
	            merge(arr, left, middle, right);
	        }
	    }

	    static void merge(int arr[], int left, int middle, int right) {
	        int n1 = middle - left + 1;
	        int n2 = right - middle;

	        int[] leftArr = new int[n1];
	        int[] rightArr = new int[n2];

	        for (int i = 0; i < n1; ++i) {
	            leftArr[i] = arr[left + i];
	        }
	        for (int j = 0; j < n2; ++j) {
	            rightArr[j] = arr[middle + 1 + j];
	        }

	        int i = 0, j = 0;

	        int k = left;
	        while (i < n1 && j < n2) {
	            comparisons++;                   // Contador de comparações
	            if (leftArr[i] <= rightArr[j]) {
	                arr[k] = leftArr[i];
	                i++;
	            } else {
	                arr[k] = rightArr[j];
	                j++;
	                swaps += (middle - left + 1 - i); // Contador de trocas
	            }
	            k++;
	        }

	        while (i < n1) {
	            arr[k] = leftArr[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            arr[k] = rightArr[j];
	            j++;
	            k++;
	        }
	    }
	    
	}
