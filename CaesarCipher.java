//Program to create a Class CaesarCipher and several methods in it.
import java.util.Scanner;

public class CaesarCipher {
    /* This method returns a String that has been encrypted using the Caesar Cipher 
    For Example - Sample Input: encrypt(“First Legion”, 17) 
    Sample Output : “Wzijk Cvxzfe” */
    
    public static void encrypt(String input , int key){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key);
        int length = input.length();
        String newstr = "";
        Boolean lc = false;
        for (int i = 0; i < length;i++){
            Character toReplace = input.charAt(i);
            if(Character.isLowerCase(toReplace)){
                toReplace = Character.toUpperCase(toReplace);
                lc = true;
            }
            int idx  = alphabet.indexOf(toReplace);
            if (idx != -1){
                if (lc){
                    Character replaceWith = shiftedAlphabet.charAt(idx);
                    replaceWith = Character.toLowerCase(replaceWith);
                    newstr = newstr + replaceWith;
                    lc = false;
                }
                else{
                    char replaceWith = shiftedAlphabet.charAt(idx);
                    newstr = newstr + replaceWith;
                }  
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