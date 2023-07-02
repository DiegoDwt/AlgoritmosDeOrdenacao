package RelatorioTecnico;

import java.util.Arrays;
import java.util.Random;


public class TestesRelatorio {
	
	
	    public static void main(String[] args) {
	        int[] sizes = {100000, 1000000};
	        for (int size : sizes) {
	        	System.out.println("**Quick Sort**");             //  Nome do Algoritmo a ser testado
	            System.out.println("Tamanho Array: " + size);
	            
	            int[] sortedArray = new int[size];
	            int[] reversedArray = new int[size];
	            int[] randomArray = new int[size];
	            Random random = new Random();
	            
	            for (int i = 0; i < size; i++) {
	                sortedArray[i] = i;
	                reversedArray[i] = size - i;
	                randomArray[i] = random.nextInt(size);
	            }
	            
	            analyzePerformance("Array Ordenado", sortedArray);
	            analyzePerformance("Array Invertido", reversedArray);
	            analyzePerformance("Array Aleatório", randomArray);
	            System.out.println("-----------------------------");
	        }
	    }

	    private static void analyzePerformance(String type, int[] array) {
	        int[] tempArray = Arrays.copyOf(array, array.length);
	        long startTime = System.currentTimeMillis();
	        int[] result = QuickSort.quickSort(tempArray, tempArray.length);     // Classe do Algoritmo
	        long endTime = System.currentTimeMillis();
	        System.out.println(type + " - Comparações: " + result[0] + " - Trocas: " + result[1] + " - Tempo: " + (endTime - startTime) + " ms");
	    }
	}