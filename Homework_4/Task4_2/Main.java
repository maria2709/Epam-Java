package homework4_2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int size = getSize();
		float[] array1 = createArray(size);
		float[] array2 = createArray(size);
		float[] result = sumOfArrays(array1, array2);
		System.out.println("First array:");
		printArray(array1);
		System.out.println("\nSecond array:");	    
		printArray(array2);
		System.out.println("\nThe result of summarizing:");
		printArray(result);
	}

	public static int getSize() {
		System.out.println("Enter a size of arrays: ");
	      	Scanner scan = new Scanner(System.in);
	      	int n = scan.nextInt();
	      	return n;
	}
	
	public static float[] createArray(int n) {
		float[] array = new float[n];
		Random randomize = new Random();
		for (int i =0; i < array.length; i++) {
			array[i] = randomize.nextFloat()*100-50;
		}
		return array;
	}
	
	public static void printArray(float array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
	    }
	}
	
	public static float[] sumOfArrays(float array1[], float array2[]) {
		float[] result = new float[array1.length];
		for (int i =0; i < array1.length; i++) {
			result[i] = array1[i]+array2[i];
		}
		
		return result;
	}
}
