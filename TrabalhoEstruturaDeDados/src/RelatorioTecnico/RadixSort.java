package RelatorioTecnico;

import java.util.Arrays;

public class RadixSort {
	
	private static int comparisons;
    private static int swaps;

    public static int[] radixSort(int[] arr, int size) {
        comparisons = 0;
        swaps = 0;

        int max = getMaxValue(arr, size);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, size, exp);
        }

        return new int[] { comparisons, swaps };
    }

    private static void countingSort(int[] arr, int size, int exp) {
        int[] output = new int[size];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < size; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;   
            swaps++;         // Contador de Trocas
        }

        for (int i = 0; i < size; i++) {
            arr[i] = output[i];
            swaps++;        // Contador de Trocas
        }
    }

    private static int getMaxValue(int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            comparisons++;         // Contador de Comparações
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    
    
}
