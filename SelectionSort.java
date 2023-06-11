// Java program for implementation of Selection Sort
import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Prints the array
    public static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scan.nextInt();
        }
        int[] result = selectionSort(arr);
        printArray(result);
        scan.close();
    }
}