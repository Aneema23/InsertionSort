package InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        InsertionSort insertionSort = new InsertionSort();

        // Ascending order
        int[] arrAsc = Arrays.copyOf(arr, arr.length);
        insertionSort.insertionSortAsc(arrAsc);
        System.out.println("InsertionSort (Swap) Ascending: " + Arrays.toString(arrAsc));

        // Descending order
        int[] arrDesc = Arrays.copyOf(arr, arr.length);
        insertionSort.insertionSortDesc(arrDesc);
        System.out.println("InsertionSort (Swap) Descending: " + Arrays.toString(arrDesc));

        InsertionSortOP insertionSortOP = new InsertionSortOP();

        // Ascending order
        int[] arrOPAsc = Arrays.copyOf(arr, arr.length);
        insertionSortOP.insertionSortOPAsc(arrOPAsc);
        System.out.println("InsertionSortOP (Optimized) Ascending: " + Arrays.toString(arrOPAsc));

        // Descending order
        int[] arrOPDesc = Arrays.copyOf(arr, arr.length);
        insertionSortOP.insertionSortOPDesc(arrOPDesc);
        System.out.println("InsertionSortOP (Optimized) Descending: " + Arrays.toString(arrOPDesc));

        scanner.close(); 
    }
}
