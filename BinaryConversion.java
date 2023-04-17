//Program to convert a decimal number to Binary
import java.util.Scanner;
import java.lang.Math;

public class BinaryConversion {
    public static int binaryConversion(int num){
        int bin = 0 , digit ,counter = 0;
        while(num>0){
            digit = num % 2; 
            if(digit == 0){
                counter++;  //counting the zeroes to added in the end
            }
            else{
                int myInt = (int)Math.pow(10,counter);
                bin = bin + myInt;  
                //adding before the previous value. Example - last iteration for decimal value 24
                //11000 = 1000 + 10000
                counter++;
            }
            num = num/2;
        }
        return bin;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            System.out.println(binaryConversion(num));
        }
    }
}