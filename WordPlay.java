//Program to check if the input character is vowel or not
import java.util.Scanner;

public class WordPlay {
    public static void isVowel(Character c) {
        Character[] charArray = {'a','e','i','o','u','A','E','O','U','I'};
        boolean contains = false; //contains() only works on list
        for (char ch : charArray) {
            if (ch == c) {
                contains = true;
                break;
            }
        }
        System.out.println(contains);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char c = sc.next().charAt(0); //There is no nextChar() in Java
            isVowel(c);
        }
    }
}