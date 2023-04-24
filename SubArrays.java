//Program to find all the subarrays of a given array

import java.io.*;
import java.util.*;

public class SubArrays {

    public static void printSubArray( int lengthOfArr , int Arr[]) {     
    for(int sizeOfArrays = 1 ; sizeOfArrays <= lengthOfArr ; sizeOfArrays++) {    //Determines the size of array
        int numOfArrays = lengthOfArr-sizeOfArrays+1;
        for(int startIndex = 0 ; startIndex < numOfArrays ; startIndex++) {    //Determines the number of arrays of a particular size
            int endIndex = startIndex+sizeOfArrays;
            System.out.print("[");  
            for (int element = startIndex ; element < endIndex ; element++) {    //Prints the array elements     
                System.out.print(" "+Arr[element]+" ");   
            }
            System.out.println("]");
        }
    }
    }    

    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int lengthOfArr = sc.nextInt();
            int[] Arr = new int[lengthOfArr];
            for (int i = 0 ; i < lengthOfArr ; i++) {
                Arr[i]=sc.nextInt();
            }
            printSubArray(lengthOfArr , Arr);
        }
    }
}
