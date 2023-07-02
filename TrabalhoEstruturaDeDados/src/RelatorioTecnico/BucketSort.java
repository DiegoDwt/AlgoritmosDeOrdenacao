package RelatorioTecnico;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	
	  private static int comparisons;
	    private static int swaps;

	    public static int[] bucketSort(int[] arr, int numBuckets) {
	        comparisons = 0;
	        swaps = 0;

	        int min = findMinValue(arr);
	        int max = findMaxValue(arr);

	        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(numBuckets);
	        for (int i = 0; i < numBuckets; i++) {
	            buckets.add(new ArrayList<>());
	        }

	        for (int i = 0; i < arr.length; i++) {
	            int bucketIndex = mapToBucketIndex(arr[i], min, max, numBuckets);
	            buckets.get(bucketIndex).add(arr[i]);
	        }

	        int currentIndex = 0;
	        for (ArrayList<Integer> bucket : buckets) {
	            Collections.sort(bucket);
	            for (int value : bucket) {
	                arr[currentIndex] = value;
	                currentIndex++;
	                swaps++;         // Contador de Trocas
	            }
	        }

	        return new int[] { comparisons, swaps };
	    }

	    private static int findMinValue(int[] arr) {
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            comparisons++;    // Contador de Comparações
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }

	    private static int findMaxValue(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            comparisons++;      // Contador de Comparações
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }

	    private static int mapToBucketIndex(int value, int min, int max, int numBuckets) {
	        return (int) ((double) (value - min) / (max - min + 1) * numBuckets);
	    }
}
