import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num){
        for (int divisor = 2 ; divisor <= (num/2); divisor++){
            if (num % divisor == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the starting range");
            int start = sc.nextInt();
            System.out.println("Enter the ending range");
            int end = sc.nextInt();
            for (int num = start; num <= end ; num++){
                if(isPrime(num)){
                    System.out.println(num);
                }  
            }
        }
    }
}