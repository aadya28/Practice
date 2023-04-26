//Program to implement the Bubble Sort algorithm to sort an array of integers in ascending order.
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    
    public static int[] bubbleSort(int[] arr , int size){
    // Initialize the endIndex variable to size-1, which represents the index of the last element in the array
    int endIndex = size-1;
    // Start a loop that will iterate size-1 times (i.e., up to the second-to-last element in the array)
    for(int i = 0 ; i < endIndex ; i++){
        // Within this loop, start another loop that will iterate up to endIndex-i.
        // This is because the largest element in the array will "bubble up" to the end of the array after each pass, so there is no need to compare it again.
        for(int j = 0 ; j < endIndex-i ; j++){
            // Within the inner loop, compare the current element (arr[j]) with the next element (arr[j+1]). 
            // If the current element is greater than the next element, swap them using a temporary variable.
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        } 
    }
    // After both loops complete, return the sorted array.
    return arr;
}

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array");
            int length = sc.nextInt();
            int[] arr = new int[length];
            System.out.println("Enter the array");
            for(int i = 0 ; i < length ; i++){
                arr[i] = sc.nextInt();
            }
            int[] sortedArray = bubbleSort(arr , length);
            System.out.println(Arrays.toString(sortedArray));
        }
    }
}
