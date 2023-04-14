/*Program to create a Class CaesarCipher and encrypt the given string with two keys
Sample Input : encryptTwoKeys(“First Legion”, 23, 17) 
Sample Output : “Czojq Ivdzle”.
Explanation : ‘F’ is encrypted with key 23, the first ‘i’ with 17, the ‘r’ with 23 and so on */
import java.util.Scanner;

public class CaesarCipher2 {
    public static void encryptTwoKeys(String input, int key1 , int key2){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet1 = alphabet.substring(key1)+alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2)+alphabet.substring(0,key2);
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
                if(i%2 == 0){
                    if (lc){
                        Character replaceWith = shiftedAlphabet2.charAt(idx);
                        replaceWith = Character.toLowerCase(replaceWith);
                        newstr = newstr + replaceWith;
                        lc = false;
                    }
                    else{
                        char replaceWith = shiftedAlphabet2.charAt(idx);
                        newstr = newstr + replaceWith;
                    }  
                }
                else{
                    if (lc){
                        Character replaceWith = shiftedAlphabet1.charAt(idx);
                        replaceWith = Character.toLowerCase(replaceWith);
                        newstr = newstr + replaceWith;
                        lc = false;
                    }
                    else{
                        char replaceWith = shiftedAlphabet1.charAt(idx);
                        newstr = newstr + replaceWith;
                    }  
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
            int key1 = sc.nextInt();
            int key2 = sc.nextInt();
            encryptTwoKeys(input, key1 , key2);
        }
    }
}