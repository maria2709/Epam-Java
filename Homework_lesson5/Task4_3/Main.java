package homework4_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = getSize();
		float[] initialArray = createArray(n);
		float[] positiveArray = positiveArray(initialArray);
		float[] negativeArray = negativeArray(initialArray);
		positiveArray(initialArray);
		negativeArray(initialArray);
		System.out.println("Initial array: ");
		printArray(initialArray);
		System.out.println("Positive array: ");
		printArray(positiveArray);
		System.out.println("Negative array: ");
		printArray(negativeArray);
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
		System.out.println();		
	}
	
	public static int countPositive(float array[]) {
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				n++;
			}
		 }
		return n;
	}
	
	public static int countNegative(float array[]) {
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				n++;
			}
		 }
		return n;
	}
	
	public static float[] positiveArray(float array[]) {
		float[] newArray = new float[countPositive(array)];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				newArray[j] = array[i];
				j++;					
			}
		 }
		return newArray;
	}
	
	public static float[] negativeArray(float array[]) {
		float[] newArray = new float[countNegative(array)];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				newArray[j] = array[i];
				j++;					
			}
		 }
		return newArray;
	}
	
}
