package hometask4_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Maryia_Gaydayenko on 10/25/2019.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = createArray(getSize());
        outputArray(array);
        outputReverseArray(array);

    }

    public static int getSize() {
        System.out.println("Enter a size of array: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
    }

    public static int[] createArray (int n) {
        int[] myArray = new int[n];
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(100)-50;
        }

        return myArray;
    }

    public static void outputArray (int[] array) {
        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
        }
    }

    public static void outputReverseArray (int[] array){
        System.out.println("\nReversed array:");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.printf("%4d", array[i]);
        }
    }
}
