//First attempt at solving this Problem.
/*There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
become [4,5,6,7,0,1,2,3].
Given the array nums after the possible rotation and an integer target, return the
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.*/
import java.util.Scanner;

public class RotatedArray {
    public static int findPivot(int[] array  ,int endIndex){
        int middle = endIndex/2;
        int min = 0;
        int max = endIndex;
        while (max-min > 1){
            if(array[middle] < array[min]){
                max = middle;
            }
            else if(array[middle] > array[max]) {
                min = middle;
            }
            else{
                return 0;
            }
            middle = (max+min)/2;
        }
        return max;
    }
    public static int findIndex(int[] array , int pivot , int target){
        int min = 0;
        int max = array.length-1;
        while (max-min > 1){
            if(array[pivot] == target){
                return pivot;
            }
            if(array[min] == target){
                return min;
            }
            if(array[max] == target){
                return max;
            }
            if(array[min] < target){
                max = pivot-1;
            }
            if(array[min] > target){
                min = pivot+1;
            }
            pivot = ((max+min)/2);
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lengthOfArray = scan.nextInt();
        int[] array = new int[lengthOfArray];
        for(int i = 0 ; i < lengthOfArray ; i++){
            array[i] = scan.nextInt();
        }
        int testcases = scan.nextInt();
        for(int i = 0; i < testcases ; i++){
            int target = scan.nextInt();
            int pivot = findPivot(array, lengthOfArray-1);
            int result = findIndex(array , pivot , target);
            System.out.println(result);
        }

    }
}
