//Program to create a Class CaesarCipher and several methods in it.
import java.util.Scanner;

public class CaesarCipher {
    /* This method returns a String that has been encrypted using the Caesar Cipher 
    For Example - Sample Input: encrypt(“FIRST LEGION ATTACK EAST FLANK!”, 23)
    Sample Output : “CFOPQ IBDFLK XQQXZH BXPQ CIXKH!” */
    
    public static void encrypt(String input , int key){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key);
        int length = input.length();
        String newstr = "";
        for (int i = 0; i < length;i++){
            char toReplace = input.charAt(i);
            int idx  = alphabet.indexOf(toReplace);
            if (idx != -1){
                char replaceWith = shiftedAlphabet.charAt(idx);
                newstr = newstr + replaceWith;
            }
            else{
                newstr = newstr + input.charAt(i);
            }
        }
        System.out.println(newstr);
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            int key = sc.nextInt();
            encrypt(input, key);
        }
    }
}