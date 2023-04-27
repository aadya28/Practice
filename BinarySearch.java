//Program to apply binary search in the given array.

import java.io.*;
import java.util.*;

public class BinarySearch{
    // Defining a public static method named "binarySearch" that takes an array, its size and the target as input
    public static int binarySearch(int[] arr , int size , int target){
        // Sorting the array
        Arrays.sort(arr);
    
        // Initializing variables "low" and "high" to define the search range
        int low = 0;
        int high = size-1;
    
        // Implementing the binary search algorithm
        while(low <= high){
            int middle = low+(high-low)/2;
            if(arr[middle] > target)
                high = middle - 1; 
            else if(arr[middle] < target)
                low = middle + 1;
            else
                return middle;
        }
        // Return -1 if target is not found in the array
        return -1;
    }

    // Defining the main method
    public static void main(String[] args) throws IOException {
        // Taking input from user
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array");
            int length = sc.nextInt();
            System.out.println("Enter the number to be found");
            int target = sc.nextInt();
            int[] arr = new int[length];
            System.out.println("Enter the array");
            for(int i = 0 ; i < length ; i++)
              arr[i] = sc.nextInt();
            
            // Calling the binarySearch method to search the target in the array
            int index = binarySearch(arr , length , target);
            if(index != -1)
                System.out.println("Number found at index " + index);
            else
                System.out.println("Target Not Found");
        } 
    }
}


