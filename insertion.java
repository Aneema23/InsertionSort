/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InsertionSort;

import java.util.Arrays;

/**
 *
 * @author sanda
 */
public class insertion {

    
    public void insertionSortAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }
   // Method for descending order insertion sort using swap
    public void insertionSortDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] < arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }
  
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  
    public void insertionSortOPAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
   
    public void insertionSortOPDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
        public static void main(String[] args) {
        int[] arr = {4,8,3,9,1,6};
        
       
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
    }

}
