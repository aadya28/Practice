//Program to count the maximum distinct numbers in the given array.
import java.util.Scanner;

public class MaxDistinct{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthOfArray = scan.nextInt();
        int[] array = new int[lengthOfArray];
        for(int i = 0 ;i < lengthOfArray ; i++){
            array[i] = scan.nextInt();
        }
        int maxDistinct = array.length;
        for (int i : array) {
            int counter = 1;
            for (int j : array) {
                if (i != j) {
                    counter += 1;
                }
            }
            if (maxDistinct > counter) {
                maxDistinct = counter;
            }
        }
        System.out.println(maxDistinct);
    }
}