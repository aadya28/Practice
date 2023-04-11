//Program to create a Class Wordplay and several methods in it.
import java.util.Scanner;
import java.util.Set;

public class Wordplay {
    //Program to check if the given character is a vowel 
    public static boolean isVowel(Character alphabet) {
        var vowels = Set.of('a','e','i','o','u','A','E','O','U','I');
        return(vowels.contains(alphabet));
    }

    //Program to replace all vowels in a string with the given character
    public static String replaceVowels(String str , char replaceWith ){
        int stringLength = str.length();
        for (int index = 0 ; index < stringLength ;index++){
            char toreplace = str.charAt(index);
            if (isVowel(toreplace)){
                str = str.replace(toreplace , replaceWith);//replace() replaces character at every occurence
            }
        }
        return str;
    }

    //Program to replace all occurences of the given character in a string with '+' for even and '*' for odd positions
    public static String emphasise(String str , char ch){
        int stringLength = str.length();
        for (int index = 0 ; index < stringLength ;index++){
            char toreplace = str.charAt(index);
            if(toreplace == ch){
                if((index+1)%2 == 0 ){
                    str = str.substring(0, index) + '+' + str.substring(index + 1);
                }
                else{
                    str = str.substring(0, index) + '*' + str.substring(index + 1);
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string for replaceVowels Program");
            String str1 = sc.nextLine();
            System.out.println("Enter the character to replace vowels with");
            char replacewith = sc.nextLine().charAt(0);//There is no nextChar() in Java
            System.out.println(replaceVowels(str1, replacewith));
            System.out.println("Enter the string for Emphasise Program");
            String str2 = sc.nextLine();
            System.out.println("Enter the character to replace");
            char ch = sc.nextLine().charAt(0);
            System.out.println(emphasise(str2, ch));
        }
    }
}
